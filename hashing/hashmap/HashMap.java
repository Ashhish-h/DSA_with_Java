package hashing.hashmap;
import java.security.Key;
import java.util.*;

public class HashMap<K, V>{

    // structure of node class
    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }


    private int n; // number of nodes in the HashMap.
    private int N; // size of the bucket
    private LinkedList<Node>[] buckets;  // Bucket to store the nodes,

    /*
        Annotation to suppress warnings, it is suppressing unchecked assignment
        warning getting from the arrays of LinkedList
     */
    @SuppressWarnings("unchecked")
    public HashMap() {  // constructor for HashMap
        this.N = 10;
        this.buckets = new LinkedList[10];
        for(int i = 0; i < buckets.length; i++){
            this.buckets[i] = new LinkedList<>();
        }
    }

    private int hashfunction(K key) {
        int hashCode = key.hashCode();
        /*
            this is an important step as hashcode can return any value, but we need the value between
            0 to size - 1 (size of the array) so for that we take modulo.
         */
        return hashCode % N;
    }

    private int SearchInLL(K key, int bucketIndex) {
        LinkedList<Node> ll = buckets[bucketIndex];
        int di = 0;
        for (Node node : ll) {
            if (node.key.equals(key)) {
                return di;
            }
            di++;
        }
        return -1;
    }

    private void rehash() {
        LinkedList<Node>[] oldBuckets = buckets;
        buckets = new LinkedList[N * 2];
        N = N * 2;
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        // adding nodes in the bucket
        for (LinkedList<Node> ll : oldBuckets) {
            for (Node node : ll) {
                put(node.key, node.value);
            }
        }
    }

    public void put(K key, V value) {
        int bucketIndex = hashfunction(key); // to get the index of the array where we have to store the key (o to size - 1)
        int dataIndex = SearchInLL(key, bucketIndex); // to search if a key already exists or not, if not returns -1

        if(dataIndex != -1) { // means the key is already present in the linked list so update its value.
            Node node = buckets[bucketIndex].get(dataIndex); // we are getting the node on which key is stored
            // node <- array[index on which the linked list is present].get(on which index of the linked list the key is present)
            node.value = value;
        } else {
            buckets[bucketIndex].add(new Node(key, value));
            n++;
        }

        double lambda = (double) n / N;
        if(lambda > 2.0) {
            rehash();  // rehashing if hashmap has reached its threshold
        }
    }

    public boolean containsKey(K key) {
        int bucketIndex = hashfunction(key);
        int dataIndex = SearchInLL(key, bucketIndex);
        return dataIndex != -1;
    }

    public V get(K key) {
        int bucketIndex = hashfunction(key);
        int dataIndex = SearchInLL(key, bucketIndex);

//        if(dataIndex != -1) {
//            Node node = buckets[bucketIndex].get(dataIndex);
//            return node.value;
//        }
//
//        return null;
        return dataIndex != -1 ? buckets[bucketIndex].get(dataIndex).value : null;
    }

    public V remove(K key) {
        int bucketIndex = hashfunction(key);
        int dataIndex = SearchInLL(key, bucketIndex);
        n--;
        return dataIndex != -1 ? buckets[bucketIndex].remove(dataIndex).value : null;
    }

    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();

//        for(int i = 0; i < buckets.length; i++) {
//            for(Node node : buckets[i]) {
//                keys.add(node.key);
//            }
//        }

        for (LinkedList<Node> bucket : buckets) {
            for (Node node : bucket) {
                keys.add(node.key);
            }
        }
        return keys;
    }



}
