import java.util.*;
import java.lang.*;
import java.io.*;

class Triangle
{
     static float findPerimeter(int a, int b, int c)
    {
        return (a + b + c);
    }
  
	public static void main (String[] args) throws java.lang.Exception
	{
   
        int a = 2, b = 3, c = 5;
        System.out.println(findPerimeter(a, b, c));

	}
}
