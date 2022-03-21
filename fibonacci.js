<script>
    /** Author Nordevelop
     * Función que muestra por pantalla los números de fibonacci
     * 
     * @params numero - Tiene que recibir el numero de sucesiones
     *
     * @return array - lista de los numeros
     */
    function fibonacci(numero)
    {
        let numeros=[0,1];
        for (let i = 2; i < numero; i++) {
            numeros[i] = numeros[i - 2] + numeros[i - 1];
        }
        return numeros;
    }
 
    // Ejecutamos la función pasándole como parámetro el numero 
    document.write(fibonacci(10)); // 0,1,1,2,3,5,8,13,21,34
</script>
