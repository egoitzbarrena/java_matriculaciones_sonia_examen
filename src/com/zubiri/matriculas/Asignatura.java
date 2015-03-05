package com.zubiri.matriculas;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Asignatura {

	String nombre;
	int creditos;
	Profesor profesor;
	
	public Asignatura(){
		
	}
	
	public Asignatura (String nombre, int creditos, Profesor profesor) {		
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	
	public Asignatura (Scanner sc) throws InputMismatchException {
		
		System.out.println("Nombre de la asignatura:");
		this.setNombre(sc.next());
		
		System.out.println("Creditos de la asignatura");
		this.setCreditos(sc.nextInt());
		
		System.out.println("Profesor de la asignatura");
		this.setProfesor(Profesores.buscarProfesor(sc.next()));
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
		
		String AsignaturaStr = 
				"NOMBRE:" + this.nombre + "\n" + 
				"CREDITOS:" + this.creditos  + "\n" +
				"PROFESOR:" + this.profesor  + "\n" ;
				
				return AsignaturaStr;
		
	}
	
	/**
	 * M�todo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 * @throws Exception 
	 */
	public void split(String personaStr, char separator) throws Exception {
		
		String palabra = (Character.toString(separator));
		String [] cortarString1 = null;	
		String [] cortarString2 = null;	
		
		if ( personaStr  == null) {
			System.out.println("No has metido la persona");
		}
		
		while ((personaStr != null)) {
			String [] cortarString = personaStr.split(palabra);
			cortarString1 = cortarString[0].split(palabra);
			this.setNombre(cortarString1[0]);
			this.setCreditos(Integer.parseInt(cortarString1[1]));
			Profesor profesor = new Profesor();
			cortarString2 = cortarString[1].split(palabra);
			profesor.setNombre(cortarString2[0]);
			profesor.setDni(cortarString2[1]);
			profesor.setApellido(cortarString2[2]);
			profesor.setTitulacion(cortarString2[3]);
			profesor.setDepartamento(cortarString2[4]);
			
		}
		
	}

}
