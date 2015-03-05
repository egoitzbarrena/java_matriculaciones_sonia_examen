package com.zubiri.matriculas;

import java.util.Scanner;


public abstract class Persona {
	
	String dni;
	String nombre;
	String apellido;
	
	public Persona(){
		
	}
	
	public Persona (String dni, String nombre, String apellido) {		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona (Scanner sc) {
		
		System.out.println("Dni de la persona:");
		this.setDni(sc.next());
		
		System.out.println("Nombre de la persona");
		this.setNombre(sc.next());
		
		System.out.println("Apellido de la persona");
		this.setApellido(sc.next());
		
	}

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
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
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
		
		String PersonaStr = 
				"DNI:" + this.dni + "\n" + 
				"NOMBRE:" + this.nombre  + "\n" +
				"APELLIDO:" + this.apellido  + "\n" ;
				
				return PersonaStr;
		
	}
	
	
	/**
	 * M�todo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	
	
	public void split(String personaStr, char separator) {
		
		String palabra = (Character.toString(separator));
		
		String [] cortarString1 = null;	
		
		if ( personaStr  == null) {
			System.out.println("No has metido la persona");
		}
		
		while ((personaStr != null)) {
			String [] cortarString = personaStr.split(palabra);
			cortarString1 = cortarString[0].split(palabra);
			this.setDni(cortarString1[0]);
			this.setNombre(cortarString1[1]);
			this.setApellido(cortarString[2]);
			
			
		}
		
	}
}
