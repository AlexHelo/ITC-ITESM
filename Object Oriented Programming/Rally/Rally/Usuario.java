public class Usuario {
	public String nombre;
	Direccion direccion;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDireccion(Direccion d) {
		this.direccion = d;
	}

	public String getDireccion() {
		return direccion.getDireccion();
	}

	public String avanzar(String a) {
		return a;
	}

	public void avanzar(String a, int cuanto) {
	}
}