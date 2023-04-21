/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author juand
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[][]={{1,3,5,7},{7,46,8,32}};

        for (int i = 0; i < array.length; i++) {    
            for (int j = 0; j < array[i].length;  j++) {
                System.out.println(array[i][j]);
            } 
        }

    }
    
}
