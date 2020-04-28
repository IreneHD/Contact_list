package agenda;

public class Contact {
	
	private String Nombre;
	private String Apellidos;
	private String Dirección;
	private String Correo;
	private String Teléfono;
	
	
	public Contact(String Name, String Surnames, String Address, String Email, String Mobile) {
		Nombre = Name;
		Apellidos = Surnames;
		Dirección = Address;
		Correo = Email;
		Teléfono = Mobile;
	}
	

	public void mostrarContacto() {
		System.out.println("---------------Contacto-----------------");
		System.out.println("Nombre: " + this.Nombre);
		System.out.println("Apellidos: " + this.Apellidos);
		System.out.println("Dirección: " + this.Dirección);
		System.out.println("Correo: " + this.Correo);
		System.out.println("Teléfono: " + this.Teléfono);
		System.out.println("--------------------------------");
	}
	
}