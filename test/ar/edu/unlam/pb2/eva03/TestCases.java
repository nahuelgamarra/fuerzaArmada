package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;
import ar.edu.unlam.pb2.eva03.*;
import org.junit.Test;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class TestCases {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		Vehiculo avion =  new Avion();
		Volador avion1 = new Avion(1, "A-10");

		assertEquals(0.0,((Avion) avion).getAltura(),0.0);
		
		assertEquals(0.1, avion1.getAltura(), 0.1);
	}

	
			
	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		Vehiculo tanque = new Tanque();
		Terrestre tanque1 = new Tanque(5, "Renault FT");

		assertEquals(0.0, ((Tanque) tanque).getVelocidad(),0.1);
		assertEquals(0.0, tanque1.getVelocidad(), 0.1);
	}

	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		Vehiculo submarino = new Submarino();
		Acuatico submarino1 = new Submarino(8, "ARA - San Juan");

		assertEquals(0.0, ((Submarino) submarino).getProfundidad(),0.0);
		assertEquals(0.0, submarino1.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		Vehiculo var = new Anfibio();
		Anfibio var1 = new Anfibio(12, "LARC-5");

		assertEquals(0.0, ((Anfibio) var1).getVelocidad(),0.1);
		assertEquals(0.0, ((Anfibio) var1).getProfundidad(),0.1);
		assertEquals(0.0, ((Anfibio) var).getVelocidad(), 0.11);
		assertEquals(0.0, ((Anfibio) var).getProfundidad(), 0.11);
	}

	@Test
	public void queSePuedaCrearUnHidroavion() {
		Vehiculo ag6001 = new HidroAvion();
		HidroAvion ag600 = new HidroAvion(12, "AG600");

		assertEquals(0.0, ((HidroAvion) ag6001).getAltura(),0.1);
		assertEquals(0.0, ((HidroAvion) ag6001).getProfundidad(),0.1);
		assertEquals(0.0, ag600.getAltura(), 0.01);
		assertEquals(0.0, ag600.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();
		/*
		argentina.agregarVehiculo(new Avion("0001", "A-10"));
		argentina.agregarVehiculo(new Avion("0002", "A-10"));
		argentina.agregarVehiculo(new Avion("0003", "F-102"));
		argentina.agregarVehiculo(new Avion("0004", "F-15"));
		argentina.agregarVehiculo(new Tanque("0005", "Renault FT"));
		argentina.agregarVehiculo(new Camion("0006", "T-72"));
		argentina.agregarVehiculo(new Camion("0007", "T-72"));
		argentina.agregarVehiculo(new Submarino("0008", "A-10"));
		argentina.agregarVehiculo(new Portaviones("0009", "A-10"));
		argentina.agregarVehiculo(new Destructor("0010", "A-10"));
		argentina.agregarVehiculo(new Destructor("0011", "A-10"));
		argentina.agregarVehiculo(new Hidroavion("0012", "A-10"));
		argentina.agregarVehiculo(new Anfibio("0012", "A-10"));
		*/
		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));

		assertEquals(12, argentina.getCapacidadDeDefensa(),0.1);
		assertEquals((Integer)12, argentina.getCapacidadDeDefensa(),0.1);
	}

	@Test
	public void queSePuedaCrearUnaBatalla() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud(),0.01);
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud(),0.01);

		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud(),0.01);
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud(),0.01);
	}

	
		

	@Test
	public void queSePuedaPresentarBatallaTerrestre() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(0001, "A-10"));
		argentina.agregarVehiculo(new Avion(0002, "A-10"));
		argentina.agregarVehiculo(new Avion(0003, "F-102"));
		argentina.agregarVehiculo(new Avion(0004, "F-15"));
		argentina.agregarVehiculo(new Tanque(0005, "Renault FT"));
		argentina.agregarVehiculo(new Camion(0006, "T-72"));
		argentina.agregarVehiculo(new Camion(0007, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(0010, "A-10"));
		argentina.agregarVehiculo(new Destructor(0011, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(0012, "A-10"));
		argentina.agregarVehiculo(new Anfibio(0012, "A-10"));

		argentina.crearBatalla("San Lorenzo",TipoDeBatalla.TERRESTRE, 100.5, 20.3 );

		argentina.agregarVehiculo(new Tanque(0005, "Renault FT"));
		argentina.agregarVehiculo(new Camion(0006, "T-72"));
		argentina.agregarVehiculo(new Camion(0007, "T-72"));
		argentina.agregarVehiculo(new Avion(0001, "A-10"));
		argentina.presentarBatalla();
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 5));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 6));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 7));		
		assertEquals(13, argentina.getCapacidadDeDefensa());
	
	
	}
	

	@Test
	public void queSePuedaPresentarBatallaNaval() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));

		assertEquals(6, argentina.getCapacidadDeDefensa());
		argentina.crearBatalla("Pacifico", TipoDeBatalla.ACUATICO, 200.5, 45.8);

		assertTrue(argentina.enviarALaBatalla("Pacifico", 8));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 9));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 10));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 11));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 12));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 13));		
	}
	

	@Test (expected = VehiculoIncompatible.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 11));

	}
	
	@Test (expected = VehiculoInexistente.class)
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista()
			throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 4));
	}
}
