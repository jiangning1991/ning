package Smthing.Day27;

/**
 * Created by jiangning on 2017/3/27.
 */
public class Diamond {
    public static void main(String[] args) {
        for (int a=1;a<=5;a++){
            for (int c=a;c<=5;c++){
                System.out.print(" ");
            }
            for (int b=1;b<a;b++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=1;x<=5;x++){
            for(int y=1;y<x;y++){
                System.out.print(" ");
            }
            for(int z=x;z<=5;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
