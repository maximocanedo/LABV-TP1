package data;

import lang.Messages;

public enum SportClassification {
	internacional(Messages.getString("eClassification.international")), nacional(Messages.getString("eClassification.national")); //$NON-NLS-1$ //$NON-NLS-2$

	private final String descripcion;

	SportClassification(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return descripcion;
	}
}
