package org.acme.quickstart;

import com.arangodb.Protocol;
import io.quarkus.test.junit.QuarkusTestProfile;

import java.util.Collections;
import java.util.Map;

public class ProtocolProfile {
    public static class VST implements QuarkusTestProfile {
        @Override
        public Map<String, String> getConfigOverrides() {
            return Collections.singletonMap("adb.protocol", Protocol.VST.toString());
        }
    }

    public static class HTTP2_JSON implements QuarkusTestProfile {
        @Override
        public Map<String, String> getConfigOverrides() {
            return Collections.singletonMap("adb.protocol", Protocol.HTTP2_JSON.toString());
        }
    }

    public static class HTTP_VPACK implements QuarkusTestProfile {
        @Override
        public Map<String, String> getConfigOverrides() {
            return Collections.singletonMap("adb.protocol", Protocol.HTTP_VPACK.toString());
        }
    }
}
