package org.sistem.Mongo;

import io.quarkus.mongodb.reactive.ReactiveMongoClient;
import io.quarkus.mongodb.reactive.ReactiveMongoCollection;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bson.Document;

@ApplicationScoped
public class MongoCollections {

    @Inject
    ReactiveMongoClient mrBellyMongoClient;

    public ReactiveMongoCollection<Document> getCorporateCollection() {
        return mrBellyMongoClient.getDatabase("loyalty").getCollection("corporate");
    }
    public ReactiveMongoCollection<Document> getCustomerCollection() {
        return mrBellyMongoClient.getDatabase("loyalty").getCollection("corporate");
    }

}
