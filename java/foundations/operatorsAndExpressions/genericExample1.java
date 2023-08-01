import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class genericExample1 {

    private static void NumberingList(ArrayList<Integer> list){
        list.add(new Integer(1));
        list.add(new Integer(2));
    }
    
    ArrayList<Integer> list = new ArrayList<Integer>();

    NumberingList(List);

    int total = 0;

    Iterator<Integer> iter = list.iterator();
    while (iter.hasNext()){
        Integer val = iter.next();
        total = total + val;
    }




    


    
}
