import java.util.*;
class harbour_space{
  int count=0,m=0,p=0;
  void erase(){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    for(int i=0;i<n;i++){
    String s=scan.next();
    for(i=0;i<s.length();i++){
       if(s.charAt(i)=='1'){
           m=i;
          break;
        }
      }
    for(int k=s.length()-1;k>=0;k--){
          if(s.charAt(k)=='1'){
             p=k;
            break;
          }
        }
    for(int j=m;j<p;j++){
            if(s.charAt(j)=='0'){
            count++;
          }
        }
          System.out.println(count);
          count=0;
      }scan.close();
    }
    public static void main(String args[]){
      harbour_space hs=new harbour_space();
      hs.erase();
    }

}
