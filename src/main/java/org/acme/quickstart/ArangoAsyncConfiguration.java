package org.acme.quickstart;

import com.arangodb.async.ArangoDBAsync;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

/**
 * @author Michele Rastelli
 */
@Dependent
public class ArangoAsyncConfiguration {

    @Produces
    public ArangoDBAsync arangoDBAsync() {
        return new ArangoDBAsync.Builder()
                .host("127.0.0.1", 8529)
                .password("test")
                .build();
    }

}
