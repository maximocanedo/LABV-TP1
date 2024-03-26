/**
 * 
 */
package data;

import java.util.UUID;

/**
 * Clase que representa los tipos de shows admitidos.
 * 
 * @author Máximo Canedo
 */
public class ShowType implements IShowType {
	
	public static final IShowType RECITAL = new ShowType("Recital", "Concierto compuesto de varias obras ejecutadas por un solo artista con un solo instrumento.");
	public static final IShowType THEATRE = new ShowType("Teatro", "Recreación de una o varias historias de distinta índole mediante actores, discursos, música y escenografía.");
	public static final IShowType FOR_KIDS = new ShowType("Infantil", "Shows para los más chicos. ");
	public static final IShowType SPORTS = new ShowType("Deportivo", "Partidos de fútbol, rugby y hockey, nacionales e internacionales. ");
	
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
	
	public ShowType(String name, String description) {
		this();
		setName(name);
		setDescription(description);
	}
	
	public ShowType(String name) {
		this(name, "");
	}

	/* (non-Javadoc)
	 * @see data.IShowType#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see data.IShowType#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see data.IShowType#getID()
	 */
	@Override
	public UUID getID() {
		return _id;
	}

	
}
