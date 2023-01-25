import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set <Integer> s1=new HashSet<>();
        s1.add(12);
        s1.add(16);
        s1.add(22);
        System.out.println("set 1 is :" + s1);
        Set <Integer> s2=new HashSet<>();
        s2.add(22);
        s2.add(16);
        s2.add(21);
        System.out.println("set 2 is:"+ s2);
        s2.addAll(s1);
        System.out.println(s2);
        s2.retainAll(s1);
        System.out.println(s2);
        s1.containsAll(s2);
        System.out.println(s1);

    }
}