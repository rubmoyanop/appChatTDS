package vista;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import tds.BubbleText;

public class Lanzador {
	public static void main(String[] args) {
		VentanaPrincipal v = new VentanaPrincipal();
		
		DateTimeFormatter formatoTiempoMensaje = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(LocalDateTime.now().format(formatoTiempoMensaje));
	}
}
