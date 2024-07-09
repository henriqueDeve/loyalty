package org.sistem.Service;

import Utils.JsonUtils;
import io.quarkus.logging.Log;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.sistem.Mongo.MongoCollections;
import org.sistem.entity.Corporate;

import java.net.URI;

@ApplicationScoped
public class CorporateService {

    @Inject
    MongoCollections mongoCollections;

    public Uni<Response> createCorporate(Corporate corporate) {
        Document document = Document.parse(JsonUtils.toJson(corporate));

        return mongoCollections.getCorporateCollection().insertOne(document)
                .chain(() -> {
                    return Uni.createFrom().item(Response.created(URI.create("Empresa salva com sucesso")).build());
                })
                .onFailure().invoke(throwable -> {
                    Log.error("Erro ao salvar empresa " + corporate.getName());
                });
    }

    public Uni<Void> findCorporateById(ObjectId _id) {
    }
}
