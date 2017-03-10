package Ejercicio2;

public class Carta {
	private int numero;
	private Palo palo;
	
	public Carta(int numero, Palo p){
		this.numero = numero;
		palo = p;
	}

	public int getNumero() {
		return numero;
	}
	
	public Palo getPalo() {
		return palo;
	}
	
	public void inforCarta(){
		System.out.println(this.numero +" " +this.palo);
	}
	
}
