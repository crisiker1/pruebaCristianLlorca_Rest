package com.prueba.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.app.anagrama.Anagrama;
import com.prueba.app.fichero.Fichero;

@SpringBootTest
class PruebaCristianLlorcaRestApplicationTests {

	private static Fichero f;
	private static Anagrama a;
	
	@BeforeEach
	void init(TestInfo testInfo) throws Exception {
		System.out.println("Iniciando: " + testInfo.getDisplayName());
	}
	
	
	@Test
	void contextLoads() throws FileNotFoundException, IOException{
		String fichero = "C:\\Users\\Cris\\Documents\\wordlist2.txt";
		HashMap<String, String> miFichero = new HashMap<String, String>();
		ArrayList<String> anagramaFinal = new ArrayList<String>();
		
		f = new Fichero();
		a = new Anagrama();
		miFichero = f.LeerFichero(fichero);
		anagramaFinal = a.ProcesarAnagrama(miFichero);
		
		for(int i =0; i<anagramaFinal.size();i++) {
			System.out.println(anagramaFinal.get(i));
		}
	}
	
	
	@AfterEach
	void tearDown(TestInfo testInfo) throws Exception {
		System.out.println("Finalizando: " + testInfo.getDisplayName());
	}

}
