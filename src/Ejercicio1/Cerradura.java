package Ejercicio1;

public class Cerradura {
	private Bombin bombin;
	private boolean abierta;
	
	
	public Cerradura(){
		this.bombin = new Bombin();
		this.abierta = false;
	}
	
	public Cerradura(int cortesBombin){
		this.bombin = new Bombin(cortesBombin);
		this.abierta = false;
	}

	public boolean getEstado() {
		return abierta;
	}

	public void setEstado(boolean estado) {
		this.abierta = estado;
	}
	
	public Bombin getBombin() {
		return bombin;
	}

	public String estadoCerradura(){
		if(this.abierta)
			return "Con esta llave SI se puede abrir la cerradura \n";
		else
			return "Con esta llave NO se puede abrir la cerradura \n";
	}
	
	public void imprimeDatosCerradura(){
		System.out.println("El bombin de la cerradura tiene " +this.bombin.getCortes().length +" cortes:");
		
		for(int i=0;i<this.bombin.getCortes().length;i++){
			System.out.println("  Altura corte " +(i+1) +": " +this.bombin.getCortes()[i].getAltura());
		}
		System.out.println();
	}
}
