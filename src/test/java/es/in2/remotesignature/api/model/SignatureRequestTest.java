package es.in2.remotesignature.api.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SignatureRequestTest {

    @Test
    void testGetterAndSetter() {
        // Create a SignatureRequest object
        SignatureConfiguration configuration = SignatureConfiguration.builder().build();

        SignatureRequest signatureRequest = SignatureRequest.builder()
                .configuration(configuration)
                .data("{\"username\":\"alfresco123\", \"age\": 25}")
                .build();

        assertEquals(configuration, signatureRequest.configuration());
        assertEquals("{\"username\":\"alfresco123\", \"age\": 25}", signatureRequest.data());
    }

}
