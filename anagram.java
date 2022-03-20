package misClases;

import java.util.*;
import java.io.*;

public class Main {
	static int tamanio;
	static int cont;
	static char[] arrChar = new char[100];

	public static void main(String[] args) throws IOException{
	/* Anagrama imprime en pantalla la mayor cantidad.-
	 *  de palabras con las letras que ingresa el usuario.
	 * Author Nordevelop
	 * https://github.com/Nordevelop/Recursividad
	 */
	System.out.print("ingrese una palabra: ");
	String input = getString();
	tamanio = input.length(); 
	cont = 0;
	for(int j=0; j<tamanio; j++) 
	    arrChar[j] = input.charAt(j);
        doAnagram(tamanio); // anagram it
	} // end main()
	public static void doAnagram(int newtamanio){
	
	if(newtamanio == 1)
	return; 
	for(int j=0; j<newtamanio; j++){ // for each
	   doAnagram(newtamanio-1); 
	if(newtamanio==2) 
	   mostrarpalabras(); //mostrar en pantalla
	rotación(newtamanio); // rotar palabra
	}//fin if
	}//fin for
		
	// rotar a la derecha todos los caracteres, desde la posicion hasta el final del Vector
	public static void rotación(int newtamanio){
	int j;
	int posicion = tamanio - newtamanio;
	char temp = arrChar[posicion];//guardar 1ra letra
	for(j=posicion+1; j<tamanio; j++) 
	   arrChar[j-1] = arrChar[j];
	arrChar[j-1] = temp; 
	}//fin metodo rotacion
	public static void mostrarpalabras(){
	if(cont < 99)
	   System.out.print(" ");
	if(cont < 9)
	   System.out.print(" ");
	System.out.print(++cont +" ");
	for(int j=0; j<tamanio; j++)
	   System.out.print( arrChar[j] );
	System.out.print(" ");
	System.out.flush();
	if(cont%6 == 0)
      	   System.out.println(" ");
	}//fin metodo mostrar palabras
	public static String getString() throws IOException{
	   InputStreamReader isr = new InputStreamReader(System.in);
	   BufferedReader br = new BufferedReader(isr);
	   String s = br.readLine();
	   return s;
	}//fin metodo getString()

}
