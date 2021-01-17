package com.prueba.app.anagrama;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Anagrama {

	//Compara los valores del HashMap y devuelve una Lista con la palabra y su anagrama
	public ArrayList<String> ProcesarAnagrama(HashMap<String, String> fichero)
			throws FileNotFoundException, IOException {
		HashMap<String, String> fichero2 = new HashMap<String, String>();
		fichero2 = fichero;
		ArrayList<String> anagramaFinal_palabras = new ArrayList<String>();

		try {

			for (Map.Entry<String, String> palabra1 : fichero.entrySet()) {
				String valor = palabra1.getValue();

				if (fichero2.containsValue(valor)) {
					String key1 = palabra1.getKey();
					String key2 = fichero2.get(valor);

					anagramaFinal_palabras.add("Palabra: " + key1 + " es anagrama de: " + valor);

				}
			}

		} catch (Exception e) {
			System.out.println("Excepcion del Anagrama: " + e);
		}
		return anagramaFinal_palabras;

	}

}
