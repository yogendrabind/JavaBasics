
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;


class Program
{
	 public static void main (String args[])  
    {

    int n, first, second, third, reverse;
  
    n = 123;
    first = n/100;     
    n = n%100;
	
    second = n/10;     
    third = n%10;      
	
    reverse = third*100 + second*10 + first;
    System.out.println("reverse number : "+reverse);

    }
}
