package Ejercicio1;

import java.util.Scanner;

public class Bombin {
	private Corte[] cortes;
	private static final int MAX_CORTES = 3;
	
	
	public Bombin(){
		int nCortes = (int) (Math.random()*3+1);
		this.cortes = new Corte[nCortes];
		creaCortesAleatorios(nCortes);
	}
	
	public Bombin(int nCortes){
		if(nCortes<0){
			System.out.println("Valor no permitido, se establecerá 1 único corte.");
			this.cortes = new Corte[1];
		}else if(nCortes<=MAX_CORTES)
			this.cortes = new Corte[nCortes];
		else{
			System.out.println("El bombin no puede tener mas de 3  cortes,");
			this.cortes = new Corte[MAX_CORTES];
		}
		System.out.println("El bombin de la cerradura tiene " +this.cortes.length +" cortes.");
		creaCortesPredeterminados(this.cortes.length);
	}

	public Corte[] getCortes() {
		return cortes;
	}
	
	public void creaCortesAleatorios(int nCortes){
		for(int i=0;i<nCortes;i++){
			cortes[i] = new Corte();
		}
	}
	
	public void creaCortesPredeterminados(int nCortes){
		Scanner sc = new Scanner (System.in);
		int alturaCorte;
		
		for(int i=0;i<nCortes;i++){
			System.out.println("Altura para el corte " +(i+1) +" (Valores permitidos de 0 a 10):");
			alturaCorte = sc.nextInt();
			cortes[i] = new Corte(alturaCorte);
		}
	}
	
	public class Corte {
		private int altura;
		private static final int MAX_ALTURA = 10;
		
		public Corte(){
			this.altura = (int) (Math.random()*11);
		}
		
		public Corte(int altura){
			if(altura<0){
				System.out.println("Valor no permitido.");
				this.altura = 0;
				System.out.println("Altura del corte establecida en " +this.altura +" unidades.");
			}else if(altura<=MAX_ALTURA)
				this.altura=altura;
			else{
				System.out.println("Ha sobrepasado la altura máxima del corte.");
				this.altura = MAX_ALTURA;
				System.out.println("Altura del corte establecida en " +this.altura +" unidades.");
			}
		}

		public int getAltura() {
			return altura;
		}
	}
	
	
}
