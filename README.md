Prueba realizada para Alfatec. Sacar palabras anagrama de otras de fichero proporcionado.

Está formado por la clase Fichero, la clase Anagrama, la clase Rest y la clase Main, que es de donde se iniciará la aplicación Spring.
Desde el servicio Rest http://localhost:8080/anagrama, llamamos a la clase Fichero para que lea el fichero wordlist.txt que nos proporciona Alfatec, el cual nos devuelve un HashMap con las palabras del fichero.
Luego llamamos a la clase Anagrama, que recoge dicho HashMap, y devuelve una Lista con las palabras que tienen anagrama, y su correspondiente palabra anagrama.

Hay un test unitario de la clase principal.
