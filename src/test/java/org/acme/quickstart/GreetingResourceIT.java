package org.acme.quickstart;

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
class VstGreetingResourceIT extends VstGreetingResourceTest {
    // Execute the same tests but in packaged mode.
}

@QuarkusIntegrationTest
class HttpVPackGreetingResourceIT extends HttpVPackGreetingResourceTest {
    // Execute the same tests but in packaged mode.
}

@QuarkusIntegrationTest
class Http2JsonGreetingResourceIT extends Http2JsonGreetingResourceTest {
    // Execute the same tests but in packaged mode.
}
