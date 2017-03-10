package Ejercicio1;

import java.util.Scanner;

public class Menu {
	private int opcion;
	
	public Menu(){
		opcion = 0;
	}

	public int getOpcion() {
		return opcion;
	}
	
	public void menuPrincipal(){
		System.out.println("________MENU_PRINCIPAL________");
		System.out.println();
		System.out.println("1- Introducir datos");
		System.out.println("2- Generar datos aleatorios");
		System.out.println("3- Salir");
		System.out.println("______________________________");
		pideOpcion("Elige una opción:");
	}
	
	private void pideOpcion(String msj){
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		
		System.out.println(msj);
		if(sc.hasNextInt()){
			opcion = sc.nextInt();
			if(opcion<1 || opcion>3)
				pideOpcion("Elija una opcion valida");
		}else
			pideOpcion("Introduzca un numero para seleccionar una opcion");
		
		this.opcion=opcion;
	}
}
