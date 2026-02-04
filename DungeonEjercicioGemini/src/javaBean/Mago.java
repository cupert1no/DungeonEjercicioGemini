package javaBean;

import java.util.ArrayList;
import java.util.HashMap;


public class Mago extends Personaje implements Inventariable {
	
	private int mana;
	private HashMap<String, Integer> libroHechizos;
	
	private ArrayList<String> inventario;
	
	public Mago(String nombre, int string, int puntosVida, int mana, HashMap<String, Integer> libroHechizos) {
		super(nombre, string, puntosVida);
		this.mana = mana;
		this.libroHechizos = new HashMap<>();
		this.inventario = new ArrayList<>();
	}
	
	public void aprenderHechizo(String nombre, int coste){
		libroHechizos.put(nombre, coste);
		
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public void atacar(Personaje objetivo) {
		System.out.println(getNombre() + "Lanza ataque mágico a " + objetivo.getNombre());
		
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
	
	
	
	

} // Fin de clase
