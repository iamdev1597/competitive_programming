import java.util.*;
import java.lang.*;
class atm{

       void total_balance(int x,float y){
       float balance=0;
    if(x%5==0){
      if(x<y && (x+0.50)<=y){
        balance=(float)(y-x-0.50);
        System.out.println(""+balance);
      }else{
        System.out.println(""+y);
      }
    }else{
      System.out.println(""+y);
    }
  }
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	     int x=scan.nextInt();
	    float y=scan.nextFloat();
	    atm m=new atm();
	    m.total_balance(x,y);
	    }
	    }
