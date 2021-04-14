package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.List;

public class Anagramma {
	
	

	public List<String> calcolaAnagramma(String parola) {
		
		List<String> anagrammi = new ArrayList<>();
		combina("",parola,0,anagrammi);
		
		return anagrammi; 
		
	}
	
	private void combina(String parolaComposta, String lettere, int livello, List<String> risultato) {
		if(lettere.length()==0) {
			if(!risultato.contains(parolaComposta))
				risultato.add(parolaComposta);
		}else {
			for(int i=0; i<lettere.length(); i++) {
				
				String nuovaParolaComposta=parolaComposta+lettere.charAt(i);
				String nuoveLettere=lettere.substring(0, i)+lettere.substring(i+1);
				
				combina(nuovaParolaComposta,nuoveLettere,livello+1,risultato);
						
			}
		}
	}
	
	
}
