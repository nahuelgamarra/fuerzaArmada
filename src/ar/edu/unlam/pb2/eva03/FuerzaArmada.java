package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;
import ar.edu.unlam.pb2.eva03.interfaces.*;




public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	
	public FuerzaArmada() {
		super();
		this.convoy = new TreeSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}
	public FuerzaArmada(Set<Vehiculo> convoy, Map<String, Batalla> batallas) {
		super();
		this.convoy = convoy;
		this.batallas = batallas;
	}
	public void agregarVehiculo(Vehiculo vehiculo) {
		
		
		convoy.add(vehiculo);
		
	}
	public int getCapacidadDeDefensa() {
		
		return convoy.size();
	}
	public void crearBatalla(String nombre, TipoDeBatalla tipoBatalla, double Latitud, double Longintud) {
		batallas.put(nombre,new Batalla(tipoBatalla,Latitud,Longintud));
		
	}
	public Batalla getBatalla(String string) {
		Batalla batallaADevolver;
		
		batallaADevolver=	batallas.get(string);
		
		return batallaADevolver;
	}

	public void presentarBatalla() {
		// TODO Auto-generated method stub
		
	}
	public boolean enviarALaBatalla(String string, Integer codigo) throws VehiculoInexistente, VehiculoIncompatible {
		Batalla batalla= getBatalla(string);
		TipoDeBatalla tipobatalla=batalla.getTipo();
	
		Vehiculo vehiculo= getVehiculo(codigo);
	
		
		
	if(tipobatalla.equals(TipoDeBatalla.TERRESTRE)) {
		
	
			if(	vehiculo.getClass().equals(Tanque.class) || vehiculo.getClass().equals(Anfibio.class)||
					vehiculo.getClass().equals(Camion.class)) {
				System.out.println("esto esta funcionando");
				batalla.agregarVehiculoAlaBatalla(vehiculo);
				return true;
			}
		
	} else if(tipobatalla.equals(TipoDeBatalla.ACUATICO)) {
		if(vehiculo.getClass().equals(Anfibio.class)||
				vehiculo.getClass().equals(HidroAvion.class)||
				vehiculo.getClass().equals(Portaviones.class)||
				vehiculo.getClass().equals(Submarino.class)||
				vehiculo.getClass().equals(Destructor.class)) {
			batalla.agregarVehiculoAlaBatalla(vehiculo);
			return true;
		}
		
	}else if(tipobatalla.equals(TipoDeBatalla.AEREO)) {
		if(vehiculo.getClass().equals(Avion.class)||
				vehiculo.getClass().equals(Anfibio.class)||
				vehiculo.getClass().equals(HidroAvion.class)){
		batalla.agregarVehiculoAlaBatalla(vehiculo);
			return true;
		}
		
	}
		throw new VehiculoIncompatible("Vehiculo incompatible para esta batalla");
	} 
	
	 public Vehiculo getVehiculo(Integer codigo)  throws VehiculoInexistente{
		
			Vehiculo vehiculo;
			for(Vehiculo este:convoy) {
			if(	este.getCodigoVehiculo().equals(codigo) && este.getClass().equals(Tanque.class)) {
			vehiculo= este;
			return (Tanque)vehiculo;
			
			}else if(	este.getCodigoVehiculo().equals(codigo) && este.getClass().equals(Camion.class)) {
				vehiculo= este;
				return (Camion)vehiculo;
			}else if(	este.getCodigoVehiculo().equals(codigo) && este.getClass().equals(Anfibio.class)) {
				vehiculo= este;
				return (Anfibio)vehiculo;
			}else if(	este.getCodigoVehiculo().equals(codigo) && este.getClass().equals(Avion.class)) {
				vehiculo= este;
				return (Avion)vehiculo;
			}else if(	este.getCodigoVehiculo().equals(codigo) && este.getClass().equals(Destructor.class)) {
				vehiculo= este;
				return (Destructor)vehiculo;
			}else if(	este.getCodigoVehiculo().equals(codigo) && este.getClass().equals(HidroAvion.class)) {
				vehiculo= este;
				return (HidroAvion)vehiculo;
			}else if(	este.getCodigoVehiculo().equals(codigo) && este.getClass().equals(Portaviones.class)) {
				vehiculo= este;
				return (Portaviones)vehiculo;
			}else if(	este.getCodigoVehiculo().equals(codigo) && este.getClass().equals(Submarino.class)) {
				vehiculo= este;
				return (Submarino)vehiculo;
			}
			}
			throw new VehiculoInexistente("Vehiculo inexistente");
	
		 
	 }
	
	

}
