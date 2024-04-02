package data;

import data.interfaces.IKids;
import lang.Messages;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Kids implements IKids{
	
	public static final int[] valor_entrada = {250,500}; 
	
	public static final boolean menor_de_ocho = false;
	
	public static final boolean mayor_de_ocho = true;
	
	public static final boolean lleva_souvenir = true;
	
	private final int valor;
	
	//Antiguo mensaje de Souvenir, por Convencion se opto por el nuevo formato "Souvenir: Incluye, Souvenir: null"
	
	//private String[] mensaje_souvenir = {"GRACIAS POR VENIR A ", ". EL DIA ", " - TENES TUS FOTOS CARGADAS EN WWWW.TICKETSHOW.COM"};

	private String [] mensaje_souvenir = {null, Messages.getString("Kids.WithSouvenir")}; //$NON-NLS-1$
	
	public Kids (String name, Date date, int edad) {
		
		if(edad < 8)
			valor = valor_entrada[0];
		else
			valor = valor_entrada[1];
		
		//mensaje_souvenir[0] += name + mensaje_souvenir[1] + new SimpleDateFormat("dd-MM-yyyy").format(date);
		
	}

	public Kids (String name, Date date, int edad, boolean souvenir) {
		
		if(edad < 8)
			valor = valor_entrada[0];
		else
			valor = valor_entrada[1];
		
		//mensaje_souvenir[0] += name + mensaje_souvenir[1] + new SimpleDateFormat("dd-MM-yyyy").format(date) + mensaje_souvenir[2];
		
		mensaje_souvenir[0] = mensaje_souvenir[1];
	}
	
	@Override
	public int getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public String getSouvenir() {
		// TODO Auto-generated method stub
		return mensaje_souvenir[0];
	}
	
}
