package agenda;

import java.util.Scanner;

public class Contact_list {
	
	public static void main(String args[]) {
		
		Nexo.conectar();
		
		Scanner teclado = new Scanner (System.in);
		do {
		System.out.println("Introduzca el correo o el teléfono a buscar: ");
		String respuesta = teclado.nextLine();
		Nexo.mostrar(respuesta);
		//probando la rama
		}while(true);
	}
}
