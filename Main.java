import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
public class Main{
  boolean flag;
    void area() throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int n=Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      flag=false;
    long x=Long.parseLong(br.readLine());
    long y=Long.parseLong(br.readLine());
    double z=(x*x)-(y*y);
    for(int j=2;j<=z/2;j++){
      if(z%j==0){
        flag=true;
        break;
      }
    }
    if(!flag){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
}
}
public static void main(String[] args) throws java.lang.Exception {
  Main eid=new Main();
  eid.area();
}
}
