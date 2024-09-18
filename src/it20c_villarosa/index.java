/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it20c_villarosa;

/**
 *
 * @author ITLAB2-PC14-STUDENT
 */
public class It20c_villarosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        String [][] hayst = {
            {"S","O","S"},
            {"O","S","O"},
            {"S","O","S"}
        };
        for (int i=0;i<hayst.length;i++) {
            for (int j=0;j<hayst[i].length;j++) {
                System.out.print(hayst[i][j]+" ");

            }
            System.out.println();
         }
    }
}