package com.zubiri.matriculas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Profesores {
	
	private static ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
	
	public Profesores(){
		
	}
	
	
	public Profesores (ArrayList<Profesor> listaProfesores){
		
		this.listaProfesores = listaProfesores;
	}

	public static ArrayList<Profesor> getListaProfesores() {
		return listaProfesores;
	}

	public static void setListaProfesores(ArrayList<Profesor> listaProfesores) {
		Profesores.listaProfesores = listaProfesores;
	}	
	
	public static void leerProfesores(String fichero) throws IOException {
		String linea;
		FileInputStream f;
	    InputStreamReader fr;
	    BufferedReader br;
	    
	    f = new FileInputStream(fichero);
    	fr = new InputStreamReader(f, "UTF8");
    	br = new BufferedReader(fr);
    	linea = br.readLine();
		
		if (linea == null) {
			System.out.println("No existen profesores en el fichero");
		}
		
		while ((linea != null) && (linea.compareTo("") != 0)) {
			Profesor profesor = new Profesor (",", linea, linea, linea, linea);
			listaProfesores.add(profesor);
			linea = br.readLine();
		}
		br.close();
 }
	
	 public static Profesor buscarProfesor(String nombre) {
			
			int i = 0;
			Profesor profesor = null;

			do {		
				if (listaProfesores.get(i).getNombre().equalsIgnoreCase(nombre)) {
					profesor = (Profesor)listaProfesores.get(i);
				}
				i++;
			} while ((profesor == null) && (i < listaProfesores.size()));
			
			if (profesor == null) {
				System.out.println("Profesor: No se ha encontrado el profesor en nuestra base de datos. Se cierra el programa.");
				System.exit(-1);
			}

			return profesor;
		}
	 
	 public static void mostrarProfesores() {
			
			if (listaProfesores.size() == 0) {
				System.out.println("No se han cargado los profesores del fichero");
			}
			for (int i = 0;i < listaProfesores.size();i++) {
				System.out.println(listaProfesores.get(i).formatted());
			}
		}
	 
	 public static void anadirProfesor(Profesor profesor){
		listaProfesores.add(profesor);
	}
	 
	 public static void borrarProfesor(String nombre){
			listaProfesores.remove(buscarProfesor(nombre));
	 }
	

}
