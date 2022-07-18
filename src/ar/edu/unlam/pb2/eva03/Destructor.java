package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Destructor extends Vehiculo implements Acuatico{

	public Destructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destructor(Integer codigoVehiculo, String nombre) {
		super(codigoVehiculo, nombre);
		// TODO Auto-generated constructor stub
	}


	

	@Override
	public Float getProfundidad() {
		Float profundidad= 0.0f;
		return profundidad;
	}

}
