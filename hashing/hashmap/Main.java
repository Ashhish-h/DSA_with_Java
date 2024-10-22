package hashing.hashmap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ashish", 9);
        map.put("Abhishek", 8);
        map.put("aryan", 7);

        boolean isFound = map.containsKey("aditya");
        System.out.println(isFound);

        int value = map.get("Ashish");
        System.out.println(value);

//        int val = map.remove("Abhishek");
//        System.out.println(val);
        System.out.println(map.keySet());

        System.out.println(map.isEmpty());
    }
}
