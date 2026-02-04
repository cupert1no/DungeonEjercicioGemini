package javaBean;

import java.util.ArrayList;

public class Guerrero extends Personaje implements Inventariable{
	
	private ArrayList<String> inventario;

	public Guerrero(String nombre, int string, int puntosVida) {
		super(nombre, string, puntosVida);
		
		this.inventario = new ArrayList<>();
		
	}

	@Override
	public void atacar(Personaje objetivo) {
		System.out.println(getNombre() + " golpea con fuerza a " + objetivo.getNombre());
		
	}

	@Override
	public void agregarItem(String... items) {
			for(String item : items) {
				this.inventario.add(item);
				System.out.println("Añadido al inventario: " + item);
			}
		
	}

	@Override
	public void mostrarInventario() {
		System.out.println("Inventario de "+ getNombre() + ": "+ inventario);
		
	}
	
	
	
} //FInn de Clase
