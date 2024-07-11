package org.sistem.Utils;


import jakarta.ws.rs.core.Response;

import java.net.URI;

public class ResponseUtils {

    public static Response notFound(String message) {
        return Response.status(404, message).build();
    }

    public static Response create(Object obj) {
        return Response.created(URI.create(JsonUtils.toJson(obj))).build();
    }

    public static Response okAndEntity(Object obj) {
        return Response.ok(obj).build();
    }

    public static Response ok() {
        return Response.ok().build();
    }

    public static Response notAccess(String message) {
        return Response.status(401, message).build();
    }
}
