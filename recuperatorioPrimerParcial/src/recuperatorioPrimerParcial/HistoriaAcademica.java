package recuperatorioPrimerParcial;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HistoriaAcademica {

	private Map<Materia , Integer> materias = new HashMap<Materia, Integer>();

	public HistoriaAcademica() {

	}
	
	public void imprimirHistorial() {
		for (Entry<Materia, Integer> valor : materias.entrySet()) {    
			System.out.println( valor.getKey().impresion()+ " - Nota: "+valor.getValue());
		}
	}
	
	public void agregarMateria(Materia materia , Integer nota) {
		materias.put(materia, nota);
	}

	public Map<Materia, Integer> getMaterias() {
		return materias;
	}

	public void setMaterias(Map<Materia, Integer> materias) {
		this.materias = materias;
	}

	
}
