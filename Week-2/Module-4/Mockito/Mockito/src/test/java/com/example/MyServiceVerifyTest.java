package com.example;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Exercise 2: Verifying Interactions
 * - Create a mock of ExternalApi
 * - Inject it into MyService
 * - Call fetchData()
 * - Verify that getData() was called on the mock
 */
public class MyServiceVerifyTest {

    private ExternalApi mockApi;
    private MyService service;

    @Before
    public void setUp() {
        // Arrange: Create mock
        mockApi = mock(ExternalApi.class);
        service = new MyService(mockApi);
    }

    @Test
    public void testVerifyInteraction() {
        // Act
        service.fetchData();

        // Assert - verify that getData() was called on the mock
        verify(mockApi).getData();
    }
}
