package org.acme.quickstart;

import com.arangodb.async.ArangoDBAsync;
import com.arangodb.entity.ArangoDBVersion;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;

/**
 * @author Michele Rastelli
 */
@ApplicationScoped
public class ArangoAsyncService {

    private final ArangoDBAsync arango;

    @Inject
    public ArangoAsyncService(final ArangoDBAsync arango) {
        this.arango = arango;
    }

    public CompletableFuture<ArangoDBVersion> getVersion() {
        return arango.getVersion();
    }

}
