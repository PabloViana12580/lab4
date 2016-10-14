public class Soldado extends Militar {

	public Soldado() {
		// TODO Auto-generated constructor stub
	}
	
    public int Horas() {
        return super.getHoras()*2;           // trabaja 80 horas / semana
    }
    
    public double Salario() {
        return super.getSalario()-10000.0;      // Q30,000.00 / anio
    }
    
    public int Vacaciones() {
        return super.getDiasVacaciones()/2;           // 2 semanas de vacaciones pagadas
    }
    
    public void recibeOrden(){
    	System.out.println("Ordene mi General");
    }

    public String FormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    
    }
}
