package data;

public enum eClassification {
	internacional("internacional"),
	nacional("nacional");
	
	private final String descripcion;

	eClassification(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
