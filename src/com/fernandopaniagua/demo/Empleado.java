package com.fernandopaniagua.demo;

public class Empleado {
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String puesto;
	private int salarioAnual;
	
	public Empleado(String nombre, String apellido1, String apellido2, String puesto, int salarioAnual) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.puesto = puesto;
		this.salarioAnual = salarioAnual;
	}

	public Empleado(int id, String nombre, String apellido1, String apellido2, String puesto, int salarioAnual) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.puesto = puesto;
		this.salarioAnual = salarioAnual;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getSalarioAnual() {
		return salarioAnual;
	}

	public void setSalarioAnual(int salarioAnual) {
		this.salarioAnual = salarioAnual;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s trabaja de %s y tiene un salario de %d", nombre, apellido1, apellido2, puesto, salarioAnual);
	}
}
