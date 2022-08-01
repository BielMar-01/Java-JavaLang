package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; // object literal
		//String outro = Alura"; // Má pratica
		
		
		//String outro = nome.replace("A", "a"); 
		String outro = nome.toLowerCase();
		System.out.println(nome);
		System.out.println(outro);
	}

}
