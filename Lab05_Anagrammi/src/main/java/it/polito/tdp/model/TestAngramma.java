package it.polito.tdp.model;

import it.polito.tdp.DAO.AnagrammaDao;

public class TestAngramma {

	public static void main(String[] args) {
		Anagramma ang = new Anagramma(); 
		AnagrammaDao angD = new AnagrammaDao(); 
		
		
		System.out.println(angD.isCorrect("cxz<ciao"));
		
		
	}

}
