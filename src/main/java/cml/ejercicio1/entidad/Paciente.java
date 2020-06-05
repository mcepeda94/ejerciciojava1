package cml.ejercicio1.entidad;

public class Paciente {
	
	private String rut;	
	private String nombre;
	private String apellido;
	private int edad;
	private boolean estadoCovid;
	private String fechaDeContagio;
	
	
	//generar objeto paciente 
	public Paciente (String rut, String nombre, String apellido,
			int edad, boolean estadoCovid, String fechaDeContagio) {
	//public Paciente (String rut, String nombre, String apellido,
			//int edad, String fechaDeContagio) {
		
		this.setRut(rut); 
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
		this.setEstadoCovid(estadoCovid);
		this.setFechaDeContagio(fechaDeContagio);
	}
	
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isEstadoCovid() {
		return estadoCovid;
	}
	public void setEstadoCovid(boolean estadoCovid) {

			this.estadoCovid = estadoCovid;
	}	
	public String getFechaDeContagio() {
		return fechaDeContagio;
	}
	public void setFechaDeContagio(String fechaDeContagio) {
		this.fechaDeContagio = fechaDeContagio;
	}
}
