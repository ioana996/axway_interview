package com.axway.restservice.entity;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Vertex {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "vertex")
    private String vertex;
    @ElementCollection
    @CollectionTable(name = "neighbours", joinColumns = @JoinColumn(name = "vertex_id"))
    @Column(name = "neighbours")
    private List<String> adjVertices = new LinkedList<>();

    public String getVertex() {
        return this.vertex;
    }

    public void setVertex(String vertex) {
        this.vertex = vertex;
    }

    public List<String> getAdjVertices() {
        return this.adjVertices;
    }

    public void setAdjVertices(List<String> adjVertices) {
        this.adjVertices = adjVertices;
    }

    @Override
    public String toString() {
        return "Vertex{" + "label = " + vertex + "}";
    }
}
