
public class ControlSoldado extends Militar{

	public ControlSoldado() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General gene = new General();
		Coronel coro = new Coronel();
		Soldado sol = new Soldado();
		
		
		//Soldado
			System.out.println("Soldado");
			System.out.println("Horas: "+sol.Horas());
			System.out.println("Salario: "+sol.Salario());
			System.out.println("Vacaciones: "+sol.Vacaciones());
			sol.recibeOrden();
			
		//Militar
			System.out.println("Militar");
			System.out.println("Horas: "+sol.getHoras());
			System.out.println("Salario: "+sol.getSalario());
			System.out.println("Vacaciones: "+sol.getDiasVacaciones());
			sol.recibeOrden();
			
		//General
			System.out.println("General");
			System.out.println("Vacaciones: "+gene.getDiasVacaciones());
			System.out.println("Formulario vacaciones: "+gene.getFormularioVacaciones());
			gene.planificaEstrategia();
			
		//Teniente
			coro.tomaOrdenCoronel("Pablo");
		
		//Coronel
			System.out.println("Coronel");
			System.out.println("Salario: "+coro.getSalario());
			coro.ejecutaOrdenManiobra();
		
	}
}

