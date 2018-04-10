package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
    		// write your code here
        try {
            //testInput(-1);
            //testInput(100);
        		//testInput(10001);
            /*Random random = new Random();
            float f = 4.5f;
            int test = (int)f;
            byte[] bytes=null;
            random.nextBytes(bytes);*/
            int i=0;
            while(true)
            {
            		if(i++>1000)
            			throw new Exception("Ending program");
            			//break;
            		else
            			System.out.println("Value is: " + i);
            }
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("There was an error in the program: " + ex.getMessage());
            System.out.println("The correct inputs for the program are: 1 to 10000\nExample below would print squares upto 10");
            testInput(10);
        }
        catch(StackOverflowError ex) {
        		System.out.println("There was an error in the program: " + ex.getMessage());
            System.out.println("The correct inputs for the program are: 1 to 10000\nExample below would print squares upto 10");
            testInput(10);
        }
        catch(NullPointerException ex) {
        		System.out.println("Something was null:" + ex.getMessage());
        }
        catch(Exception ex) {
        		System.out.println("There was an unexpected error: " + ex.getMessage());
        }
        finally {
        		System.out.println("I hope these examples make sense");
        }
        
    }

    static void testInput(int number) throws IndexOutOfBoundsException, StackOverflowError{

        if(number<=0)
            throw new IndexOutOfBoundsException("Number cannot be zero or less");
        if(number>10000)
            throw new StackOverflowError("This number cannot be greater than 10000");
        for (int i=2; i<number; i+=2){
            System.out.println(i*i);
        }
    }
}
