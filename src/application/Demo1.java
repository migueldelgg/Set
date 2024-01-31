package application;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Tablet");      // nao garante a ordem dos elementos
        set.add("Notebook");    // se a ordem nao importa, use HashSet



        for (String p : set) {
            System.out.println(p);
        }
    }
}
