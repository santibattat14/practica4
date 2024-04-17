package main;
import calc.CalculadoraDistancias;

public class Main {

    /**
     * Método principal que muestra la distancia de edición entre "intention" y "execution".
     *
     * @param args Los argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Las dos palabras a comparar
        String s1 = "intention";
        String s2 = "execution";

        // Calcular la distancia de edición entre las dos palabras
        int distancia = CalculadoraDistancias.calcularDistancia(s1, s2);

        // Mostrar la distancia de edición entre las palabras
        System.out.println("La distancia de edición entre '" + s1 + "' y '" + s2 + "' es " + distancia);
    }
}

