/**
 * 
 */
package data;

import java.util.UUID;

import data.interfaces.IShowType;
import lang.Messages;

/**
 * Clase que representa los tipos de shows admitidos.
 * 
 * @author Máximo Canedo
 */
public class ShowType implements IShowType {

	public static final IShowType RECITAL = new ShowType(Messages.getString("ShowType.RECITAL_NAME"), //$NON-NLS-1$
			Messages.getString("ShowType.RECITAL_DESCRIPTION")); //$NON-NLS-1$
	public static final IShowType THEATRE = new ShowType(Messages.getString("ShowType.THEATRE_NAME"), //$NON-NLS-1$
			Messages.getString("ShowType.THEATRE_DESCRIPTION")); //$NON-NLS-1$
	public static final IShowType FOR_KIDS = new ShowType(Messages.getString("ShowType.KIDS_NAME"), //$NON-NLS-1$
			Messages.getString("ShowType.KIDS_DESCRIPTION")); //$NON-NLS-1$
	public static final IShowType SPORTS = new ShowType(Messages.getString("ShowType.SPORTS_NAME"), //$NON-NLS-1$
			Messages.getString("ShowType.SPORTS_DESCRIPTION")); //$NON-NLS-1$

	/**
	 * ID único del registro.
	 */
	private final UUID _id;
	/**
	 * Nombre del tipo de evento.
	 */
	private String name;
	/**
	 * Descripción del tipo de evento.
	 */
	private String description;

	private ShowType() {
		this._id = UUID.randomUUID();
	}

	private ShowType(String name, String description) {
		this();
		setName(name);
		setDescription(description);
	}

	private ShowType(String name) {
		this(name, Messages.getString("ShowType.BLANK")); //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.IShowType#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.IShowType#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.IShowType#getID()
	 */
	@Override
	public UUID getID() {
		return _id;
	}

}
