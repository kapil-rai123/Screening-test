package t2021_2_1;

import java.util.Scanner;

public class Problem_1 
{
	 static char Con_OR_stop;
	    public static void main(String[] args) 
	    {
	      do
	      {
	       System.out.println("---------------Welcome To This Mini Calculator---------------");
	       System.out.println("choose any one option which operation you want to perform");
	       System.out.println(" +, -, *, / ");
	       Scanner sn=new Scanner(System.in);
	       int option=sn.next().charAt(0);
	       System.out.println("enter a value");
	       System.out.println("enter b value");
	       double a=sn.nextInt();
	       double b=sn.nextInt();
	       switch(option)
	       {
	           case '+':
	               System.out.println(a+b);
	               break;
	           case '-':
	               System.out.println(a-b);
	               break;
	           case '*':
	               System.out.println(a*b);
	               break;
	           case '/':
	               System.out.println(a/b);
	               break;
	           default:
	               System.out.println("no match found"); 
	               break;
	       }
	       System.out.println("Press any key to continue or press s to stop execution");
	       Con_OR_stop=sn.next().charAt(0);
	      }while(Con_OR_stop!='s' ||Con_OR_stop!='s');
	    }

}
