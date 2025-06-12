import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Abhishek");
        list.add("Ram");
        list.add("Rohan");
        list.add("Mohan");
        list.add("Rohit");
        System.out.println(list);
        ListIterator<String> it = list.listIterator();
        while(it.hasNext())
        {
            String item = it.next();
            if (item.contains("R") && item.contains("t"))
            {
                it.remove();
            }
        }
        System.out.println(list);

        // Check if exactly 2 elements remain in the list
       
        // Print the elements in reverse order
        // Reset iterator to the end of the list first
        while(it.hasNext()) {
            it.next();
        }
        
        // Now print elements in reverse order
        while(it.hasPrevious())
        {
            it.previous();
            if (!it.hasPrevious())
            {
                it.set("Hello");
                break;
            }
        }
        System.out.println(list);
    }
}
