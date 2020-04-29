package agenda;
/**
 * Clase donde se encuentras los atributos de la agenda de la base de datos
 * 
 * @author Irene Hermida D�az
 *
 */
public class Contact {
	private String Nombre;
	private String Apellidos;
	private String Direcci�n;
	private String Correo;
	private String Tel�fono;
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
		Direcci�n = Address;
		Correo = Email;
		Tel�fono = Mobile;
	}

	/**
	 * M�todo mostrar
	 */
	public void mostrarContacto() {
		System.out.println("");
		System.out.println("---------------CONTACTO-----------------");
		System.out.println("  - Nombre: " + this.Nombre);
		System.out.println("  - Apellidos: " + this.Apellidos);
		System.out.println("  - Direcci�n: " + this.Direcci�n);
		System.out.println("  - Correo: " + this.Correo);
		System.out.println("  - Tel�fono: " + this.Tel�fono);
		System.out.println("----------------------------------------");
		System.out.println("");
	}

}