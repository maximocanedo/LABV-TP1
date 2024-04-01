package data;

import lang.Messages;

public enum Sport {
	futbol(Messages.getString("eType_Eport.Deporte_Futbol")), rugby(Messages.getString("eType_Eport.Deporte_Rugby")), hockey(Messages.getString("eType_Eport.Deporte_Hockey")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	private final String descripcion;

	Sport(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return descripcion;
	}

}
