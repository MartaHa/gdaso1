package pl.coderslab.kol1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();

        for (int i = 10; i < 20; i++) {
            elements.add(i);
        }

        for (int i=0; i<elements.size(); i++){
            System.out.println(elements.get(i));
        }

        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(Iterator<Integer> iti = elements.iterator(); iti.hasNext();){
            System.out.println(iti.next());
        }

        for (Integer a: elements ) {
            System.out.println(a);
        }


    }
}
