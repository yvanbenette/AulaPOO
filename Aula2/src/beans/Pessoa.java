package beans;

public class Pessoa {
	 public int id;
	    public String nome;
	    public String cidade;
	    private String sentimento;
	    private int idade;
	    	
	   public void setSentimento(String texto) {
		   this.sentimento = texto;
	   }
	   
	   public void setIdade(int idade) {
		   if (idade <0) {
			   this.idade = 0;
		   } else {
			   this.idade = idade;
			   this.idade = idade;

		   }
	   }

	   public String getSentimento() {
		   return this.sentimento;
	   }
	   public int getIdade() {
		   return this.idade;
	   }
	    ///////////////////////////////////////////////////////////////////////////////	
	    ////////////////////METODOS + OPERAÇÕES///////////////////////////////////////////////
	    ///////////////////////////////////////////////////////////////////////////////
	    
	    public void comer(String refeicao) {
	    	sentimento = "Feliz";
	    }
	    
	    public void dormir(int horas) {
	    	if (horas <8) {
	    		sentimento = "Cansado";
	    	}else {
	    		sentimento = "Repouso";
	    	}
	    }
			
}
