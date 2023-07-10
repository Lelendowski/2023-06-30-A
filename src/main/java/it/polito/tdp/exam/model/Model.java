package it.polito.tdp.exam.model;

import java.util.ArrayList;

import it.polito.tdp.exam.db.BaseballDAO;

public class Model {
	
	BaseballDAO bDAO ;
	ArrayList<Team> listaTeam ;
	
	public Model() {
		this.bDAO = new BaseballDAO();
		this.listaTeam = new ArrayList<>(bDAO.readAllTeams());
	}

	public ArrayList<String> getNomiTeam() {
		ArrayList<String> result = new ArrayList<>();
		for (Team t : listaTeam) {
			result.add(t.getName());
		}
		return result;
	}
	
}


