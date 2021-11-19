package Mujahid;

import java.util.*;
import java.util.function.BiConsumer;

public class AnimalCount {
    private Map <String, Integer> countanimal = new HashMap<>();
//    private Map <Person, List<Animal>> copymap;
//    private List<Integer> anum = new ArrayList<>();

    public AnimalCount() {
//        copymap = copy;
    }

    public void processData(Map<Person, List<Animal>> owners_and_their_pests) {
        for (List<Animal> animals : owners_and_their_pests.values()) {
            for(int i = 0; i < animals.size(); i++) {
                String pet = animals.get(i).getClass().getSimpleName();
                f(){
                    productCount.put(itemNumber, 1);
                }
            }
        }
           else {
            int curVal = productCount.get(itemNumber);
            curVal++;
            productCount.put(itemNumber, curVal);
        }
            }
        }

    }

    public void printData() {
        BiConsumer<String, Integer> printdt = (name, num) -> System.out.println(name + " has " + num);
        countanimal.forEach(printdt);
    }
}
