package org.acme.graph.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vividsolutions.jts.geom.Coordinate;

/**
 * 
 * Un sommet dans un graphe
 * 
 * @author MBorne
 *
 */
public class Vertex {

	/**
	 * Identifiant du sommet
	 */
	private String id;

	/**
	 * Position du sommet
	 */
	private Coordinate coordinate;

	/**
	 * dijkstra - coût pour atteindre le sommet
	 */
	private double cost;
	/**
	 * dijkstra - arc entrant avec le meilleur coût
	 */
	private Edge reachingEdge;
	/**
	 * dijkstra - indique si le sommet est visité
	 */
	private boolean visited;
	
	/**
	 * arc entrant
	 */
	private List<Edge> inEdges = new ArrayList<Edge>();
	
	/**
	 * arc sortant
	 */
	private List<Edge> outEdges = new ArrayList<Edge>();


	public Vertex() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@JsonIgnore
	public Edge getReachingEdge() {
		return reachingEdge;
	}

	public void setReachingEdge(Edge reachingEdge) {
		this.reachingEdge = reachingEdge;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	/**
	 * 
	 * @return inEdges
	 */
	public Collection<Edge> getInEdges(){
		return inEdges;
	}

	/**
	 * 
	 * @return outEdges
	 */
	public Collection<Edge> getOutEdges(){
		return outEdges;
	}
	
	/**
	 * ajout arc sortant
	 * @param outEdge
	 */
	protected void addOutEdge(Edge outEdge) {
		this.outEdges.add(outEdge);
	}

	/**
	 * ajout arcs entrant
	 * @param inEdge
	 */
	protected void addInEdge(Edge inEdge) {
		this.inEdges.add(inEdge);

	}
	@Override
	public String toString() {
		return id;
	}

}
