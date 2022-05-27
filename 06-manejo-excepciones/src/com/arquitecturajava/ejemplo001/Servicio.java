package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servicio {

	static void prueba() throws Exception {
		try {
			File archivo = new File("G://hola.txt");
			archivo.createNewFile();
			System.out.println("Se creó archivo");
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fecha = dateFormat.parse("03/03/2017");
			
			System.out.println(fecha);
		} catch (IOException | ParseException e) {
			System.out.println("Log a fichero: El método falla por " + e.getMessage());
			throw e;
		} finally {
			System.out.println("Cerrando todos los recursos");
		}
	}

}
