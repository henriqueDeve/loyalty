package org.sistem.controller;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.bson.types.ObjectId;
import org.sistem.Service.CorporateService;
import org.sistem.entity.Corporate;

@Path("/corporate")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CorporateController {

    @Inject
    public CorporateService corporateService;

    @POST
    public Uni<Response> createCorporate(Corporate corporate) {
        return corporateService.createCorporate(corporate);
    }

    @GET
    @Path("/{_id}")
    public Uni<Void> findCorporateById(@PathParam("_id") ObjectId _id) {
        return corporateService.findCorporateById(_id);
    }
}
