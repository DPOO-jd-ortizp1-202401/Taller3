package uniandes.dpoo.aerolinea.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	public double IMPUESTO=0.28;
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
		
	}
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		return IMPUESTO;
		
	}
	protected int calcularDistanciaVuelo(Ruta ruta) {
		return 0;
		
	}
	protected int calcularValorImpuestos(int costoBase) {
		return costoBase;
		
	}
	
}
