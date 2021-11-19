package Mujahid;

import java.util.*;
import java.util.function.BiConsumer;

class Main {
    public static void main(String[] args) {
        Map<Person, List<Animal>> owners_and_their_pets = new HashMap<>();

        Person marc = new Person("Marc");
        List<Animal> marcs_pets = new ArrayList<>();
        marcs_pets.add(new Cat("Zipper"));
        marcs_pets.add(new Cat("Waffles"));
        owners_and_their_pets.put(marc, marcs_pets);

        Person krystal = new Person("Krystal");
        List<Animal> krystal_pets = new ArrayList<>();
        krystal_pets.add(new Cat("Lili"));
        krystal_pets.add(new Cat("Lulu"));
        krystal_pets.add(new Hamster("Lemon"));
        krystal_pets.add(new Dog("Penny"));
        krystal_pets.add(new Cat("Gus"));
        owners_and_their_pets.put(krystal, krystal_pets);

        Person bob = new Person("Bob");
        List<Animal> bobs_pets = new ArrayList<>();
        owners_and_their_pets.put(bob, bobs_pets);

        /*------------------------*/
        Person heritier = new Person("Heritier");
        List<Animal> heritier_pets = new ArrayList<>();
        heritier_pets.add(new Dog("Roxie"));
        owners_and_their_pets.put(heritier, heritier_pets);
        /*------------------------*/

        Person ChrisR = new Person("Chris R");
        List<Animal> chris_pets = new ArrayList<>();
        chris_pets.add(new Dog("Sasha"));
        chris_pets.add(new Dog("Magie"));
        chris_pets.add(new Dog("Siren"));
        chris_pets.add(new Hamster("Unknown"));
        chris_pets.add(new Dog("Gypsy"));
        chris_pets.add(new Cat("Carter"));
        owners_and_their_pets.put(ChrisR, chris_pets);

        Person jace = new Person("Jace");
        List<Animal> jace_pets = new ArrayList<>();
        jace_pets.add(new Cat("Snowball"));
        jace_pets.add(new Cat("Padme Amidala"));
        jace_pets.add(new Cat("Guenivere"));
        jace_pets.add(new HedgeHog("Amira"));
        owners_and_their_pets.put(jace, jace_pets);

        // Barry
        Person barry = new Person("Barry");
        List<Animal> barrys_pets = new ArrayList<>();
        barrys_pets.add(new Dog("Max"));
        barrys_pets.add(new Dog("Rocky"));
        barrys_pets.add(new Dog("Tiger"));
        barrys_pets.add(new Dog("Pepper"));
        barrys_pets.add(new Dog("Julius"));
        barrys_pets.add(new Dog("T-bone"));
        owners_and_their_pets.put(barry, barrys_pets);

        Person kris = new Person("Kris");
        List<Animal> kris_pets = new ArrayList<>();
        kris_pets.add(new Cat("Sokka"));
        kris_pets.add(new Cat("Katara"));
        kris_pets.add(new Dog("Koda"));
        kris_pets.add(new Dog("Bailey"));
        owners_and_their_pets.put(kris, kris_pets);


        Person mike = new Person("Mike");
        List<Animal> mikes_pets = new ArrayList<>();
        mikes_pets.add(new Dog("Rocket"));
        mikes_pets.add(new Cat("Kitty-go"));
        mikes_pets.add(new Dog("Pudge"));
        owners_and_their_pets.put(mike, mikes_pets);


        Person emma = new Person("Emma");
        List<Animal> emma_pets = new ArrayList<>();
        emma_pets.add(new Frog("Gleeb"));
        emma_pets.add(new Frog("Gloob"));
        emma_pets.add(new Frog("Greg"));
        emma_pets.add(new Frog("Grace"));
        emma_pets.add(new Frog("Fiona"));
        emma_pets.add(new Dog("Teddy"));
        emma_pets.add(new Dog("Elliot"));
        emma_pets.add(new Fish("Gilles"));
        owners_and_their_pets.put(emma, emma_pets);


        Person jacob = new Person("Jacob");
        List<Animal> jacob_pets = new ArrayList<>();
        jacob_pets.add(new Cat("Oliver"));
        jacob_pets.add(new Dog("Piper"));
        jacob_pets.add(new Dog("Jax"));
        jacob_pets.add(new Cat("Nugget"));
        owners_and_their_pets.put(jacob, jacob_pets);


        //Derrick
        Person derrick = new Person("Derrick");
        List<Animal> derrick_pets = new ArrayList<>();
        derrick_pets.add(new Cat("Luke"));
        derrick_pets.add(new Cat("Viper"));
        derrick_pets.add(new Dog("Jade"));
        derrick_pets.add(new Dog("Leo"));
        derrick_pets.add(new Dog("Rezi"));
        derrick_pets.add(new Cat("Foobles"));
        derrick_pets.add(new Cat("Kooey"));
        owners_and_their_pets.put(derrick,derrick_pets);

        //Andrew ------------------
        Person andrew = new Person("Andrew");
        List<Animal> andrews_pets = new ArrayList<>();
        andrews_pets.add(new Cat("Mew-mew"));
        andrews_pets.add(new Dog("Prince"));
        andrews_pets.add(new Dog("Rusty"));
        andrews_pets.add(new Turtle("Speedy"));
        andrews_pets.add(new Dog("Shadow"));
        owners_and_their_pets.put(andrew, andrews_pets);


        // Mujo
        Person mujo = new Person("Mujo");
        List<Animal> mujo_pets = new ArrayList<>();
        mujo_pets.add(new Dog("dog"));
        owners_and_their_pets.put(mujo, mujo_pets);


        // Asa
        Person asa = new Person("Asa");
        List<Animal> asa_pets = new ArrayList<>();
        asa_pets.add(new Dog("Fenton"));
        asa_pets.add(new Dog("Lacy"));
        asa_pets.add(new Dog("Captain"));
        asa_pets.add(new Dog("Ruby"));
        owners_and_their_pets.put(asa, asa_pets);


        // big strong >:)
        Person alaina = new Person("Alain");
        List<Animal> ala_pets = new ArrayList<>();
        ala_pets.add(new Hamster("Hamtaro"));
        ala_pets.add(new Fish("Ghost"));
        ala_pets.add(new Bird("Lemon"));
        owners_and_their_pets.put(alaina, ala_pets);


        //Cal
        Person cal = new Person("Cal");
        List<Animal> cals_pets = new ArrayList<>();
        cals_pets.add(new Cat("Kinnick"));
        cals_pets.add(new Dog("Nala"));
        cals_pets.add(new Dog("Bentley"));
        cals_pets.add(new Dog("Maddie"));
        cals_pets.add(new Dog("Zoey"));
        owners_and_their_pets.put(cal, cals_pets);


        // Austin
        Person austin = new Person("Austin");
        List<Animal> austin_pets = new ArrayList<>();
        austin_pets.add(new Cat("Pumpkin"));
        austin_pets.add(new Cat("Cleo"));
        austin_pets.add(new Cat("Muffin"));
        austin_pets.add(new Cat("Nacho"));
        austin_pets.add(new Cat("Murphy"));
        austin_pets.add(new Cat("Lucky"));
        owners_and_their_pets.put(austin, austin_pets);

        // Chase
        Person chase = new Person("Chase");
        List<Animal> chase_pets = new ArrayList<>();
        chase_pets.add(new Cat("Sassy"));
        chase_pets.add(new Cat("Whitesburg"));
        chase_pets.add(new Dog("Buddy"));
        owners_and_their_pets.put(chase, chase_pets);

        // Logan
        Person logan = new Person("Logan");
        List<Animal> logans_pets = new ArrayList<>();
        logans_pets.add(new Dog("Rocky"));
        logans_pets.add(new Dog("Macey"));
        logans_pets.add(new Dog("Casey"));
        owners_and_their_pets.put(logan, logans_pets);

        //Jenny
        Person jenny = new Person("Jenny");
        List<Animal> jennys_pets = new ArrayList<>();
        jennys_pets.add(new Cat("Chelsea"));
        jennys_pets.add(new Cat("Mister"));
        jennys_pets.add(new Cat("Misty"));
        jennys_pets.add(new Dog("Molly"));
        jennys_pets.add(new Dog("Princess"));
        owners_and_their_pets.put(jenny, jennys_pets);

        // Liam
        Person liam = new Person("Liam");
        List<Animal> liams_pets = new
                ArrayList<>();
        liams_pets.add(new Dog("Koda"));
        owners_and_their_pets.put(liam, liams_pets);


        //Izy
        Person izy = new Person("Izy");
        List<Animal> izys_pets = new ArrayList<>();
        izys_pets.add(new Bunny("Bunny"));
        izys_pets.add(new Dog("Betsy"));
        izys_pets.add(new GuineaPig("Roseanna"));
        izys_pets.add(new Dog("Rocket"));
        izys_pets.add(new Dog("Carmel-Zilla"));
        izys_pets.add(new Rock("Rock"));
        owners_and_their_pets.put(izy, izys_pets);

        //BiConsumer
        BiConsumer<Person, List<Animal>> printlist = (personname, eachpersonlist) -> {
            if (eachpersonlist.isEmpty()) {
                System.out.print(personname.toString() + " has no pet.");
                System.out.println();
            } else {
                System.out.print(personname.toString() + "'s pet are: ");
                for (int i = 0; i < eachpersonlist.size(); i++) {
                    if (eachpersonlist.size() > 1) {
                        System.out.print(eachpersonlist.get(i));
                        if (i == eachpersonlist.size() - 1) {
                            break;
                        } else if (i == eachpersonlist.size() - 2) {
                            System.out.print(" and ");
                        } else {
                            System.out.print(", ");
                        }
                    } else {
                        System.out.print(eachpersonlist.get(i));
                    }
                }
                System.out.println();
            }
        };
        owners_and_their_pets.forEach(printlist);

        //Count Animal
        AnimalCount acount = new AnimalCount();
        acount.processData(owners_and_their_pets);
        acount.printData();

    }
}

