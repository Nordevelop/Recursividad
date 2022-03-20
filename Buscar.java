import java.util.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// author Nordevelop
		 int[] array={0,1,3,5,6,9,10,11,12,13};
	   int elementoBuscar=11;
	   int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);
	   System.out.println("elemento a buscar: ");
	   System.out.println(elementoBuscar);
	   System.out.println("elemento encontrado en el subindice: ");
	   System.out.println(posElementoEncontrado);
	   }
     public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
	   
     if(indice==array.length || array[indice]==elementoBuscar){
	      if(indice==array.length){
	          return -1; 
	          }
        celse
	          return indice;
       }
       else
	       return posicionElementoRecursivo(array, elementoBuscar, indice+1);
     }   
	         
}    
