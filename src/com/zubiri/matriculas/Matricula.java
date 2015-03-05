package com.zubiri.matriculas;

import java.util.InputMismatchException;
import java.util.Scanner;

final public class Matricula extends Asignatura {
	
	int añoMatriculacion;
    double precio;
    
    public Matricula(){
		
	}
    
    public Matricula (String nombre, int creditos, Profesor profesor, int añoMatriculacion, double precio) {
		super (nombre, creditos, profesor);
		this.añoMatriculacion = añoMatriculacion;
		this.precio = precio;
	}
	
	public Matricula (Scanner sc) throws InputMismatchException{
		
		super(sc);
		
		System.out.println("Escribe el año de matriculacion ");		
		this.setAñoMatriculacion(sc.nextInt());
		System.out.println("Escribe el precio de la matricula");
		this.setPrecio(sc.nextDouble());

	}
	
	public int getAñoMatriculacion() {
		return añoMatriculacion;
	}
	
	public void setAñoMatriculacion(int añoMatriculacion) {
		this.añoMatriculacion = añoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	public String formatted(){
		
		String MatriculaStr =  super.formatted() +
				"añoMatriculacion:" + this.añoMatriculacion + "\n" + 
				"precio:" + this.precio  + "\n" ;
				
				return MatriculaStr;
		
	}
	
	/**
	 * M�todo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matr�cula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		
		Double descuento = null;
		
		if ( porcentaje  == 0) {
			System.out.println("el porcentaje cero no vale, entonces no hay descuento.");
		}else 
		{
			descuento = ((porcentaje / 100) * this.getPrecio());
			
		}
			
		return descuento;
	}
	
}
