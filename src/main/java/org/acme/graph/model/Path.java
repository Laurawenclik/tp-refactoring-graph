package org.acme.graph.model;

import java.util.ArrayList;
import java.util.List;

public class Path {
	/**
	 * 
	 */
	private List<Edge> edges;

	public Path() {
		super();
		this.edges = new ArrayList<Edge>();
	}

	public List<Edge> getEdges() {
		return edges;
	}
	
	public void addEdge(Edge edge) {
		this.edges.add(edge);
	}
	
	
	
	

}
