package org.sistem.repository;

import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.pgclient.PgPool;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.sqlclient.RowSet;
import io.vertx.mutiny.sqlclient.Tuple;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.sistem.enums.CorporateModel;
import org.sistem.enums.Integration;
import org.sistem.enums.SocialNetwork;
import org.sistem.enums.TypeScore;
import org.sistem.model.CorporateConfiguration;

import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class CorporateConfigurationRepository {

    @Inject
    PgPool client;

    public CorporateConfiguration from(Row row) {
        CorporateConfiguration configuration = new CorporateConfiguration();
        configuration.setId(row.getLong("id"));
        configuration.setCorporateId(row.getLong("corporate_id"));
        configuration.setTypeScores(convertToTypeScores(row.getString("type_scores")));
        configuration.setMonthlyExpirationDate(row.getInteger("monthly_expiration_date"));
        configuration.setSocialNetworks(convertToSocialNetworks(row.getString("social_networks")));
        configuration.setMinimum(row.getBoolean("minimum"));
        configuration.setMaximum(row.getBoolean("maximum"));
        configuration.setValueMin(row.getInteger("value_min"));
        configuration.setValueMax(row.getInteger("value_max"));
        configuration.setSendEmail(row.getBoolean("send_email"));
        configuration.setSendWhatsapp(row.getBoolean("send_whatsapp"));
        configuration.setDiscountMax(row.getInteger("discount_max"));
        configuration.setCorporateModel(convertToCorporateModel(row.getString("corporate_model")));
        configuration.setIntegrations(convertToIntegrations(row.getString("integrations")));
        return configuration;
    }

    private static List<TypeScore> convertToTypeScores(String typeScores) {
        return Arrays.stream(typeScores.split(","))
                .map(TypeScore::valueOf)
                .toList();
    }

    private static List<SocialNetwork> convertToSocialNetworks(String socialNetworks) {
        return Arrays.stream(socialNetworks.split(","))
                .map(SocialNetwork::valueOf)
                .toList();
    }

    private static List<CorporateModel> convertToCorporateModel(String corporateModel) {
        return Arrays.stream(corporateModel.split(","))
                .map(CorporateModel::valueOf)
                .toList();
    }

    private static List<Integration> convertToIntegrations(String integrations) {
        return Arrays.stream(integrations.split(","))
                .map(Integration::valueOf)
                .toList();
    }

    public Uni<CorporateConfiguration> findCorporateConfigByCorporateId(Long id) {
        Uni<RowSet<Row>> uniCorporateConfig =
                client.preparedQuery(
                                "SELECT * FROM corporate_configuration " +
                                        "LEFT JOIN corporate on corporate.id = corporate_configuration.id" +
                                        "WHERE corporate.id = $1")
                        .execute(Tuple.of(id));
        return uniCorporateConfig
                .onItem()
                .transform(it -> it.iterator().hasNext() ? from(it.iterator().next()) : null);
    }


//    public Uni<Response> updateCorporateConfiguration() {
//        Uni<RowSet<Row>> uniUpdateCorporateConfig =
//                client.preparedQuery()
//    }

}
