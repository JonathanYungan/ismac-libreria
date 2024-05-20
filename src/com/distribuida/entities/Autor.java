package com.distribuida.entities;

import java.util.Date;

public class Autor {

	//ATRIBUTOS
	private int idAutor;
	private String nombre;
	private String apellido;
	private String pais;
	private String direccion;
	private String telefono;
	private String correo;

	//CONSTRUCTOR 
	public Autor(int idAutor, String nombre, String apellido, String pais, String direccion, String telefono,
			String correo) {
		super();
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		//METODOS SETTERS AND GETTER
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "autor [idAutor=" + idAutor + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + "]";
	}

	
	
	
}