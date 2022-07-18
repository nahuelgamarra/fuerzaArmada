package ar.edu.unlam.pb2.eva03;

public class Vehiculo implements Comparable<Vehiculo>{

private Integer codigoVehiculo;
private  String nombre;

public Vehiculo(Integer codigoVehiculo, String nombre) {
	super();
	this.codigoVehiculo = codigoVehiculo;
	this.nombre= nombre;
}

public Vehiculo() {
	super();
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codigoVehiculo == null) ? 0 : codigoVehiculo.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vehiculo other = (Vehiculo) obj;
	if (codigoVehiculo == null) {
		if (other.codigoVehiculo != null)
			return false;
	} else if (!codigoVehiculo.equals(other.codigoVehiculo))
		return false;
	return true;
}

@Override
public int compareTo(Vehiculo o) {
	if(this.codigoVehiculo.equals(o.codigoVehiculo)) {
		return 0;
	}
	return 1;
}

public Integer getCodigoVehiculo() {
	return codigoVehiculo;
}

public void setCodigoVehiculo(Integer codigoVehiculo) {
	this.codigoVehiculo = codigoVehiculo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


}
