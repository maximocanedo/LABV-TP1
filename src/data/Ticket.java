package data;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Clase que representa una entrada de cualquier tipo
 * 
 * @author M�ximo Canedo
 */
public abstract class Ticket implements ITicket {
	
	/**
	 * ID �nico de la entrada. 
	 */
	private UUID _id;
	/**
	 * Nombre del espect�culo.
	 */
	private String name;
	/**
	 * Tipo de espect�culo.
	 */
	private IShowType type;
	/**
	 * Fecha y hora de inicio del espect�culo.
	 */
	private Date date;
	/**
	 * Duraci�n estimada del espect�culo, en minutos.
	 */
	private int duration;
	/**
	 * Tarifa de la entrada.
	 */
	private double fee;
	
	protected Ticket() {
		this._id = UUID.randomUUID();
	}
	protected Ticket(String name, IShowType type, Date date, int duration, double fee) {
		this();
		this.setName(name);
		this.setType(type);
		this.setDate(date);
		this.setDuration(duration);
		this.setFee(fee);
	}
	
	/* (non-Javadoc)
	 * @see data.ITicket#toString()
	 */
	@Override
	public abstract String toString();
	
	/**
	 * M�todo toString propio de Ticket. NO HEREDAR NI MODIFICAR.
	 * Usar como plantilla para los .toString() de las clases heredadas.
	 * @param additionalLines L�neas adicionales con datos propios de cada clase heredada.
	 * @return Informaci�n del objeto en formato String y simulando un ticket. 
	 */
	protected String toString(String[] additionalLines) {
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.SHORT);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		String ticket = "����� Entrada para show �����\n";
		String[] principalLines = new String[] {
			"ID: " + this.getID(),
			"Nombre: " + this.getName(),
			"Tipo de show: " + this.getType().getName(),
			"Fecha y hora de inicio: " + df.format(this.getDate()),
			"Duraci�n estimada: " + this.getDuration() + " m",
			"Costo de la entrada: " + nf.format(this.getFee())
		};
		for(String line: principalLines) {
			ticket += "� " + line + "\n";
		}
		for(String line: additionalLines) {
			ticket += "� " + line + "\n";
		}
		ticket += "���������������";
		return ticket;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#getType()
	 */
	@Override
	public IShowType getType() {
		return type;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#setType(data.IShowType)
	 */
	@Override
	public void setType(IShowType type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#getDate()
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#setDate(java.util.Date)
	 */
	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#getDuration()
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#setDuration(int)
	 */
	@Override
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#getFee()
	 */
	@Override
	public double getFee() {
		return fee;
	}

	/**
	 * Establecer la tarifa de la entrada.
	 * 
	 * Este m�todo es protegido y no se debe crear un m�todo p�blico en cualquiera de las clases hijas.
	 * @param fee the fee to set
	 */
	protected void setFee(double fee) {
		this.fee = fee;
	}

	/* (non-Javadoc)
	 * @see data.ITicket#getID()
	 */
	@Override
	public UUID getID() {
		return _id;
	}

}