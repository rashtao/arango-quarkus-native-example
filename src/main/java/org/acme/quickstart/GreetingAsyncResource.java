package org.acme.quickstart;

import com.arangodb.entity.ArangoDBVersion;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.CompletableFuture;

@Path("/versionAsync")
public class GreetingAsyncResource {

    private final ArangoAsyncService arangoService;

    @Inject
    public GreetingAsyncResource(ArangoAsyncService arangoService) {
        this.arangoService = arangoService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CompletableFuture<ArangoDBVersion> getVersion() {
        return arangoService.getVersion();
    }
}
