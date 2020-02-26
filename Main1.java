import java.io.*;
import java.lang.*;
public class Main1{
  boolean flag;
  static long x,y;
   public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n=Integer.parseInt(br.readLine());
     for(int i=0;i<n;i++){
       x=Long.parseLong(br.readLine());
         y=Long.parseLong(br.readLine());
       Main1 m=new Main1();
       m.area();
     }
   }
   void area(){
      flag=false;
      double z=(x*x)-(y*y);
     for(int i=2;i<=z/2;i++){
       if(z%i==0)
       flag=true;
       break;
     }
     if(!flag){
       System.out.println("No");
     }else{
       System.out.println("Yes");
     }
   }



}
