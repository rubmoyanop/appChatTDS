package tds;
import java.util.LinkedList;
import java.util.List;

public abstract class Contacto {
	protected List<Mensaje> mensajes;
	
	public Contacto() {
        this.mensajes = new LinkedList<>();
    }
	
}
