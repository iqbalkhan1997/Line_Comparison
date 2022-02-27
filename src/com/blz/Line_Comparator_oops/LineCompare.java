package com.blz.Line_Comparator_oops;
import java.util.Scanner;
public class LineCompare {
    double x1, x2, y1, y2;
    //initializing inputs of line coordinates from the user
    public void coOrdinates(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter x1");
        x1 = input.nextInt();
        System.out.println("enter x2");
        x2 = input.nextInt();
        System.out.println("enter y1");
        y1 = input.nextInt();
        System.out.println("enter y2");
        y2 = input.nextInt();
    }
    //method to calculate length
    public double length() {
        double lenOfLine=Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lenOfLine;
    }
    //main method to behave/initialize methods and objects
    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison Computation Program");
        LineCompare line = new LineCompare();
        System.out.println("Enter the line coordinates");
        //initializing line coordinates from the user
        line.coOrdinates();
        //printing out the line length using length method
        System.out.println("length of the line = " + line.length());
    }
}
