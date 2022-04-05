import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;


class Program
{
	public static void main (String[] args) 
	{
    int a=6;
    int b=8;

    b = b-a;
    a = b+a;
    b = -(b-a) ;
     
    System.out.println("a="+a) ;
    System.out.println("b="+b); 
	}
}
