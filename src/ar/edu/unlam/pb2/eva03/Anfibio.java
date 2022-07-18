package ar.edu.unlam.pb2.eva03;



import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Acuatico, Terrestre {
	private Float profundidad;
	private Float velocidad;
	public Anfibio() {
		super();
		this.profundidad= 0.0f;
		this.velocidad=0.1f;
		// TODO Auto-generated constructor stub
	}

	public Anfibio(Integer codigoVehiculo, String nombre) {
		super(codigoVehiculo, nombre);
		// TODO Auto-generated constructor stub
		this.profundidad= 0.00f;
		this.velocidad=0.00f;
	}

	@Override
	public Float getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

	@Override
	public Float getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

}
