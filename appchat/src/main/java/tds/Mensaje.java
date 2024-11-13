package tds;

import java.time.LocalDateTime;

public class Mensaje {
	private String texto;
	private LocalDateTime hora;
	private String emoticon;
	private boolean tipo; // Indica si el mensaje es enviado por el usuario actual al contacto o recibido del contacto
}
