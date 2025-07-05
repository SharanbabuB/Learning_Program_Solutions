package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest1 {

    @Mock
    ExternalApi mockApi;

    @Test
    public void testVerifyInteraction() {
        // Arrange
        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();

        // Assert / Verify that getData() was called once
        verify(mockApi).getData(); // Verifies that mockApi.getData() was called exactly once
    }
}
