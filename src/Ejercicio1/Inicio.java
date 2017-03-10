package Ejercicio1;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Menu m = new Menu();
		int opcion = m.getOpcion();
		
		do{
			m.menuPrincipal();
			opcion = m.getOpcion();
			switch(opcion){
				case 1: datosPredeterminados(); break;
				case 2: datosAleatorios(); break;
				case 3: System.out.println("Saliendo...");
			}
		}while(opcion !=3);
				
	}
	
	public static void datosAleatorios(){
		Llave key = new Llave();
		Cerradura c = new Cerradura();
		
		key.imprimeDatosLlave();		
		c.imprimeDatosCerradura();	
		c.setEstado(key.abreCerradura(c));
		System.out.println(c.estadoCerradura());
	}
	
	public static void datosPredeterminados(){
		Scanner sc = new Scanner(System.in);
		int pines;
		int cortes;
		
		System.out.println("¿Cuántos pines tiene la llave?");
		pines = sc.nextInt();
		
		if(pines<0){
			System.out.println("Valor no permitido, se establecerá 1 único pin");
			pines = 1;
		}
		
		Llave key = new Llave(pines);
		
		System.out.println("¿Cuántos cortes tiene el bombin de la cerradura?");
		cortes = sc.nextInt();
		Cerradura c = new Cerradura(cortes);
		
		key.imprimeDatosLlave();		
		c.imprimeDatosCerradura();
		c.setEstado(key.abreCerradura(c));
		System.out.println(c.estadoCerradura());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
