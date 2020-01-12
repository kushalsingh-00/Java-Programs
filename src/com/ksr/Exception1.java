package com.ksr;

public class Exception1 {
    public static void main(String[] args) {
        try {

            int arr[]=new int[5];
            arr[6]=5;
            int i = 2 / 0;
            System.out.println("Hello");        // after exception no statements will not executes
        } catch (ArithmeticException e) {
            System.out.println("Error");       // instead of throwing a error it print what we want in black text
            System.err.println("a");           // err change the color to red
        }
        catch(ArrayIndexOutOfBoundsException e)      // this directly come to this catch and not execute other statements
        {
            System.out.println("please enter in limit");
        }

        catch(Exception e)         // if we dont know the exceptions type then all type of exception are sub class of this
        {
            System.out.println("Hi");
        }
        finally
        {
            System.out.println("Hello");   // finally is the block where the statement are present who want to be execute after handling error
        }

    }
}
