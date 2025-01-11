import java.util.*;

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

        // ArrayList - dynamically sized array
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

        // LinkedList - stores in containers linked between each other
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

        // HashMap - key/value pairs
        HashMap<String,Integer> hashbrowns = new HashMap<>(); // key - name; value - price
        hashbrowns.put("small",2);
        hashbrowns.put("medium",3);
        hashbrowns.put("large",4);

        System.out.println(hashbrowns.get("small"));

        hashbrowns.remove("small");
        hashbrowns.put("baby",2);

        if (hashbrowns.size() < 5) System.out.println("need more hash brown varieties");

        System.out.println("Sizes:");
        for (String s : hashbrowns.keySet())
        {
            System.out.println(s);
        }

        System.out.println("Prices:");
        for (Integer i : hashbrowns.values())
        {
            System.out.println(i);
        }
        hashbrowns.clear();

        // HashSet - collection of unique items

        HashSet<String> chairs = new HashSet<>();
        chairs.add("tall chair");
        chairs.add("fancy chair");
        chairs.add("crazy chair");
        chairs.add("crazy chair");

        System.out.println(chairs);
        System.out.println(chairs.size());
        System.out.println(chairs.contains("crazy chair"));

        chairs.remove("fancy chair");

        for (String s : chairs)
        {
            System.out.println(s);
        }

        chairs.clear();
        // Iterator

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(69);
        numbers.add(420);
        numbers.add(314);
        numbers.add(1);

        Iterator<Integer> interator = numbers.iterator();

        System.out.println(interator.next());

        while(interator.hasNext()) System.out.println(interator.next());

        interator = numbers.iterator(); //reinstance the iterator

        while(interator.hasNext()) //doesn't work with for-loops
        {
            Integer i = interator.next();
            if (i == 314) numbers.remove(i);
        }

        System.out.println(numbers);

        // Wrapper classes
        Character c = 'c'; //object type
        System.out.println(c.charValue());
        String cstring = c.toString();
        System.out.println(cstring.length());

    }
}
