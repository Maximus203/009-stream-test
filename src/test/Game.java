package test;

import java.io.Serializable;

public class Game implements Serializable{
	private String nom;
	private String style;
	private double prix;
	public Game(String nom, String style, double prix) {
		super();
		this.nom = nom;
		this.style = style;
		this.prix = prix;
	}
	
	public String toString() {
		return "Game [nom=" + nom + ", style=" + style + ", prix=" + prix + "]";
	}
	

}
