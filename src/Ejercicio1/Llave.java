package Ejercicio1;

import java.util.Scanner;

public class Llave {
	private Pin[] pines;	
	
	public Llave(){
		int nPines = (int) (Math.random()*6+1);
		this.pines = new Pin[nPines];
		creaPinesAleatorios(nPines);
	}
	
	public Llave(int nPines){
		this.pines = new Pin[nPines];
		creaPinesDeterminados(nPines);
	}

	public Pin[] getPines() {
		return pines;
	}
	
	private void creaPinesDeterminados(int nPines){
		Scanner sc = new Scanner (System.in);
		int alturaPin;
		
		for(int i=0;i<nPines;i++){
			System.out.println("Altura para el pin " +(i+1) +" (Valores permitidos de 0 a 10):");
			alturaPin = sc.nextInt();
			pines[i] = new Pin(alturaPin);
		}
	}
	
	private void creaPinesAleatorios(int nPines){
		for(int i=0;i<nPines;i++){
			pines[i] = new Pin();
		}
	}
	
	public void imprimeDatosLlave(){
		System.out.println("Esta llave tiene " +this.pines.length +" pines:");

		for(int i=0;i<this.pines.length;i++)
			System.out.println("  Altura pin " +(i+1) +": " +this.pines[i].getAltura());
		
		System.out.println();
	}
	
	public boolean abreCerradura(Cerradura c){
		int nPines = this.pines.length;
		int nCortes = c.getBombin().getCortes().length;
		
		
		if(nPines != nCortes){
			return false;
		}else{
			for(int i=0;i<nPines;i++){
				int unPin = this.pines[i].getAltura();
				int unCorte = c.getBombin().getCortes()[i].getAltura();
				if(unPin + unCorte != 10)
					return false;
			}
		}
		return true;
	}
	
	
	public class Pin {
		private int altura;
		private static final int MAX_ALTURA = 10;
	
		public Pin(){
			this.altura = (int) (Math.random()*11);
		}
			
		public Pin(int altura){
			if(altura<0){
				System.out.println("Valor no permitido.");
				this.altura = 0;
				System.out.println("Altura del pin establecida en " +this.altura +" unidades.");
			}else if(altura<=MAX_ALTURA)
				this.altura=altura;
			else{
				System.out.println("Ha sobrepasado la altura máxima del pin.");
				this.altura = MAX_ALTURA;
				System.out.println("Altura del pin establecida en " +this.altura +" unidades.");
			}
		}
	
		public int getAltura() {
			return altura;
		}		
	}
	
	
	
	
}