/*import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void print(List<?> list) {
        list.forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        String[] productIds = new String[]{"1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"};
        ProductCounter pc = new ProductCounter();
        pc.processList(productIds);
        pc.printCount();
    }
}
       list = [1, 2, 3, 4, 5]

               # Print items on a separate line
               for item in list:
               print(item)
               print()

               # Print items on the same line
               for item in list:
               print(item, end=" ")
               print("\n")

               # Add logic to print commas
               count = 1
               for item in list:
               print(item, end = "")
               if count < len(list) - 1:
        print(", ", end="")
        elif count == len(list) - 1:
        print(" and ", end="")
        count += 1
        print("\n")

        # Here is another solution written on a single line:
        print(", ".join([str(item) for item in list[:-1]])+(" and " + str(list[-1]) if len(list)>1 else str(list[0])))*/
       

//        Map<String, String> stateCapitals = new HashMap<>();
//        stateCapitals.put("Iowa", "Des Moines");
//        stateCapitals.put("Wisconsin", "Madison");
//        stateCapitals.put("Iowa", "Des Moines");
//        stateCapitals.put("Illinois", "Springfield");
//        System.out.println(stateCapitals.get("Iowa"));
//        stateCapitals.remove("Illinois");
//        System.out.println(stateCapitals.containsKey("Wisconsin"));
//        System.out.println(stateCapitals.containsKey("Illinois"));
//        System.out.println(stateCapitals.containsValue("set. paul"));
//        System.out.println(stateCapitals.containsValue("Madison"));
//        System.out.println(stateCapitals.size());
//
//        stateCapitals.forEach((state, capital) -> System.out.println("The capital of " + state + " is " + capital + "."));
//        for(Map.Entry<String, String> entry: stateCapitals.entrySet()) {
//            System.out.println("The capital of " + entry.getKey() + " is " + entry.getValue() +".");
//        }
//
//        stateCapitals.entrySet().forEach(System.out::println);
//
//        for (String state : stateCapitals.keySet()) {
//            System.out.println("key: " + state);
//        }
//


