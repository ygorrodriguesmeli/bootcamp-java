import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Radixsort {

    public static void radixSort(int iArr[]) {
        // Atribuir os valores de iArr[] para String sArr[].
        String[] sArr = Arrays.toString(iArr).split("[\\[\\]]")[1].split(", ");
        // Completar sArr[] com 0 (zeros) à esquerda (coincidindo com o número de dígitos do maior número de iArr[]).
        int higherValue = 0;
        for(int i : iArr){
            if(i > higherValue) higherValue = i;
        }
        int width = Integer.toString(higherValue).length();
        for(int i = 0; i < sArr.length; i++) {
            sArr[i] = String.format("%0" + width + "d", Integer.parseInt(sArr[i]));
        }
        // Criar 10 listas inicialmente vazias. L0 (será a lista para colocar os números que terminam com 0 (zero),
        // em L1 colocaremos os números que terminam com 1, e assim por diante até L9.
        List<List<String>> L = new ArrayList<List<String>>();
        for(int i = 0; i < sArr.length; i++){
            int lastDigit = Integer.parseInt(sArr[i].substring(sArr[i].length() - 1));
            L.get(lastDigit).add(sArr[i]);
        }
        // Percorrer as listas em ordem: L0, L1, L2, … até L9 e carregar em uma estrutura de dados do tipo String os
        // elementos de L0, depois os de L1 e assim por diante.


    }

    public static void main(String[] args) {
        int iArr[] = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };
        radixSort(iArr);
        for(int i : iArr) {
            System.out.print(i + " ");
        }
    }
}
