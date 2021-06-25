// Dado um vetor de 10 posições, sendo respectivamente ocupado pelos valores 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.
// Imprima no console:
// a) Sua ordenação crescente.
// b) Sua ordenação decrescente.

import java.util.ArrayList;

public class ex06 {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};
        ordemCrescente(array);
        System.out.println();
        ordemDecrescente(array);
    }

    public static void ordemCrescente(Integer[] array) {
        int aux = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < (array.length - i); j++) {
                if(array[j-1] > array[j]) {
                    aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                }
            }
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void ordemDecrescente(Integer[] array) {
        int aux = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < (array.length - i); j++) {
                if(array[j-1] < array[j]) {
                    aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                }
            }
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
