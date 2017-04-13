package Smthing.Day27;

import java.util.Scanner;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Arrangement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int z=5;
        for (int x=0; x<5;x++){
            for(int y=1;y<=z;y++){
                System.out.print("*");
            }
                System.out.println();
            z--;
            }
            for (int y=z;y>0;y++){
                System.out.println("*");
            }
        System.out.println();
        z++;



        }
    }

