import java.util.Scanner;
class UseDelimiterEx{
public static void main(String args[]){
     Scanner sc=new Scanner("Farisa is good girl");
     sc.useDelimiter("a");//a is using as a saperator
     while (sc.hasNext()){//loop to continuesly execute the line until we reach the end of line
         System.out.println(sc.next());
     }
    Scanner s=new Scanner("Farisa/is a good girl");
    s.useDelimiter("/");//"/" is use as saperator
    while (s.hasNext()){
        System.out.println(s.next());
    }
    Scanner s1=new Scanner("Farisa is a good girl");
    s1.useDelimiter("\\s");
    while (s1.hasNext()){
        System.out.println(s1.next());
    }
  }
}
