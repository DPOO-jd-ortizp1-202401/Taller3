package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	private String fecha;
	
	
	public Vuelo (Ruta ruta, String fecha, Avion avion){
		
		this.fecha=fecha;
		
	}
	public Ruta getRuta() {
		return null;
	}
	
	public String getFecha() {
		return this.fecha;
	}
	public Avion getAvion() {
		return null;
	}
	
	public Collection<Tiquete> getTiquetes() {
		return this.tiquete;
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return null;
	}
}
