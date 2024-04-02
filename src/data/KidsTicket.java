package data;

import java.util.Date;

import data.interfaces.IShowType;

public class KidsTicket extends Ticket { 
	
	public final Kids info;
	
	
	public KidsTicket (String name, Date date, int duration, int edad) {
		
		super(name, ShowType.FOR_KIDS, date, duration);
		
		info = new Kids(name, date, edad);
		
		updateFee();
		
	}
	
	public KidsTicket (String name, Date date, int duration, int edad, boolean extra) {
		super(name, ShowType.FOR_KIDS, date, duration);
		info = new Kids(name, date, edad, extra);
		updateFee();
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
