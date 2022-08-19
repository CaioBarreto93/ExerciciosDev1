package br.com.senai.dev1.exercicios;

import javax.swing.JOptionPane;

public class Exerc1 {

	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog(null, "Entre com uma frase Palíndromo: ", "Entrada de Dados.", 1);
		String result = frase.replaceAll("\\s+","");
		char[] ch = result.toCharArray();
		frase="";
		for(int i=ch.length-1;i>=0;i--) {
			frase=frase + ch[i];
		}
		JOptionPane.showMessageDialog(null, frase);

	}

}
