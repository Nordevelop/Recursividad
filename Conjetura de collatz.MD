
                                                   CONJETURA DE COLLATZ

Nuestro siguiente ejemplo es el programa para probar la Conjetura de Collatz, también conocida como el Problema de 3x + 1
Problema, debido a Lothar Collatz.1 La conjetura afirma que todo número entero positivo puede transformarse
a 1 aplicando sucesivamente la siguiente transformación:
(*) si el número es par, se divide por 2; en caso contrario, se multiplica por 3 y luego se le suma 1.
Por ejemplo, 7 se transforma en 1 siguiendo el procedimiento siguiente:
7 → 22 → 11 → 34 → 17 → 52 → 26 → 13 → 40 →
20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
El académico portugués Tomás Oliveira e Silva ha llevado a cabo una amplia investigación sobre esta conjetura.
Mediante una simulación por ordenador, ha descubierto que la conjetura es válida hasta 5 × 260.
Considere la posibilidad de recibir una entrada del usuario y comprobar si la conjetura es válida o no para la
aplicando repetidamente la regla de transformación hasta que el número se convierta en 1. Diseñamos el código
utilizando tres métodos: retorno, main,test.
- El método retorno recibe un número entero como parámetro formal, aplica las reglas de transformación
sólo una vez al número, y devuelve el número generado.
- El método test recibe un entero positivo como parámetro formal, y realiza la prueba sobre el número. 
Después de cada aplicación de la regla, el método imprime el número generado.
- El método main interactúa con el usuario para recibir los números de entrada, y luego realiza la prueba sobre
de los mismos. El usuario puede probar la conjetura con un número indefinido de entradas. El programa termina
cuando el usuario introduce un número no positivo.
A continuación se muestra el código fuente del programa. Después de la cabecera del programa, aparece el método retorno
aparece el método retorno. El parámetro formal del método es un entero llamado número. El método devuelve un valor entero..
