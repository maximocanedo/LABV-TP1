package data;

public enum eType_Eport {
	futbol("futbol"), rugby("rugby"), hockey("hockey");

	private final String descripcion;

	eType_Eport(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return descripcion;
	}

}
