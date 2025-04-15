package com.burak.opeva.service;

import com.opeva.service.RoutingMLConversionDelegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class RoutingMLConversionDelegateTest {

    private RoutingMLConversionDelegate routingMLConversionDelegate;
    private DelegateExecution execution;

    @BeforeEach
    void setUp() {
        routingMLConversionDelegate = new RoutingMLConversionDelegate();
        execution = mock(DelegateExecution.class);
    }

    @Test
    void shouldConvertGeoJsonToRoutingML() throws Exception {
        // Given
        String geojsonInput = "{\"type\": \"FeatureCollection\"}";
        when(execution.getVariable("geojsonData")).thenReturn(geojsonInput);

        // When
        routingMLConversionDelegate.execute(execution);

        // Then
        String expectedRoutingML = "<routingML>{\"type\": \"FeatureCollection\"}</routingML>";
        verify(execution, times(1)).setVariable("routingML", expectedRoutingML);
    }
}
