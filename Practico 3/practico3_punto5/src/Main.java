
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plebeyo pl = new Plebeyo();
		Araña añ = new Araña();
		Combate com = new Combate(pl, añ);
		
		try {
			com.iniciarCombate();
		}catch(ExcepcionVidaZero e){
			System.out.println(e.getMessage());
		}
		
	}

}
