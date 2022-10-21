package t2021_2_1;

import java.util.HashMap;
import java.util.Scanner;

public class Problem_4 
{
	 public static void main(String[] args) 
	    {
		  do {
	        Scanner sn=new Scanner(System.in);
	        System.out.println("Enter the length of input");
	        int length=sn.nextInt();
	        int[] input=new int[length];
	        System.out.println("Enter inputs");
	        for(int i=0;i<length;i++)
	        {
	           input[i]=sn.nextInt();
	        }
	        HashMap hm=new HashMap();
	        for(int i=1;i<=9;i++)
	        {
	            int count=0;
	           for(int j=0;j<input.length;j++)
	           {  
	               if(input[j]%i==0)
	               {
	                  count++; 
	                  hm.put(i,count);
	               }
	           }
	        }
	        System.out.println(hm);
		  }
		  while(true);
	    }

}
