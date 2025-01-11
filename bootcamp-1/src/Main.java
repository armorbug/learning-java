import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    // Enums
    enum PizzaToppings {
        CHEESE,
        HAM,
        OLIVES,
        CORN,
        SAUSAGE
    }

    public static void main(String[] args){

        // Enums continued
        PizzaToppings cheese = PizzaToppings.CHEESE;
        System.out.println(cheese);

        //primary use of Enums
        switch(cheese){
            case HAM:
                System.out.println("Ham added");
                break;
            case CHEESE:
                System.out.println("Cheese added");
                break;
            default:
                System.out.println("Some other unimportant topping added");
                break;
        }

        //loop through enum values

        for(PizzaToppings toppings : PizzaToppings.values())
        {
            System.out.println(toppings);
        }

        // ArrayList
        // usage - for storing and accessing data
        // time complexity


        //examples
        ArrayList<String> pizzas = new ArrayList<>();
        pizzas.add("Ham and Cheese");
        pizzas.add("Pineapple abomination");
        pizzas.addFirst("Caesar's pizza");
        pizzas.add(1,"Pizza Pazzo's Pizza");

        System.out.println(pizzas);
        System.out.println(pizzas.get(2));

        pizzas.set(2,"Good pizza");
        pizzas.remove(3);
        System.out.println(pizzas);

        //pizzas.clear();
        //System.out.println(pizzas);

        for(int i = 0; i < pizzas.size(); i++)
        {
            System.out.println(i);
        }
        Collections.sort(pizzas);
        System.out.println(pizzas);

        // LinkedList
        //usage - for manipulating data
        //time complexity

        //examples
        LinkedList<String> apples = new LinkedList<>();

        apples.addFirst("green");
        apples.addLast("red");
        System.out.println(apples.getLast());
        System.out.println(apples.getFirst());
        apples.removeFirst();
        apples.removeLast();

        // sorting lists
        Collections.sort(pizzas,Collections.reverseOrder());
        Collections.sort(pizzas);


        // HashMap

        // HashSet

        // Iterator

        // Wrapper classes

    }
}
