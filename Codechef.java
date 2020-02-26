import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    double x=s.nextDouble();
	       double y=s.nextDouble();
	       double area=x*x-y*y;
	       String choice="YES";
	       for(double d=2;d<=Math.sqrt(area);d++)
	       {
	           if(area%d!=0.0)
	           {
	               choice="NO";
	               break;
	           }
	       }
	       System.out.println(choice);



		}
	}
}
