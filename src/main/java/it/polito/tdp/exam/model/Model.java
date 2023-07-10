package it.polito.tdp.exam.model;

import java.util.ArrayList;
import java.util.HashMap;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.exam.db.BaseballDAO;

public class Model {
	
	BaseballDAO bDAO ;
	ArrayList<Team> listaTeam ;
	ArrayList<String> listaNomiTeam;
	HashMap<String, Team> mappaTeam ;
	Graph<Integer, DefaultWeightedEdge> grafo;
	
	public Model() {
		this.bDAO = new BaseballDAO();
		this.listaNomiTeam = new ArrayList<>(bDAO.getNomiSquadre());
		this.listaTeam = new ArrayList<>(bDAO.readAllTeams());
		this.grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		for(Team t : listaTeam) {
			mappaTeam.put(t.getName(), t);
		}
	}

	public void creaGrafo(String nomeTeam, int anno) {
		Team team = mappaTeam.get(nomeTeam);
	}
	
	public ArrayList<String> getNomiTeam() {
		ArrayList<String> result = new ArrayList<>();
		for (Team t : listaTeam) {
			result.add(t.getName());
		}
		return result;
	}
	
}


