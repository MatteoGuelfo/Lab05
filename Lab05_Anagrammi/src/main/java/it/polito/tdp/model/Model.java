package it.polito.tdp.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.DAO.AnagrammaDao;

public class Model {
	
	AnagrammaDao ad;
	Anagramma a;

	public Model() {

		this.ad = new AnagrammaDao();
		this.a = new Anagramma();
	}
	
	public List<String> listaAnagrammi(String parola){
		return a.calcolaAnagramma(parola);
	}
	
	public List<String> listaCorrettaAnagrammi(String parola){
		List<String> ritorno = new LinkedList<>();
		for(String s: a.calcolaAnagramma(parola)) {
			if(ad.isCorrect(s))
				ritorno.add(s);
		}
		
		return ritorno; 
	}
	
	
	

}
