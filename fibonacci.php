<!DOCTYPE html>
<html>
<head>
    <title>Series de Fibonacci</title>
</head>
 
<body>
 
    <?php
    /**
     * Author Nordevelop
     *Función que muestra por pantalla los números de fibonacci
     * 
     * @params $numero - Tiene que recibir el numero de sucesiones
     *
     * @return array - lista de los numeros
     */
    function fibonacci($numero)
    {
        $numeros=[0,1];
        for ($i = 2; $i < $numero; $i++) {
            $numeros[$i] = $numeros[$i - 2] + $numeros[$i - 1];
        }
        return $numeros;
    }
 
    // Ejecutamos la función pasándole como parámetro el numero 
    $resultado=fibonacci(13);
    echo join(",", $resultado); // 0,1,1,2,3,5,8,13,21,34
    ?>
 
</body>
</html>
