package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	public TipoDeBatalla getTipo() {
		return tipo;
	}



	public Batalla( TipoDeBatalla tipo, Double latitud, Double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnLaBatalla= new TreeSet<>();
	}
	public void agregarVehiculoAlaBatalla(Vehiculo vehiculo) {
		vehiculosEnLaBatalla.add(vehiculo);
	}

	
	
	public Double getLatitud() {
		
	
		return this.latitud;
	}
	public Double getLongitud() {
		// TODO Auto-generated method stub
		return this.longitud;
	}
	
}
