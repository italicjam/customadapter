package edu.continental.beans;

import android.media.Image;

public class Titulos {

	private String titulo;
	private String descripcion;
	private int image;
	
	public Titulos(String titulo, String descripcion, int image) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.image = image;
	}


	public Titulos() {
		super();
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getImage() {
		return image;
	}


	public void setImage(int image) {
		this.image = image;
	}
	
	
	
	
	
}
