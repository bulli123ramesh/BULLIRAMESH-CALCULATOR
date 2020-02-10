package com.epam.CALCULATOR1;

import java.util.Scanner;
public class Calculator 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******CALCULATOR******");
        System.out.println("Option 0:Exit Calculator\nOption 1:Addition\nOption 2:Subtraction\nOption 3:Multiplication\nOption 4:Division");
        while(true) {
        	
        	int  option =sc.nextInt();
        	double a=0;
        	double b=0;
        	switch(option) {
        	case 0:
        		return ;
        	case 1:
        		System.out.println("Enter two number for Addition:");
        		a=sc.nextDouble();
        		b=sc.nextDouble();
        		Addition x=new Addition(a,b);
        		x.add();
        		break;
        	case 2:
        		System.out.println("Enter two number for Subtraction:");
        		a=sc.nextDouble();
        		b=sc.nextDouble();
        		Subtraction y=new Subtraction(a,b);
        		y.sub();
        		break;
        	case 3:
        		System.out.println("Enter two number for Multiplication:");
        		a=sc.nextDouble();
        		b=sc.nextDouble();
        		Multiplication z=new Multiplication(a,b);
        		z.mul();
        		break;
        	case 4:
        		System.out.println("Enter two number for Division");
        		a=sc.nextDouble();
        		b=sc.nextDouble();
        		Division w=new Division(a,b);
        		w.div();
        		break;
        	default:
        		System.out.println("Selected invalid option");
        	
        	}
        }
        
    }
}
