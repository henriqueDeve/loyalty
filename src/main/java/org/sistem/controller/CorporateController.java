package org.sistem.controller;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.bson.types.ObjectId;
import org.sistem.service.CorporateService;
import org.sistem.model.Corporate;

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
    @Path("/{id}")
    public Uni<Void> findCorporateById(@PathParam("id") Long id) {
        return corporateService.findCorporateById(id);
    }
}
