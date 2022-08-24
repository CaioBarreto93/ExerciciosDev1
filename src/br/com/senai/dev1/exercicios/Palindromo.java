package br.com.senai.dev1.exercicios;

import javax.swing.JOptionPane;

public class Palindromo {
	/*1- receber a frase, 2-retirar espaço, 3-inverter a frase, 4-comparar e imprimir*/
	
	private String frase;
	
	private String semEspaco;

	public Palindromo() {}
	
	public Palindromo(String frase) {
		this.frase=frase;
	}
	//1-Metodo
	public void setFrase(String frase) {
		this.frase = frase.toUpperCase();
	}
	//2-Metodo
	public void retirarEspaco() {
		this.semEspaco = this.frase.replaceAll("\\s+","");
	}
	//3-Metodo
	public void inverter() {
		String invert="";
		char[] ch = this.semEspaco.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			invert=invert + ch[i];
		}
		this.setFrase(invert);
		
	}
	//4-Metodo
	public void compara() {
		if(this.semEspaco.equals(this.frase)) {
			JOptionPane.showMessageDialog(null, "A frase é um Palindromo.");
		}else {
			JOptionPane.showMessageDialog(null, "A frase é não um Palindromo.");
		}
	}
	
}
