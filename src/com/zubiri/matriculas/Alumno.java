package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

final public class Alumno extends Persona {
	
	//A�o en el que se inscribi� por primera vez en alguna asignatura
	private int añoInscripcion = -1;
	//Ciclo que cursa el alumno
	private String ciclo = null;
	
	//Matr�culas realizadas a lo largo de los a�os en las distintas asignaturas
	private ArrayList<Matricula> matriculas = null;
	
	public Alumno (){
		
	}
	
	public Alumno (String dni, String nombre, String apellido, int añoInscripcion, String ciclo , ArrayList<Matricula> matriculas) {
		super (dni,nombre,apellido);
		this.añoInscripcion = añoInscripcion;
		this.ciclo = ciclo;
		this.matriculas = matriculas;
	}
	
	public Alumno (Scanner sc) throws InputMismatchException{
		super(sc);
		System.out.println(" El año de inscripcion del alumno ");		
		this.setAñoInscripcion(sc.nextInt());
		System.out.println("Escribe el ciclo del alumno");
		this.setCiclo(sc.next());
		System.out.println(" la matricula del alumno ");		
		this.setMatriculas(matriculas);
		

	}
	
	public int getAñoInscripcion() {
		return añoInscripcion;
	}
	
	public void setAñoInscripcion(int añoInscripcion) {
		this.añoInscripcion = añoInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	

	public String formatted(){
		
		String AlumnoStr =  super.formatted() +
				"AÑO INSCRIPCION:" + this.añoInscripcion + "\n" + 
				"CICLO:" + this.ciclo  + "\n" ;
				
				return AlumnoStr;
		
	}

}
