package com.prueba.app.fichero;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Fichero {

	
	//Se lee el fichero, y devuelve cada linea en una posición de un HashMap con los valores ordenados alfabeticamente, en minuscula, y sin caracteres especiales
	public HashMap<String, String> LeerFichero(String fichero) throws FileNotFoundException, IOException {
		HashMap<String, String> miFichero = new HashMap<>();
		try {
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null) {
				String valor = linea.toLowerCase().replaceAll("[()-+.\\\\^/{}:,?¿]", "");
				char[] letras = new char[linea.length()];
				 for (int i = 0; i < letras.length; i++) {
					 letras[i] = linea.charAt(i);
				 }
				Arrays.sort(letras);
				miFichero.put(linea, valor);
			}
			fr.close();

		}catch (Exception e) {
			System.out.println("Excepcion del fichero " + fichero + ": " + e);
		}
		return miFichero;

	}
	
}

