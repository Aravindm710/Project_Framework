package com.aravind.trial.utils;

public class RandomNumberGenerator
{
    public static void main( String args[] )
    {
        int min = 100;
        int max = 1000;
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);
        System.out.println("Random value of type int between "+min+" to "+max+ ":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}