package org.acme.quickstart;

import com.arangodb.async.ArangoDBAsync;
import org.eclipse.microprofile.config.inject.ConfigProperties;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

/**
 * @author Michele Rastelli
 */
@Dependent
public class ArangoAsyncProvider {

    @Produces
    public ArangoDBAsync arangoDBAsync(@ConfigProperties final ArangoConfig config) {
        return new ArangoDBAsync.Builder()
                .loadProperties(config)
                .build();
    }

}
