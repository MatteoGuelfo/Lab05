package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Model model = new Model();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnCalcolaAnagrammi;

    @FXML
    private TextArea txtCorretti;

    @FXML
    private TextArea txtErrati;

    @FXML
    private Button btnReset;

    @FXML
    void onHandleCalcolaAnagramma(ActionEvent event) {
    	String ritorno=""; 
    	for(String s: model.listaAnagrammi(txtParola.getText())) {
    		ritorno+=s+"\n";
    	}
    	
    	txtErrati.setText(ritorno);
    	String ritorno1="";
    	for(String s: model.listaCorrettaAnagrammi(txtParola.getText())) {
    		ritorno1+=s+"\n";
    	}
    	
    	txtCorretti.setText(ritorno1);
    }

    @FXML
    void onHandleReset(ActionEvent event) {
    	
    	txtErrati.clear();
    	txtCorretti.clear();
    	txtParola.clear();

    }
    
    public void setModel(Model model) {
    	this.model=model;
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCalcolaAnagrammi != null : "fx:id=\"btnCalcolaAnagrammi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtCorretti != null : "fx:id=\"txtCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtErrati != null : "fx:id=\"txtErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
