package org.sistem.repository;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.pgclient.PgPool;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.sqlclient.RowSet;
import io.vertx.mutiny.sqlclient.Tuple;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.sistem.model.Corporate;

@ApplicationScoped
public class CorporateRepository {

    @Inject
    PgPool client;


    private Corporate from(Row row) {
        Corporate corporate = new Corporate();
        corporate.setId(row.getLong("id"));
        corporate.setName(row.getString("name"));
        corporate.setCode(row.getString("code"));
        corporate.setCnpj(row.getString("cnpj"));
        corporate.setEmail(row.getString("email"));
        corporate.setPassword(row.getString("password"));
        return corporate;
    }

    private Tuple to(Corporate corporate) {
        return Tuple.of(
                corporate.getName(),
                corporate.getCode(),
                corporate.getCnpj(),
                corporate.getEmail(),
                corporate.getPassword()
        );
    }

    public Uni<Corporate> findCorporateById(Long id) {
        Uni<RowSet<Row>> uniCorporate = client.preparedQuery("SELECT * FROM corporate WHERE id = $1")
                .execute(Tuple.of(id));
        return uniCorporate
                .onItem()
                .transform(it -> it.iterator().hasNext() ? from(it.iterator().next()) : null);
    }

    public Multi<Corporate> findAllCorporate() {
        Uni<RowSet<Row>> multiCorporate = client.query("SELECT * FROM corporate")
                .execute();
        return multiCorporate
                .onItem()
                .transformToMulti(Multi.createFrom()::iterable)
                .onItem().transform(this::from);
    }

    public Uni<Corporate> createCorporate(Corporate corporate) {
        Tuple tuple = to(corporate);
        Uni<RowSet<Row>> uniCreateCorporate =
                client.preparedQuery("INSERT INTO corporate " +
                        "(name, code, cnpj, email, password) VALUES ($1, $2, $3, $4, $5)  RETURNING id")
                        .execute(tuple);

        return uniCreateCorporate
                .onItem()
                .transform(it -> it.iterator().hasNext() ? it.iterator().next() : null)
                .chain(res -> Uni.createFrom().item(from(res)));
    }

//
//    public Uni<Response> removeCorporate() {
//    }
}
