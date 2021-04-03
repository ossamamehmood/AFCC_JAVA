package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ARITHMETIC-FORMULA-COMPARISON-CALCULATION-OPERATIONS

        // - Project Using JAVA

        // - Based on Decision Structure & InputOutput

        // - Compiler : JetBrains - IntelliJ IDEA

        // - Developed by Ossama Mehmood

        // - Open Source (Github.com/ossamamehmood)

        System.out.println("\n\t\t   -----------------------" +

                "\n\t\t   ARITHMETIC CALCULATIONS\n" +

                "-------------------------------------------------------------" +

                "\n\t\t   Select Yours Operation\n" +

                "-------------------------------------------------------------");

        System.out.println("\n\t  Press & Enter (A) - Addition of Numbers\n" +

                "\n\t Press & Enter (S) - Subtraction of Numbers\n" +

                "\n\t Press & Enter (M) - Multiplication of Numbers\n" +

                "\n\t  Press & Enter (D) - Division of Numbers\n" +

                "-------------------------------------------------------------");

        // Take input from the user

        String Arithmetic;

        Scanner in = new Scanner(System.in);

        System.out.println("\nFrom Above Statements - Provide a Number to Perform Operation " +

                "\n-------------------------------------------------------------" +

                "\n\n\t\tPress - ( A - S - M - D) : ");

        Arithmetic = in.nextLine();

        // Transform to uppercase - Already User Friendly

        // Decision Structure - ELSE IF Statements

        if (Arithmetic.equalsIgnoreCase("A"))

            // Arithmetic - A  ---- it'll executed

        {

            float x, y, sum;

            System.out.println("\n\t\t----------------------------" +

                    "\n\t\t Program to Sum Two Numbers\n" +

                    "\t\t----------------------------\n" +

                    "\nProvide First Number : \n");

            x = in.nextFloat();

            System.out.println("\nProvide Second Number : ");

            y = in.nextFloat();

            sum = x + y;

            System.out.println("\t\t----------------------------" +

                    "\n\t\t  Addition of Two Integers" +

                    "\n\t\t\t " + x + " + " + y + " = " + sum + "\n" +

                    "\t\t----------------------------");

        }

        else

            if (Arithmetic.equalsIgnoreCase("S"))

                // Arithmetic - S  ---- it'll executed

            {

            float x, y, sub;

            System.out.println("\n\t\t----------------------------" +

                    "\n\t\t Program to Sub Two Numbers\n" +

                    "\n\t\t----------------------------" +

                    "\nProvide First Number : \n");

            x = in.nextFloat();

            System.out.println("\nProvide Second Number : ");

            y = in.nextFloat();

            sub = x - y;

            System.out.println("\t\t----------------------------" +

                    "\n\t\t  Subtraction  of Two Integers" +

                    "\n\t\t\t " + x + " - " + y + " = " + sub + "\n" +

                    "\t\t----------------------------");

        }

        else

            if (Arithmetic.equalsIgnoreCase("M"))

                // Arithmetic - M  ---- it'll executed

        {

            float x, y, mul;

            System.out.println("\n\t\t----------------------------" +

                    "\n\t\t Program to Mul Two Numbers\n" +

                    "\t\t----------------------------" +

                    "\nProvide First Number : \n");

            x = in.nextFloat();

            System.out.println("\nProvide Second Number : ");

            y = in.nextFloat();

            mul = x * y;

            System.out.println("\t\t----------------------------" +

                    "\n\t\t  Multiplication of Two Integers" +

                    "\n\t\t\t " + x + " * " + y + " = " + mul + "\n" +

                    "\t\t----------------------------");

        }

        else

            if (Arithmetic.equalsIgnoreCase("D"))

                // Arithmetic - D  ---- it'll executed

        {

            float x, y, div;

            System.out.println("\n\t\t----------------------------" +

                    "\n\t\t Program to Div Two Numbers\n" +

                    "\t\t----------------------------" +

                    "\nProvide First Number : \n");

            x = in.nextFloat();

            System.out.println("\nProvide Second Number : ");

            y = in.nextFloat();

            div = x / y;

            System.out.println("\t\t----------------------------" +

                    "\n\t\t  Division of Two Integers" +

                    "\n\t\t\t " + x + " / " + y + " = " + div + "\n" +

                    "\t\t----------------------------");

        }

        // ELSE Block - If enter unexpected Character - (Executed - Once each condition become false)

        else

            {

            // block of code if condition is false

            System.out.println("\n\t\t----------------------------" +

                    "\n\t\t\t Invalid Input\n" +

                    "\t\t----------------------------\n");

        }

    }

}