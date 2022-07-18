package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Submarino extends Vehiculo implements Acuatico {

	private Float profundidad;
	public Submarino() {
		super();
		this.profundidad= 0.0f;
		// TODO Auto-generated constructor stub
	}

	public Submarino(Integer codigoVehiculo, String nombre) {
		super(codigoVehiculo, nombre);
		// TODO Auto-generated constructor stub
		this.profundidad= 0.0f;
	}

	@Override
	public Float getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

}
