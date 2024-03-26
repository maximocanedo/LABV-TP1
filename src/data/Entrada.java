package data;

public abstract class Entrada {
	
    private int numEntrada;
    private String nombreShow;
    private String dia;
    private String horario;
    private float tiempoAprox;
    private double costo;

    
	public Entrada(int numEntrada, String nombreShow, String dia, String horario, float tiempoAprox, double costo) {
		super();
		this.numEntrada = numEntrada;
		this.nombreShow = nombreShow;
		this.dia = dia;
		this.horario = horario;
		this.tiempoAprox = tiempoAprox;
		this.costo = costo;
	}


	public int getNumEntrada() {
		return numEntrada;
	}


	public void setNumEntrada(int numEntrada) {
		this.numEntrada = numEntrada;
	}


	public String getNombreShow() {
		return nombreShow;
	}


	public void setNombreShow(String nombreShow) {
		this.nombreShow = nombreShow;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public float getTiempoAprox() {
		return tiempoAprox;
	}


	public void setTiempoAprox(float tiempoAprox) {
		this.tiempoAprox = tiempoAprox;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public abstract void calcularCosto();
}
