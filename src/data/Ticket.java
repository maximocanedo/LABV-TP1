package data;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.UUID;

import data.interfaces.IShowType;
import data.interfaces.ITicket;
import lang.Messages;
import utils.FormattedLine;

/**
 * Clase que representa una entrada de cualquier tipo
 * 
 * @author Máximo Canedo
 */
public abstract class Ticket implements ITicket {

	/**
	 * ID único de la entrada.
	 */
	private UUID _id;
	/**
	 * Nombre del espectáculo.
	 */
	private String name;
	/**
	 * Tipo de espectáculo.
	 */
	private IShowType type;
	/**
	 * Fecha y hora de inicio del espectáculo.
	 */
	private Date date;
	/**
	 * Duración estimada del espectáculo, en minutos.
	 */
	private int duration;
	/**
	 * Tarifa de la entrada.
	 */
	private double fee = 0;

	protected Ticket() {
		this._id = UUID.randomUUID();
	}

	protected Ticket(String name, IShowType type, Date date, int duration) {
		this();
		this.setName(name);
		this.setType(type);
		this.setDate(date);
		this.setDuration(duration);
	}

	public abstract void updateFee();

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#toString()
	 */
	@Override
	public abstract String toString();

	/**
	 * Método toString propio de Ticket. NO HEREDAR NI MODIFICAR. Usar como
	 * plantilla para los .toString() de las clases heredadas.
	 * 
	 * @param additionalLines
	 *            Líneas adicionales con datos propios de cada clase heredada.
	 * @return Información del objeto en formato String y simulando un ticket.
	 */
	protected String toString(String[] additionalLines) {
		
		// Formateadores
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.SHORT);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		// Cabecera del ticket
		FormattedLine header = new FormattedLine(Messages.getString("Ticket.HEADER_TITLE"));
		header.setTopHeader(true);
		header.setAlignment(FormattedLine.Alignment.CENTER);
		
		// Inicializar el ticket
		String ticket = header.toString();
		
		// Línea del total
		FormattedLine feeLine = new FormattedLine(Messages.getString("Ticket.FEE_ROW") + nf.format(this.getFee()));
		feeLine.setAlignment(FormattedLine.Alignment.RIGHT);
		
		// Líneas principales. Estas aparecen justo bajo la cabecera.
		String[] principalLines = new String[] { 
				Messages.getString("Ticket.ID_ROW") + this.getID(),
				Messages.getString("Ticket.NAME_ROW") + this.getName(),
				Messages.getString("Ticket.TYPE_ROW") + this.getType().getName(),
				Messages.getString("Ticket.DURATION_ROW") + this.getDuration() + " " + Messages.getString("Ticket.MINUTES")
		};
		for (String line : principalLines) {
			FormattedLine dl = new FormattedLine(line);
			ticket += dl.toString();
		}
		
		// Agregar líneas adicionales.
		for (String line : additionalLines) {
			if(line == null) continue;
			ticket += new FormattedLine(line).toString();
		}
		
		// Agregar línea en blanco y línea de la tarifa.
		ticket += FormattedLine.BLANK.toString();
		ticket += feeLine.toString();
		
		// Agregar footer con la fecha y hora de inicio.
		FormattedLine end = new FormattedLine(df.format(this.getDate()));
		end.setAlignment(FormattedLine.Alignment.CENTER);
		end.setBottomHeader(true);
		ticket += end.toString();
		
		
		return ticket;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#getType()
	 */
	@Override
	public IShowType getType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#setType(data.IShowType)
	 */
	@Override
	public void setType(IShowType type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#getDate()
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#setDate(java.util.Date)
	 */
	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#getDuration()
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#setDuration(int)
	 */
	@Override
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#getFee()
	 */
	@Override
	public double getFee() {
		return fee;
	}

	/**
	 * Establecer la tarifa de la entrada.
	 * 
	 * Este método es protegido y no se debe crear un método público en cualquiera
	 * de las clases hijas.
	 * 
	 * @param fee
	 *            the fee to set
	 */
	protected void setFee(double fee) {
		this.fee = fee;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.ITicket#getID()
	 */
	@Override
	public UUID getID() {
		return _id;
	}

}