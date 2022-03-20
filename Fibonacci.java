package misClases;

import java.util.Scanner;
import java.util.*;
public class Main {

	
		 static int fibMemo[];

		    public static void main(String args[]) {
		    /*Sucesión Fibonacci
		     * 
		     * Author Nordevelop
		     */
		    int num = 0;
		    Scanner entra=new Scanner(System.in);
		    System.out.println("ingrese cuantos números desea hacer Fibonacci:  ");
		       num = entra.nextInt();
		    System.out.print("Sucesión Fibonacci: ");
		    Long comienzo_tiempo_bucle_For = System.nanoTime();
		    int fibSeries[] = fib(num);
		    for (int i = 0; i < fibSeries.length; i++) {
		        System.out.print(" " + fibSeries[i] + " ");
		    }
		    Long Detencion_Tiempo_Ciclo_For = System.nanoTime();
		    System.out.println("");
		    System.out.println("Tiempo de ejecución del ciclo For:" + (Detencion_Tiempo_Ciclo_For - comienzo_tiempo_bucle_For));
        Long startTimeRecursion = System.nanoTime();
		    int fibSeriesRec[] = fibo_Rec(num);
        for (int i = 0; i < fibSeriesRec.length; i++) {
            System.out.print(" " + fibSeriesRec[i] + " ");
       }
       Long stopTimeRecursion = System.nanoTime();
       System.out.println("");
       System.out.println("Tiempo de Recursividad:" + (stopTimeRecursion -startTimeRecursion));
       Long startTimeMemo = System.nanoTime();
       fibMemo = new int[num];
       fiboRec_Memo(num-1);
       for (int i = 0; i < fibMemo.length; i++) {
           System.out.print(" " + fibMemo[i] + " ");
       }
       Long detencion_tiempo_memoria = System.nanoTime();
       System.out.println("");
       System.out.println("Tiempo de Memorización:" + (detencion_tiempo_memoria - startTimeMemo));

		    }
		    public static int fiboRec_Memo(int num){
        if(num == 0){
          fibMemo[0] = 0;
		      return 0;
		   }
       if(num ==1 || num ==2){
		      fibMemo[num] = 1;
		      return 1; 
		   }

		   if(fibMemo[num] == 0){
		         fibMemo[num] = fiboRec_Memo(num-1) + fiboRec_Memo(num -2);
		         return fibMemo[num];
		        }
		        else{
		            return fibMemo[num];
		        }

		    }
		    public static int[] fibo_Rec(int num) {
		        int fib[] = new int[num];
            for (int i = 0; i < num; i++) {
		            fib[i] = fibRec(i);
		        }
		        return fib;
		    }

		    public static int fibRec(int num) {
		        if (num == 0) {
		            return 0;
		        } else if (num == 1 || num == 2) {
		            return 1;
		        } else {
		            return fibRec(num - 1) + fibRec(num - 2);
		        }
		    }
  		    public static int[] fib(int num) {
		        int fibSum[] = new int[num];
		        for (int i = 0; i < num; i++) {
		            if (i == 0) {
		                fibSum[i] = i;
		                continue;
		            }

		            if (i == 1 || i == 2) {
		                fibSum[i] = 1;
		                continue;
		            }

		            fibSum[i] = fibSum[i - 1] + fibSum[i - 2];

		        }
		        return fibSum;
		    }

		
		

	}
