
public class AlarmaEmergencia extends Alarma {

	public AlarmaEmergencia() {
}
	
	public void m1(){
		System.out.println("Emergencia 1");
	}	
	
	public void m2(){
		super.m1();
		super.m2();
	}
	
	public String toString(){
		String cadena = "Emergencia "+ super.toString();
		return cadena;
	}

}