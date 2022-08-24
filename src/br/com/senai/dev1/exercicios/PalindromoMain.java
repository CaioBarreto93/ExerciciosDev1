package br.com.senai.dev1.exercicios;

import javax.swing.JOptionPane;

public class PalindromoMain {

	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog(null, "Digite a frase para teste:", "Entrada de dados", 0);
		Palindromo op = new Palindromo();
		op.setFrase(frase);
		op.retirarEspaco();
		op.inverter();
		op.compara();

	}

}
