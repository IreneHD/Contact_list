package agenda;

public class Contact {
	
	private String Nombre;
	private String Apellidos;
	private String Direcci�n;
	private String Correo;
	private String Tel�fono;
	
	
	public Contact(String Name, String Surnames, String Address, String Email, String Mobile) {
		Nombre = Name;
		Apellidos = Surnames;
		Direcci�n = Address;
		Correo = Email;
		Tel�fono = Mobile;
	}
	

	public void mostrarContacto() {
		System.out.println("---------------Contacto-----------------");
		System.out.println("Nombre: " + this.Nombre);
		System.out.println("Apellidos: " + this.Apellidos);
		System.out.println("Direcci�n: " + this.Direcci�n);
		System.out.println("Correo: " + this.Correo);
		System.out.println("Tel�fono: " + this.Tel�fono);
		System.out.println("--------------------------------");
	}
	
}