import java.util.*;
class three_string{
   void swapping(){
   Scanner scan=new Scanner(System.in);
   int t=scan.nextInt();
   for(int i=0;i<t;i++){
     String a=scan.nextLine();
     String b=scan.nextLine();
     String c=scan.nextLine();
     for(i=1;i<a.length();i++){
            b.charAt(i)=c.charAt(i);
            c.charAt(i)=a.charAt(i);
          }
            for(i=0;i<a.length();i++){
              if(b.charAt(i)==c.charAt(i)){
                System.out.println("yes");
              }else{
                System.out.println("no");
              }
            }
      }scan.close();
   }
   public static void main(String args[]){
     three_string ts=new three_string();
     ts.swapping();
   }


}
