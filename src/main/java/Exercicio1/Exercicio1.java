package Exercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.*/
public class Exercicio1 {

    public static int get_number(Scanner scanner){
        System.out.println("Enter a integer number");
        try{
            return scanner.nextInt();
        }
        catch(Exception e){
            if(e instanceof InputMismatchException){
                System.out.println("The number must be a integer number, try again.");
                scanner.next();
                return get_number(scanner);
            }
            else{
                throw e;
            }
        }
    }
    public static int[] get_row(Scanner scanner){
        int[] row = new int[4];
        for(int i = 0; i < 4; i++){
            row[i] = get_number(scanner);
        }
        return row;
    }

    public static int[][] get_voxcel(Scanner scanner){
        int [][] voxcel = new int[4][4];
        for(int i = 0;i < 4;i++){
            voxcel[i] = get_row(scanner);
        }
        return voxcel;
    }

    public static int get_bigger_ten(int[][] voxcel){
        ArrayList<Integer> bigger_ten = new ArrayList<Integer>();
        for(int i = 0; i < 4; i++){
            for(int x = 0; x < 4; x ++){
                if(voxcel[i][x] > 10){
                    bigger_ten.add(voxcel[i][x]);
                }
            }
        }

        return bigger_ten.size();
    }
    public static void main(String[] args){
        System.out.printf("The amount of  numbers bigger than 10 is %d", get_bigger_ten(get_voxcel(new Scanner(System.in))));
    }

}
