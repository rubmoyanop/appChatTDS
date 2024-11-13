package tds;

import java.util.LinkedList;
import java.util.List;

public class Grupo extends Contacto {
	private List<ContactoIndividual> miembros;
	
	public Grupo() {
		super();
		this.miembros = new LinkedList<>();
	}

}
