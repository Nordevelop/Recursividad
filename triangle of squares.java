package triangulo;
import java.io.*;
import java.util.*;

public class Main {
	static int n;

	public static void main(String[] args) throws IOException {
	   /*Triangulo de cuadrados
	    * Author Nordevelop
	    * Recursividad
	    */
	   System.out.print("ingrese un numero: ");
	      n= getInt();
	   int theAnswer = triangulo(n);
	   System.out.println("Triangulo="+theAnswer);
	} // end main()
	public static int triangulo(int n){
	
        if(n==1)
	   return 1;
	else
	   return( n + triangulo(n-1));
	} //fin metodo trinagulo
	public static String getString() throws IOException{
		
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String s = br.readLine();
	return s;
	} //fin metodo getString
	
	public static int getInt() throws IOException{
		
	String s = getString();
	return Integer.parseInt(s);
	}//fin metodo getInt
	
		
}fin Main
