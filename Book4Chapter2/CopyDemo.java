/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book4Chapter2;

/**
 *
 * @author dmtshoeni
 */
import java.util.Arrays;

public class CopyDemo {

    public static void main(String args[]) {
        int arrayOriginal[] = {42, 55, 21};
        int arrayNew[]
                = Arrays.copyOf(arrayOriginal, 3);
        printIntArray(arrayNew);
    }

    static void printIntArray(int arrayNew[]) {
        for (int i : arrayNew) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}
