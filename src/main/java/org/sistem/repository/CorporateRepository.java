package org.sistem.repository;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.pgclient.PgPool;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jose4j.http.Response;
import org.sistem.model.Corporate;
import org.sistem.model.CorporateConfiguration;

@ApplicationScoped
public class CorporateRepository {

    @Inject
    PgPool pgPool;

    public Uni<Corporate> findCorporateById() {}

    public Multi<Corporate> findAllCorporate() {}

    public Uni<CorporateConfiguration> findCorporateConfigByCorporateId () {}

    public Uni<Response> createCorporate() {}

    public Uni<Response> updateCorporateConfiguration() {}

    public Uni<Response> removeCorporate() {}
}
