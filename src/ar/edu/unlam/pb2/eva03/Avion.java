package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Avion extends Vehiculo implements Volador {

	private Float altura; 

	public void setAlturaMax(Float alturaMax) {
		this.altura = alturaMax;
	}

	public Avion() {
		super();
		// TODO Auto-generated constructor stub
		this.altura=0.0f;
	}

	public Avion(Integer codigoVehiculo, String nombre) {
		super(codigoVehiculo, nombre);
		// TODO Auto-generated constructor stub
		this.altura=0.0f;
	}

	@Override
	public Float getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

}
