package implementacao;

import beans.Livro;

public class ImplementarLivro {

	public static void main(String[] args) {
		
		System.out.println("Iniciando" + "\n");
		Livro exemplar1 = new Livro();
		exemplar1.titulo = "Programa��o Java";
		exemplar1.editora = "Atlas Editora";
		exemplar1.autor = "Galoni;Jo";
		
		System.out.println("Exemplar1: " + exemplar1.titulo);
		System.out.println("-Editora: " + exemplar1.editora);
		System.out.println("-Autor: " + exemplar1.autor + "\n");
		
		Livro exemplar2 = new Livro();
		exemplar2.titulo = "Database BigData";
		exemplar2.editora = "Books";
		
		System.out.println("Exemplar2: " + exemplar2.titulo );
		System.out.println("-Editora: " + exemplar2.editora);
		System.out.println("-Autor: " + exemplar2.autor);

	}

}
