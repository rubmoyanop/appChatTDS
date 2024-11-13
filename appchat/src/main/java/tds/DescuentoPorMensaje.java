package tds;

public class DescuentoPorMensaje extends Descuento {

	@Override
	public double getDescuento() {
		descuento = 0; // Implementación del descuento por mensaje
		return descuento;
	}

}
