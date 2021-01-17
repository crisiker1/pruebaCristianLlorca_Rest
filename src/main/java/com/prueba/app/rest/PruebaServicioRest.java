package com.prueba.app.rest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.app.anagrama.Anagrama;
import com.prueba.app.fichero.Fichero;

@RestController
public class PruebaServicioRest {

	private static Fichero f;
	private static Anagrama a;
	
	@GetMapping("/anagrama")
	public ArrayList<String> todos() throws FileNotFoundException, IOException{
		
		String fichero = "C:\\Users\\Cris\\Documents\\wordlist.txt";
		HashMap<String, String> miFichero = new HashMap<String, String>();
		ArrayList<String> anagramaFinal = new ArrayList<String>();
		
		f = new Fichero();
		a = new Anagrama();
		miFichero = f.LeerFichero(fichero);
		anagramaFinal = a.ProcesarAnagrama(miFichero);
		return anagramaFinal;
		
	}
	
}
