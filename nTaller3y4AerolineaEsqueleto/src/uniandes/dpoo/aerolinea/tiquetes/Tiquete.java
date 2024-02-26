package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador,int tarifa) {
		this.codigo=codigo;
		this.tarifa=tarifa;
		
	}
	public Cliente getCliente() {
		return null;
	}
	public Vuelo getVuelo() {
		return this.getVuelo();
	}
	public String getCodigo() {
		return this.codigo;
	}
	public int getTarifa() {
		return this.tarifa;
	}
	
	public void marcarComoUsado() {
		
	}
	
	public boolean esUsado() {
		return usado;
		
	}
}
