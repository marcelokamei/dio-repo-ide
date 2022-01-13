package me.dio;

import me.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*
		 * int a = 2; int b = 9; System.out.println("Alou mundo! " + (a+b));
		 */

		Gato gato = new Gato("Bob", "Preto", 5);
		Livros livros = new Livros("Machado de Assis", 250);

		System.out.println(gato);
		System.out.println(livros);

	}

}

class Livros {
	private String nome;
	private Integer npag;

	public Livros(String nome, Integer npag) {
		
		this.nome = nome;
		this.npag = npag;
	}

	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", npag=" + npag + "]";
	}

}
