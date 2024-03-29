package data;

import lang.Messages;

public enum eClassification {
	internacional(Messages.getString("eClassification.international")), nacional(Messages.getString("eClassification.national")); //$NON-NLS-1$ //$NON-NLS-2$

	private final String descripcion;

	eClassification(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return descripcion;
	}
}
