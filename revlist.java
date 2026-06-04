import java.util.*;
public class rev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }   
    
}
