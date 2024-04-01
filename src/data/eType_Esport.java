package data;

public enum eType_Esport {
	futbol("futbol"),
	rugby("rugby"),
	hockey("hockey");
	
	private final String descripcion;

	eType_Esport(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
