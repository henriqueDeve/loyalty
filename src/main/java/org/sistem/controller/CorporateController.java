package org.sistem.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.sistem.service.CorporateService;

@Path("/corporate")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CorporateController {

    @Inject
    public CorporateService corporateService;

//    @POST
//    public Uni<Response> createCorporate(Corporate corporate) {
//        return corporateService.createCorporate(corporate);
//    }
//
//    @GET
//    @Path("/{id}")
//    public Uni<Void> findCorporateById(@PathParam("id") Long id) {
//        return corporateService.findCorporateById(id);
//    }
}
