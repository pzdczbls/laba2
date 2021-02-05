package com.metanit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Imput a number");
        double num = in.nextDouble();
        double argone = Math.cos(num);
        double argtwo = Math.sin(num);
        double argthree = 3 * num;
        double argfour = Math.cos(argthree);
        double argfive = Math.sin(argthree);
        double z = argone + argtwo + argfour + argfive;
        System.out.print(z);
        in.close();
    }
}
