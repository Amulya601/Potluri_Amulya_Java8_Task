import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String args[])
    {
        List<String> l=new ArrayList<String>();
        l.add("MOM");
        l.add("Epam");
        l.add("Car");
        l.add("tit");
        l.add("madam");
        l=palindrome(l);
        for(String i:l)
            System.out.println(i);
    }
    static List<String> palindrome(List<String> li1)
    {
        List<String> li2=new ArrayList<String>();
        for(String i:li1)
        {String s = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,s.length()/2).noneMatch(j -> s.charAt(j)!= s.charAt(s.length()-j-1)))
                li2.add(i);}
        return li2;
    }
    
}