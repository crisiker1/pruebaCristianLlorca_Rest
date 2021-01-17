package com.prueba.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prueba.app.fichero.Fichero;
import com.prueba.app.anagrama.Anagrama;

@SpringBootApplication
public class PruebaCristianLlorcaRestApplication {

	
	private static Fichero f;
	private static Anagrama a;
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		SpringApplication.run(PruebaCristianLlorcaRestApplication.class, args);
		
		
	}

}
