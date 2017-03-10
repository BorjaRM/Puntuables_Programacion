package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Baraja {
	private static final int palosXBaraja = 4;
	private static final int cartasXPalo = 12;
	private Stack<Carta> cartas;

	
	public Baraja(){
		cartas = new Stack<Carta>();
		creaCartas();
	}

	public Stack<Carta> getCartas() {
		return cartas;
	}
	
	public void creaCartas(){
		for(Palo p: Palo.values()){
			for(int i=1;i<=cartasXPalo;i++){
				cartas.push(new Carta(i,p));
			}
		}
	}
	
	public void baraja(){
		ArrayList<Carta> barajaTemp = cartasEnArrayList();
		cartasEnPila(barajaTemp);		
	}
	
	public Carta getCarta(){
		return cartas.pop();		
	}
	
	public void verBaraja(){
		for(Carta c:this.cartas){
			System.out.println(c.getNumero() + " " +c.getPalo());
		}
	}
	
	//Mete las cartas en un ArrayList
	private ArrayList<Carta> cartasEnArrayList(){
		ArrayList<Carta> barajaTemp = new ArrayList<Carta>(cartas.size());
		
		while(!cartas.empty()){
			barajaTemp.add(cartas.pop());
		}
		return barajaTemp;
	}
	
	//Coge una carta aleatoria del ArrayList y la volvemos a poner en la pila
	private void cartasEnPila(ArrayList<Carta> b){
		while(!b.isEmpty()){
			int aleatorio = (int) (Math.random()*b.size());		
			Carta c = b.get(aleatorio);
			cartas.push(c);
			b.remove(c);
		}
	}
	
	
}
