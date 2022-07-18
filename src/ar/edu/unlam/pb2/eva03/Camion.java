package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Camion extends Vehiculo implements Terrestre {



	private Float velocidad;

	public Camion() {
		super();
		// TODO Auto-generated constructor stub
		this.velocidad=0.0f;
	}

	public Camion(Integer codigoVehiculo, String nombre) {
		super(codigoVehiculo, nombre);
		this.velocidad=0.0f;
		// TODO Auto-generated constructor stub
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public Float getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

}
