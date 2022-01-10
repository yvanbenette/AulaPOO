package Implemetacao;

import beans.Pessoa;

public class ImplementarPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Yvan Benette";
		p1.setIdade(-30);
		p1.comer("Almoço");
		System.out.println("Pessoa :" + p1.nome + " / Idade: " + p1.getIdade() + "/ sentimento: " + p1.getSentimento());
		p1.dormir(5);
		
		//p1.sentimento = "Repouso";
		System.out.println("Pessoa :" + p1.nome + " / Idade: " + p1.getIdade() + "/ sentimento: " + p1.getSentimento());
	}

}
