package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Volador, Acuatico {
	private Float profundidad;
	private Float altura;
	public HidroAvion() {
		super();
		this.altura=0.0f;
		this.profundidad= 0.0f;
		// TODO Auto-generated constructor stub
	}

	public HidroAvion(Integer codigoVehiculo, String nombre) {
		super(codigoVehiculo, nombre);
		// TODO Auto-generated constructor stub
		this.altura=0.0f;
		this.profundidad= 0.0f;
	}

	@Override
	public Float getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

	@Override
	public Float getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}


}
