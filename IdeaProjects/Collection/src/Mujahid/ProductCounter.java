package Mujahid;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {
    private Map<String, String> products;
    private Map<String, Integer> count = new HashMap<>();

    public ProductCounter() {
        products = new TreeMap<>();
        products.put("Banana", "1S01");
        products.put("Orange", "1S02");
        products.put("Pear", "1H01");
        products.put("Apple", "1M02");
    }

    public void processList(String[] productIds) {
        for(String itemNum: productIds) {
            if(!count.containsKey(itemNum)) {
                count.put(itemNum, 1);
            } else {
                int currentCount = count.get(itemNum);
                count.put(itemNum, ++currentCount);
            }
        }
    }

    public void printCount() {
        count.entrySet().forEach(System.out::println);
    }

    public void printReport() {
        System.out.println("--- Product Report ---");
        for(String key: products.keySet()) {
            System.out.printf("Name: %s\tCount: %d\n", key, count.get(products.get(key)));
        }
    }
}