//		List<Widget> w1 = new ArrayList<>(Arrays.asList(new Widget(), new Widget(), new Widget()));
//		print(w1);
////		List<Widget> w3 = new ArrayList<>(w1);
//		List<Widget> w2 = new ArrayList<>(w1.size());
//		for(int i = 0; i < w1.size(); i++) {
//			w2.add(w1.get(i).clone());
//		}
////		print(w3);
////		for(int i = 0; i < w3.size(); i++) {
////			w3.get(i).setValue(0);
////		}
//		print(w1);
////		print(w3);
//
//		for(int i = 0; i < w2.size(); i++) {
//			w2.get(i).setValue(0);
//		}
//		print(w1);
//		print(w2);

//    	List<String> states = new ArrayList<>(Arrays.asList("Iowa", "Illinois", "Indiana"));
//		states.add("Ohio");
//    	print(states);
//    	List<String> states2 = Arrays.asList("Iowa", "Illinois", "Indiana");
//    	print(states2);
//    	states.add("Nebraska");
//		states.add("South Dakota");
//		states.add("North Dakota");
//		states.add("Minnesota");
//		print(states);
//		List<String> dakotas = states.subList(5, 7);
//		print(dakotas);
//		dakotas.add("Canada");
//		print(dakotas);
//		System.out.println(dakotas);
//		states.addAll(0, dakotas);
//		print(states);
//		states.removeAll(dakotas);
////		states.removeAll(Arrays.asList("South Dakota", "North Dakota", "Canada"));
//		print(states);
//
//		states.removeIf(str -> !str.endsWith("a"));
//		print(states);
//
//
////		states.replaceAll(str -> new StringBuilder(str).reverse().toString());
////		states.replaceAll(String::toUpperCase);
////		print(states);
//
//		List<String> states3 = new ArrayList<String>(Arrays.asList("Iowa", "Indiana"));
//		states.retainAll(states3);
//		print(states);
//		System.out.println(states.isEmpty());
//		System.out.println(states.contains("Iowa"));
//		System.out.println(states.contains("Illinois"));
//		System.out.println(states.indexOf("Iowa"));
//		System.out.println(states.indexOf("Illinois"));
//		states.clear();
//		System.out.println(states.isEmpty());
//
//		states.add("Florida");
//		states.add("Georgia");
//		states.add("Alabama");
//		states.add("Mississippi");
//		states.add("Louisiana");
//		states.add("Texas");
//		print(states);
//		Comparator<String> alpha = (str1, str2) -> str1.compareTo(str2);
//		Comparator<String> revAlpha = (str1, str2) -> str2.compareTo(str1);
//		Comparator<String> short2Large = (str1, str2) -> str1.length() - str2.length();
//		Comparator<String> large2short = (str1, str2) -> str2.length() - str1.length();
//		states.sort(large2short);
//		print(states);
//
//		states.sort();



//	    List<Integer> numbers = new ArrayList<>();
//	    numbers.add(8);
//	    numbers.add(1);
//	    numbers.add(9);
////	    numbers.add(0, 2);
//        System.out.println(numbers);
////		for(int i = 0; i < numbers.size(); i++) {
////			System.out.println(numbers.get(i));
////		}
//		System.out.println();
//
////		numbers.set(1, 5);
//
//		for(Integer num: numbers) {
//			System.out.println(num);
//		}
//		System.out.println();
//
//		numbers.remove(2);
//		numbers.remove(Integer.valueOf(2));
//
//		Consumer<Integer> printNum = num -> System.out.println(num);
//		numbers.forEach(printNum);
//		System.out.println();
//
//		numbers.add(8);
//		numbers.add(9);
//		numbers.add(1);
////		numbers.add(0, 2);
//
//		numbers.forEach(num -> System.out.println(num));
//		System.out.println();
//
//		numbers.forEach(System.out::println);
//		System.out.println();

//
//    }
//}
