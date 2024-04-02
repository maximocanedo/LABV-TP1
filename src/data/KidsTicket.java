package data;

import java.util.Date;

import data.interfaces.IShowType;

public class KidsTicket extends Ticket { 
	
	public final Kids info;
	
	private final String souvenir;
	
	public KidsTicket (String name, IShowType type, Date date, int duration, boolean edad) {
		
		super(name, type, date, duration);
		
		info = new Kids(name, date, edad);
		
		updateFee();
		
		souvenir = "GRACIAS POR VENIR A " + name + ". EL DIA " + date;
		
	}
	
	public KidsTicket (String name, IShowType type, Date date, int duration, boolean edad, boolean extra) {
		
		super(name, type, date, duration);
			
		info = new Kids(name, date, edad, extra);
		
		updateFee();
		
		if(!extra)
			souvenir = "GRACIAS POR VENIR A " + name + ". EL DIA " + date;
		else
			souvenir = "GRACIAS POR VENIR A " + name + "\n" +  "EL DIA " +  date + "\n" + "TENES TUS FOTOS CARGADAS EN WWWW.TICKETSHOW.COM";
	}
	
	@Override
	public void updateFee() {
		// TODO Auto-generated method stub
		setFee(info.getValor());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return getName() + "\n" + getType().getName() + "\n" + getType().getDescription() + "\n" +  getDate()
			//+ "\n" + "PRECIO:" + getFee() + "\n" + "DURACION:" + getDuration() + " MINUTOS" + "\n" + info.getSouvenir();
		
		String[] additionalLines = {info.getSouvenir()};
		
		return super.toString(additionalLines);
	}
	
}
