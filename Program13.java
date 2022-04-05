
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;


class Codechef
{
	 public static void main (String args[])  
    {
    int n, first, second, third, forth, fifth, sum;
    n = 12345;
   
    first = n/10000;
    n = n%10000;
	
    second = n/1000;    
    n = n%1000;
	
    third = n/100;      
    n = n%100;
	
    forth = n/10;        
    fifth = n%10;        
	
    sum = first + forth;
    System.out.println("sum : "+sum);
  
    }
}