package agenda;
/**
 * Clase donde se encuentras los atributos de la agenda de la base de datos
 * 
 * @author Irene Hermida Díaz
 *
 */
public class Contact {
	private String Nombre;
	private String Apellidos;
	private String Dirección;
	private String Correo;
	private String Teléfono;
	/**
	 * 
	 * @param Name
	 * @param Surnames
	 * @param Address
	 * @param Email
	 * @param Mobile
	 */
	public Contact(String Name, String Surnames, String Address, String Email, String Mobile) {
		Nombre = Name;
		Apellidos = Surnames;
		Dirección = Address;
		Correo = Email;
		Teléfono = Mobile;
	}

	/**
	 * Método mostrar
	 */
	public void mostrarContacto() {
		System.out.println("");
		System.out.println("---------------CONTACTO-----------------");
		System.out.println("  - Nombre: " + this.Nombre);
		System.out.println("  - Apellidos: " + this.Apellidos);
		System.out.println("  - Dirección: " + this.Dirección);
		System.out.println("  - Correo: " + this.Correo);
		System.out.println("  - Teléfono: " + this.Teléfono);
		System.out.println("----------------------------------------");
		System.out.println("");
	}

}