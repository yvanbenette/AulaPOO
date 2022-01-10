package beans;

public class Televisor {
	private int canal;
	private int volume;
	private boolean ligado;
	
	///////////////////////////////////////////////////////////////////////////////////
	///////////////////////////GETTERS && SETTERS//////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////


	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////
	///////////////////////////METODOS && OPERA��ES//////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////
	
	 public void aumentarVolume() {
		 if (this.ligado == true) {
			   if (this.volume<10) {
			  this.volume = this.volume + 1;
			 System.out.println("Volume +");   
			   }
			   System.out.println("Volume + ");
		  } else {
			  
			 System.out.println("Tv Esta Desligada");
		  }
	        
	   };
	    
	    public void reduzirVolume() {
	    	if (this.ligado ==true) {
	    		if (this.volume >0) {
	    		this.volume = this.volume -1;
	    		}
	    		System.out.println("Volume -1");
	    	} else {
	    		System.out.println("TV esta desligada");
	    	}
	        System.out.println("volume -");
	    };
	    
	    public void subirCanal() {
	        System.out.println("canal +");
	    };
	    
	    public void descerCanal() {
	        System.out.println("canal -");
	    };
	    
	    public void ligar() {
	        System.out.println("Ligar TV");
	        this.ligado = true;
	    };
	    
	    public void desligar() {
	        System.out.println("Desligar TV");
	        this.ligado = false;
	    };
	    
	    public void mostrarStatus() {
	    	System.out.println("Canal: " + this.canal + " - Volume: " + this.volume  + " -TV On " + this.ligado);
	    };
	    
}
