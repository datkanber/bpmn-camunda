package com.burak.opeva.service;

import com.opeva.service.UpdateMapService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class UpdateMapServiceTest {

    private UpdateMapService service;
    private DelegateExecution execution;

    @BeforeEach
    void setUp() {
        service = new UpdateMapService();
        execution = mock(DelegateExecution.class);
    }

    @Test
    void shouldExecuteWithoutErrors() throws Exception {
        // When
        service.execute(execution);

        // Then
        verifyNoMoreInteractions(execution); // çünkü bu servis sadece log atıyor
    }
}
