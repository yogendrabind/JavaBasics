
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;


class Program
{
	 public static void main (String args[])  
    {

        int m=132;
        int  n, sum = 0;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Digits sum:"+sum);

    }
}

