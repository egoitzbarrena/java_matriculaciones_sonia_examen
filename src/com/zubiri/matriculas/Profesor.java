package com.zubiri.matriculas;

import java.util.Scanner;


final public class Profesor extends Persona {
	
	String titulacion;
	String departamento;
	
	
	public Profesor (){
		
	}
	
	public Profesor(String dni, String nombre, String apellido, String titulacion, String departamento) {
		super (dni,nombre,apellido);
		this.titulacion = titulacion;
		this.departamento= departamento;
	}
	
	public Profesor(Scanner sc) throws Exception{
		
		super(sc);
		
		System.out.println("Escribe la titulacion que tiene el profesor ");		
		this.setTitulacion(sc.next());
		System.out.println("Escribe el departamento del profesor");
		this.setDepartamento(sc.next());

	}
	

	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) throws Exception {
		

		switch (departamento){
		case "Grado Medio":
		case "Grado Superior":
		case "Carrera Universitaria":
		case "Grado Universitaro":
			this.titulacion = titulacion;
			break;
		default:
			throw new Exception("TITULACION PERMITIDA: Grado Medio , Grado Superior , Carrera Universitaria , Grado Universitario");
	}
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) throws Exception {
		
		switch (departamento){
		case "Matematica":
		case "Informatica":
		case "Idiomas":
		case "Economia":
		case "Filosofia":
		case "Gimnasia":
			this.departamento = departamento;
			break;
		default:
			throw new Exception("DEPARTAMENTOS PERMITIDOS: Matematica , Informatica , Idiomas , Economia , Filosofia , Gimnasia");
	}
	}
	
	public String formatted(){
		
		String ProfesorStr =  super.formatted() +
				"TITULACION:" + this.titulacion + "\n" + 
				"DEPARTAMENTO:" + this.departamento  + "\n" ;
				
				return ProfesorStr;
		
	}
	
}
