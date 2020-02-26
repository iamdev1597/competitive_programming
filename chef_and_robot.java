import java.util.*;
class chef_and_robot{
int x=0,y=0;
        void u(){
          x=x;
          y=y+1;
            System.out.println(""+x+" "+y);
        }
        void l(){
          x=x-1;
          y=y;
            System.out.println(""+x+" "+y);
        }
        void d(){
          x=x;
          y=y-1;
          System.out.println(""+x+" "+y);
        }
        void r(){
          x=x+1;
          y=y;
            System.out.println(""+x+" "+y);
        }
        public static void main(String args[]){
          chef_and_robot cr=new chef_and_robot();
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0;i<T;i++){
          int t=scan.nextInt();
          if(t==1)
             cr.u();
             if(t==2)
              cr.l();
               if(t==3)
                 cr.d();
                 if(t==4)
                   cr.d();
                   if(t==5)
                     cr.r();
                     if(t==6)
                       cr.r();

        }
      }


}
