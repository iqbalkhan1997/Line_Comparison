package com.blz.Line_Comparator_oops;
import java.util.Scanner;
public class LineCompare {
    double x1, x2, y1, y2;
    Double line1,line2;
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
    //method to calculate length of line
    public Double length() {
        Double lenOfLine=Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lenOfLine;
    }
    //method to check equality of two lines
    public void equal(Double length1,Double length2){
        line1 = length1;
        line2 = length2;
        boolean equality = line1.equals(line2);
        System.out.println(equality);
        if(equality == false){
            System.out.println("Two lengths of the lines are not equal");
        } else {
            System.out.println("Two lengths of the lines are equal");
        }
    }
    //main method to behave/initialize methods and objects
    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison Computation Program");
        //initializing first line coordinates from the user
        LineCompare firstLine = new LineCompare();
        LineCompare secondLine = new LineCompare();
        //initializing first line coordinates from the user
        System.out.println("Enter the first line coordinates");
        firstLine.coOrdinates();
        //initializing second line coordinates from the use
        System.out.println("Enter the second line coordinates");
        secondLine.coOrdinates();
        //printing out the first line length using length method
        Double first= firstLine.length();
        System.out.println( "First line length is " + first);
        //printing out the second line length using length method
        Double second = secondLine.length();
        System.out.println("Second line length is " + second);
        //initializing length of two lines to equals method
        LineCompare check = new LineCompare();
        check.equal(first,second);
    }
}