package primer_Parcial;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random ran = new Random();

		ArrayList<Heladera> heladeras = new ArrayList<Heladera>();
		ArrayList<Cocina> cocinas = new ArrayList<Cocina>();
		ArrayList<Lavarropa> lavarropas = new ArrayList<Lavarropa>();
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

		for (int i = 0; i < 10; i++) {
			heladeras.add(new Heladera("Modelo" + i, ran.nextDouble(10000.0), "Marca" + i, "Rojo", 100, 110));
			cocinas.add(new Cocina("Modelo" + i, ran.nextDouble(10000.0), "Marca" + i, "Rojo", "Electrica"));
			lavarropas.add(new Lavarropa("Modelo" + i, ran.nextDouble(10000.0), "Marca" + i, "Rojo", "Frontal", 110));
		}


		System.out.println("\nCocinas recomendadas:");
		for (int i = 0; i < 3; i++) {
			System.out.println(cocinas.get(ran.nextInt(0, 10)).toString());
		}
		System.out.println("\nHeladeras recomendadas: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(heladeras.get(ran.nextInt(0, 10)).toString());
		}
		System.out.println("\nLavarropas recomendadas: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(lavarropas.get(ran.nextInt(0, 10)).toString());
		}

		for (int i = 0; i < 3; i++) {

			var aux = ran.nextInt(1,4);
			switch (aux) {
			case 1:
				electrodomesticos.add(cocinas.get(ran.nextInt(0, 10)));
				break;
			case 2:
				electrodomesticos.add(heladeras.get(ran.nextInt(0, 10)));
				break;
			case 3:
				electrodomesticos.add(lavarropas.get(ran.nextInt(0, 10)));
				break;
			default:

			}
		}
		
		System.out.println("\n\nELectrodomesticos General: ");
		for (Electrodomestico valor : electrodomesticos) {
			System.out.println(valor.toString());
		}

	}

}
