package com.burak.opeva.service;

import com.opeva.service.SendRoutingMLToCloudDelegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class SendRoutingMLToCloudDelegateTest {

    private SendRoutingMLToCloudDelegate delegate;
    private DelegateExecution execution;

    @BeforeEach
    void setUp() {
        delegate = new SendRoutingMLToCloudDelegate();
        execution = mock(DelegateExecution.class);
    }

    @Test
    void shouldLogRoutingMLData() throws Exception {
        // Given
        when(execution.getVariable("routingML")).thenReturn("<routingML>sample</routingML>");

        // When
        delegate.execute(execution);

        // Then
        verify(execution, times(1)).getVariable("routingML");
    }
}
