package t2021_2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_2
{
	public static void main(String[] args)
    {
        do{
        System.out.println("Enter how many odd numbers you want to generate");
        Scanner sn=new Scanner(System.in);
        int input=sn.nextInt();
        ArrayList ar=new ArrayList();
        int temp=1;
        for(int i=0;i<input;i++)
        {
           ar.add(temp);
           temp=temp+2;
        }
        System.out.println(ar);
        }
        while(true);
    }

}
