import java.util.*;
class safe_robots{
    int count=0,count1=0,n=0;

     void jump_state(){
         Scanner scan = new Scanner(System.in);
         int n=scan.nextInt();
         for(int i=0;i<n;i++){
           String s=scan.next();

           int sa=scan.nextInt();
           int sb=scan.nextInt();
           for(i=0;i<s.length();i++){
               if(s.charAt(i)=='A'){
                    count=i;
                   }
               if(s.charAt(i)=='B'){
                    count1=i;
                   }
                 }

            for(int j=0;j<s.length();j++){
             if((count==count1)||(count+sa)==(count1-sb)){
                        n=1;
                         break;
                    }else{
                      sa+=sa;
                      sb+=sb;
                    }
            }switch(n){
              case 0:
                 System.out.println("Safe");
                 break;
              case 1:
                 System.out.println("Unsafe");
            }
         }//scan.close();


     }
    public static void main(String args[]){
        safe_robots sr=new safe_robots();
        sr.jump_state();
    }
}
