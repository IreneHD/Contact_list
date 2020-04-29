package agenda;

import java.util.Scanner;

public class Contact_list {

	public static void main(String args[]) {

		Nexo.conectar();

		Scanner teclado = new Scanner(System.in);
		int parametro = 0;
		
		do {
			System.out.println("-----------AGENDA-----------");
			System.out.println("|  1 -> Buscar contactos   |");
			System.out.println("|  2 -> Cerrar             |");
			System.out.println("----------------------------");
			System.out.println("");
			System.out.print(" Escoja una opci�n: ");
			parametro = teclado.nextInt();
			teclado.nextLine();
			System.out.println("");
			
			switch (parametro) {
			case 1:
				System.out.print("Introduzca el correo o el tel�fono a buscar: ");
				String respuesta = teclado.nextLine();
				Nexo.mostrar(respuesta);
				break;
			case 2:
				System.out.println("Cerrando...");
				System.out.println("Agenda cerrada");
				break;
			default:
				System.out.println("-");
				break;
			}
		} while (parametro != 2);

	}
}
