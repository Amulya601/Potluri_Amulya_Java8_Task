import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class astring {


    public static void main(String args[]) {
        List<String> l = new ArrayList<String>();
        l.add("ACM");
        l.add("abb");
        l.add("abc");
        l.add("ant");
        l.add("ammu");
        l=search(l);
        for(String i:l)
            System.out.println(i);
    }
    static List<String> search(List<String> l1)
    {
        return l1.stream().filter(s -> s.startsWith("a")|| s.startsWith("A")).filter(s -> s.length()==3).collect(Collectors.toList());
    }

}