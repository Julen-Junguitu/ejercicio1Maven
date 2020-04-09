package org.cuatrovientos.ed20_cadena;
/**
 * Aplicación que analiza una cadena
 * @author Julen
 *
 */
public class Cadena {
	/**
	 * Función para devolver la longitud de la cadena
	 * @param cadena
	 * @return valor resultado
	 */
	public int longitud(String cadena) {
		return cadena.length();
	}
	
	/**
	 * Función para devolver cuantas vocales minusculas contiene la cadena
	 * @param cadena
	 * @return valor resultado
	 */
	public int vocales(String cadena) {
		int cnt = 0;
		for(int i=0;i<cadena.length();i++) {
	
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'|| cadena.charAt(i) == 'u') { 
			cnt = cnt + 1;
			}	
		}
		return cnt;
	}
	
	/**
	 * Función para devolver la cadena en orden inverso
	 * @param cadena
	 * @return valor resultado
	 */
	public String invertir(String cadena) {
		String cadenaInvertida = "";
		
		for(int i=cadena.length()-1; i>=0;i--) {
			cadenaInvertida= cadenaInvertida + cadena.charAt(i);
		}
		return cadenaInvertida;
	}
	/**
	 * Función para devolver la cadena en orden inverso
	 * @param cadena
	 * @param character
	 * @return valor resultado
	 */
	public int contarLetra(String cadena, char caracter) {
		int cnt= 0;
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i) == caracter) {
				cnt = cnt + 1;
			}
		}
		return cnt;
	}
} 

	