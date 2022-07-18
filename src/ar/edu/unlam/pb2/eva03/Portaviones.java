package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Portaviones extends Vehiculo implements Acuatico {

	public Portaviones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Portaviones(Integer codigoVehiculo, String nombre) {
		super(codigoVehiculo, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float getProfundidad() {
		Float profundidad= 0.0f;
		return profundidad;
	}



}
