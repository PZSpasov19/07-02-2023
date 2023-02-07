import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        //Set<Integer> ints = new HashSet<>();
        //ints.add(1);
        //ints.add(30);
        //ints.add(5);
        //ints.add(2);
        //ints.add(20);
        //ints.remove(20);

        //for (Integer integer: ints) {
        //    System.out.println(integer);
        //}
        //List<Integer> ints = new ArrayList<>();
        //ints.add(1);
        //ints.add(30);
        //ints.add(5);
        //ints.add(2);
        //ints.add(20);
        //System.out.println(ints.get(4));

        Map<String, Map<String, Integer>> hashMap = new HashMap<>();
        hashMap.put("123", new HashMap<>());
        hashMap.get("123").put("Ivan", 20);
        hashMap.put("456", new HashMap<>());
        hashMap.get("456").put("Pesho", 17);

        for (String key : hashMap.keySet()) {
            for (String innerKey : hashMap.get(key).keySet()) {
                System.out.println(key + " --- " + innerKey + " ---- "
                + hashMap.get(key).get(innerKey));
            }
        }

        for (Map<String, Integer> value : hashMap.values()) {
            for (String key : value.keySet()) {
                System.out.println(key + " --- " + value.get(key));
            }
        }

        for (Map.Entry<String, Map<String, Integer>> mapEntry: hashMap.entrySet()) {
            String key = mapEntry.getKey();
            Map<String, Integer> innerMap = mapEntry.getValue();
            for (String innerKey : innerMap.keySet()) {
                System.out.println(key + " --- " + innerKey + " ---- " + innerMap.get(innerKey));
            }
        }

    }
}
