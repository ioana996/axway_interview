package com.axway.qainterview;

import java.util.*;

public class GraphTraversal {

	public static Set<String> breadthFirstTraversal(Graph graph, String root) {
		Set<String> visited = new LinkedHashSet<>();
		Queue<String> queue = new LinkedList<>();
		queue.add(root);
		visited.add(root);
		while (!queue.isEmpty()) {
			String vertex = queue.poll();
			for (Graph.Vertex v : graph.getAdjVertices(vertex)) {
				if (!visited.contains(v.label)) {
					visited.add(v.label);
					queue.add(v.label);
				}
			}
		}
		return visited;
	}

	public static Set<String> depthFirstTraversal(Graph graph, String root) {
		Set<String> visited = new LinkedHashSet<>();
		Stack<String> stack = new Stack<>();
		stack.add(root);
		visited.add(root);
		while (!stack.isEmpty()) {
			String vertex = stack.pop();
			visited.add(vertex.toString());
			for (Graph.Vertex v : graph.getAdjVertices(vertex)) {
				if (!visited.contains(v.label)) {
					stack.push(v.label);
				}
			}
		}
		return visited;
	}


}
