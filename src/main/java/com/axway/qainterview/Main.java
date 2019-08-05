package com.axway.qainterview;

import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Graph graph = new Graph();
		graph.addVertex("1");
		graph.addVertex("2");
		graph.addVertex("3");
		graph.addVertex("4");
		graph.addVertex("5");
		graph.addVertex("6");

		graph.addEdge("1", "5");
		graph.addEdge("2", "3");
		graph.addEdge("5", "4");
		graph.addEdge("4", "3");
		graph.addEdge("1", "6");

		System.out.print("BFS: ");
		Set<String> traversal = GraphTraversal.breadthFirstTraversal(graph, "1");
		for (String key : traversal) {
			System.out.print(key + " ");
		}
		System.out.print("\n" + "DFS: ");
		Set<String> dfs_traversal = GraphTraversal.depthFirstTraversal(graph, "1");
		for (String key : dfs_traversal) {
			System.out.print(key + " ");
		}

		Tree tree = new Tree();
		tree.addNode("1");
		tree.addNode("2");
		tree.addNode("3");

		tree.addChild("1", "2");
		tree.addChild("1", "3");
		tree.setParent("1",  null);
		tree.setParent("2", "1");
		tree.setParent("3", "1");
		tree.toString("2");
	}

}
