package com.example.alumnos;

public class Titular 
{
	private String nombreCurso, cicloCurso;
	int img;
	
	Titular (String nombre, String ciclo, int imagen)
	{
		this.nombreCurso = nombre;
		this.cicloCurso = ciclo;
		this.img = imagen;
	}
	
	public String getNombre()
	{
		return this.nombreCurso;
	}
	
	public String getCiclo()
	{
		return this.cicloCurso;
	}
	
	public int getImagen()
	{
		return this.img;
	}
	
	public void setNombre(String nombre)
	{
		this.nombreCurso = nombre;
	}
	
	public void setCiclo(String ciclo)
	{
		this.cicloCurso = ciclo;
	}
	
	public void setImagen(int imagen)
	{
		this.img = imagen;
	}
}
