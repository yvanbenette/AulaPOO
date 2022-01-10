package implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import beans.AgendaRevisao;

public class ImplementarAgenda {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		AgendaRevisao agenda1 = new AgendaRevisao();
		
		agenda1.agendar();
		agenda1.cliente = "Yvan Benette";
		agenda1.fone = "(11)99150-5067";
		agenda1.modelo = "Ferrari";
		agenda1.data = myDate.parse("07/01/2022 20:21");
		
		System.out.println(agenda1.cliente);
		System.out.println(agenda1.fone);
		System.out.println(agenda1.modelo);
		System.out.println(agenda1.data + "\n");
		
		AgendaRevisao agenda2 = new AgendaRevisao();
	        
        agenda2.cliente = "Fausto Silva";
        agenda2.modelo = "Mclaren";
	    agenda2.data = myDate.parse("30/08/2021 00:00");
        System.out.println(agenda2.cliente);
        System.out.println(agenda2.modelo);
	    
	}

}
