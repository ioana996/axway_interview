package com.axway.restservice.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VertexControllerTest {

    @Test
    public void testFind() {
        VertexController vertexController = new VertexController();
        assertEquals(4, vertexController.find(5).getVertex());
    }
}
