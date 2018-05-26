package br.com.db1.stat.test;

import br.com.db1.stat.classes.Basquete;
import br.com.db1.stat.classes.Futebol;

public class EspoteTest {

	public static void main(String[] args) {

		Basquete basquete = new Basquete();
		basquete.setUsaBola(Boolean.TRUE);
		basquete.setTempoDeJogo(40);
		basquete.setAlturaCesta(3.45);
		
		Futebol futebol = new Futebol();
		futebol.setUsaBola(Boolean.TRUE);
		futebol.setTempoDeJogo(60);
		
	}
	
}
