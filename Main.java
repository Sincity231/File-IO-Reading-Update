package com.company;
/*Braille.java
  ICS4U1
  March 11, 2022
  Looping through file to encrypt message and print to console
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("Braille1.txt")); //Scanning through a new file named "Braille1.txt"
        while (file.hasNext()) {
            String l1 = file.nextLine(); //setting l1 to line1 by going to next line
            String l2 = file.nextLine(); //setting l2 to line2 by going to next line
            String l3 = file.nextLine(); //setting l3 to line3 by going to next line
            String[]arr = {l1,l2,l3}; //setting file lines from file into array
            for (int i = 0; i < l1.length(); i += 2) { //looping through nested if statements to check if position of x and o match letter
                if (arr[0].charAt(i) == 'x' && arr[0].charAt(i + 1) == 'o') { //checking line-by-line through first(changing) and second(changing) column to identify corresponding letter
                    //specifically in the first line that has an x in first(changing) column and o in second(changing) column.
                    if (arr[1].charAt(i) == 'o' && arr[1].charAt(i + 1) == 'o') { //Going through the rest of lines and columns to find matching braille pattern.
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') { //once conditions are met, letter is printed
                            System.out.print("A ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("K ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'x') {
                            System.out.print("U ");
                        }
                    }
                    if (arr[1].charAt(i) == 'x' && arr[1].charAt(i + 1) == 'o') {
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("B ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("L ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'x') {
                            System.out.print("V ");
                        }
                    }
                    if (arr[1].charAt(i) == 'o' && arr[1].charAt(i + 1) == 'x') {
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("E ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("O ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'x') {
                            System.out.print("Z ");
                        }
                    }
                    if (arr[1].charAt(i) == 'x' && arr[1].charAt(i + 1) == 'x') {
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("H ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("R ");
                        }
                    }
                }
                if (arr[0].charAt(i) == 'x' && arr[0].charAt(i + 1) == 'x') { //checking line-by-line through first(changing) and second(changing) column to identify corresponding letter
                    //specifically in the first line that has an x in first(changing) column and o in second(changing) column.
                    if (arr[1].charAt(i) == 'o' && arr[1].charAt(i + 1) == 'o') { //Going through the rest of lines and columns to find matching braille pattern.
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') { //once conditions are met, letter is printed
                            System.out.print("C ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'x') {
                            System.out.print("X ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("M ");
                        }
                    }
                    if (arr[1].charAt(i) == 'o' && arr[1].charAt(i + 1) == 'x') {
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("D ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'x') {
                            System.out.print("Y ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("N ");
                        }
                    }
                    if (arr[1].charAt(i) == 'x' && arr[1].charAt(i + 1) == 'o') {
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("F ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("P ");
                        }
                    }
                    if (arr[1].charAt(i) == 'x' && arr[1].charAt(i + 1) == 'x') {
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("G ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("Q ");
                        }
                    }
                }
                if (arr[0].charAt(i) == 'o' && arr[0].charAt(i + 1) == 'x') { //checking line-by-line through first(changing) and second(changing) column to identify corresponding letter
                    //specifically in the first line that has an x in first(changing) column and o in second(changing) column.
                    if (arr[1].charAt(i) == 'x' && arr[1].charAt(i + 1) == 'o') { //Going through the rest of lines and columns to find matching braille pattern.
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') { //once conditions are met, letter is printed
                            System.out.print("I ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("S ");
                        }
                    }
                    if (arr[1].charAt(i) == 'x' && arr[1].charAt(i + 1) == 'x') {
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("J ");
                        }
                        if (arr[2].charAt(i) == 'x' && arr[2].charAt(i + 1) == 'o') {
                            System.out.print("T ");
                        }
                        if (arr[2].charAt(i) == 'o' && arr[2].charAt(i + 1) == 'x') {
                            System.out.print("W ");
                        }
                    }
                }
                if (i + 2 == l1.length()) { //if the index plus 2 indices(accounting for next 2 columns)
                    //in line1 equals to the length of that row, a new line is written.
                    System.out.println();
                }
            }
        }
    }
}