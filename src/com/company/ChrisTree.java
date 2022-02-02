//Jack Alexander in CSC1302
//2/1/2022
//ChrisTree
//This makes Christmas trees
package com.company;

import java.util.Scanner;

public class ChrisTree {

    public static void main(String[] args) {
        int height;
        int amount;
        System.out.println("How high do you want your tree segments to be?");
        Scanner in = new Scanner(System.in);
        height = in.nextInt();
        System.out.println("How many tree segments do you want?");
        amount = in.nextInt();
        ChrisTree(height,amount);
    }
    public static void ChrisTree(int height, int amount){
        int turn = 0;
        int turn2=0;
        //number of spaces
        int spaces2 = 0;
        if(height%2 == 0){
            spaces2= (1+(2*height)+amount);
        }
        else{
            spaces2= (1+(2*height)+amount)+1;
        }
        //number of segments
        for(int i = 0; i<amount;i++){
            //number of stars is determined by 1+2x
            //amount of spaces determined by ((1+2*height)/2)-j
            //height of the segments
            for (int j = 0; j <height;j++) {
                for(int k = 0;k<spaces2-j;k++){
                    System.out.print(" ");
                }
                for(int k =0;k<1+(i+j)*2;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            spaces2--;
        }
        if(height%2 == 0){
            spaces2= (1+(2*height)+amount);
        }
        else{
            spaces2= (1+(2*height)+amount)+1;
        }
        bottom(spaces2,turn,amount);
    }
    public static void bottom(int spaces2,int turn,int amount){
        for(int i = 0; i <=3;i++) {
            if(i<3) {
                for (int k = 0; k<spaces2; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            else{
                for (int k = 0; k < spaces2-3; k++) {
                    System.out.print(" ");
                }
                System.out.println("*******");
            }
        }
    }
}


