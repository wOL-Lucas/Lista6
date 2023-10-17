/*Leia uma matriz 4 x 4, imprima a matriz e retorne à localização (linha e a coluna) do maior valor.*/
package Exercicio2;

import Exercicio1.Exercicio1;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[]args) {
        int[][] voxcel = Exercicio1.get_voxcel(new Scanner(System.in));
        int biggest_value = 0;
        int biggest_value_row = 0;

        for(int i = 0; i < 4; i++){
            for(int x = 0; x < 4; x ++){
                if(voxcel[i][x] > biggest_value){
                    biggest_value = voxcel[i][x];
                    biggest_value_row = i;
                }
                System.out.printf("%d ", voxcel[i][x]);
            }
            System.out.println();
        }

        System.out.printf("The biggest value is %d and it is in the row %d", biggest_value, biggest_value_row);

    }

}
