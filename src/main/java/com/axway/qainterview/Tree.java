package com.axway.qainterview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tree extends Graph {
    private Map<Vertex, Vertex> parents;

    Tree() {
        super();
        this.parents = new HashMap<>();
    }

    public void addNode(String label) {
        super.addVertex(label);
    }

    public void removeNode(String label) {
        super.removeVertex(label);
    }

    public void setParent(String label, String parent) {
        Vertex vertex = new Vertex(label);
        Vertex pvertex = new Vertex(parent);
        parents.put(vertex, pvertex);
    }

    public Vertex getParent (String label) {
        Vertex vertex = new Vertex(label);
        return parents.get(vertex);
    }

    public void addChild(String label, String child) {
        Vertex vertex = new Vertex(label);
        Vertex cvertex = new Vertex(child);
        super.getAdjVertices(label).add(cvertex);
    }

    public List<Vertex> getChildren(String label) {
        return super.getAdjVertices(label);
    }

    public void removeChild(String label, String child) {
        Vertex vertex = new Vertex(label);
        Vertex cvertex = new Vertex(child);
        super.getAdjVertices(label).remove(cvertex);
    }

    public void toString(String label) {
        System.out.print("\nChildren of node " + label + ": ");
        for(int i = 0; i < this.getChildren(label).size(); i++) {
            System.out.print(this.getChildren(label).get(i) + " ");
        }
        System.out.print("\n" + "Parent of node " + label + ": ");
        System.out.println(this.getParent(label));
    }


}
