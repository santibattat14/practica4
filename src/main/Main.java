/*Copyright [2024] [Pablo de la Cruz Rodríguez y Santiago Battat Bevilacqua] Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
*/

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

