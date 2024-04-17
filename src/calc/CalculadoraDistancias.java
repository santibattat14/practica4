package calc;

import java.util.Scanner;


/**
 * Esta clase proporciona métodos para calcular la distancia de edición entre dos cadenas.
 */
public class CalculadoraDistancias {

    /**
     * Calcula la distancia de edición entre las cadenas s1 y s2.
     *
     * @param s1 La primera cadena.
     * @param s2 La segunda cadena.
     * @return La distancia de edición entre las cadenas s1 y s2.
     */
    public static int calcularDistancia(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Creamos una matriz para almacenar los resultados de subproblemas
        int[][] dp = new int[m + 1][n + 1];

        // Inicialización
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Recurrencia
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + 2));
                }
            }
        }

        // Terminación
        return dp[m][n];
    }
}
