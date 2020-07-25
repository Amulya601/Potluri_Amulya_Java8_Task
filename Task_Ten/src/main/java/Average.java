import java.util.ArrayList;

public class Average
{
   public static void main(String[] args)
   {
      ArrayList<Integer> n = new ArrayList<Integer>();
 
      n.add(10);
      n.add(20);
      n.add(30);
      n.add(40);
      n.add(50);
      n.add(60);
     
      int t=0,c=0;
      for(int s:n)
      {
    	  
    	  t=t+s;
    	  c=c+1;
    	  
      }
      double average = t / c;
      System.out.println("The average is: " + average);
      
     }
     
   
}