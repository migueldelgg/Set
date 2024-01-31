package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union
        Set<Integer> c = new TreeSet<>(a); // <- conjunto C copia do conjunto A
        c.addAll(b); // <-- agora fazendo a união do conjunto C com o conjunto B
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a); // <- conjunto D copia do conjunto A
        d.retainAll(b); // intersecção do conjunto D com o conjunto B, ou seja, somento os elementos em comum
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a); // <- conjunto E copia do conjunto A
        e.removeAll(b); // diferença, mantém apenas quem nao esta no B
        System.out.println(e);
    }
}
