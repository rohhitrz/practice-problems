//package Maps;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//public class Map<K, V> {
//    ArrayList<MapNode<K, V>> buckets;
//    int size;
//    int numBuckets;
//
//    public Map() {
//        numBuckets = 20;
//        buckets = new ArrayList<>();
//
//        for (int i = 0; i < 20; i++) {
//            buckets.add(null);
//        }
//
//    }
//
//    private void  rehash(){
//        ArrayList<MapNode<K,V>> temp = buckets;
//        buckets = new ArrayList<>();
//        for (int i = 0; i < 2*numBuckets ; i++) {
//            buckets.add(null);
//        }
//        size =0;
//        numBuckets*=2;
//        for (int i = 0; i <temp.size() ; i++) {
//            MapNode<K,V> head = temp.get(i);
//            while(head != null){
//                K key = head.key;
//                V value = head.value;
//                insert(key,value);
//                head= head.next;
//            }
//
//
//        }
//
//    }
//    private  int getBucketIndex(K key){
//        int hashcode = key.hashCode();
//        return hashcode% numBuckets;
//    }
//
//    public void insert(K key, V value){
//        int bucketIndex = getBucketIndex(key);
//        MapNode<K,V> head = buckets.get(bucketIndex);
//        while(head != null){
//            if(head.key.equals(key)){
//                head.value = value;
//            }
//            head = head.next;
//        }
//        head = buckets.get(bucketIndex);
//        MapNode<K,V> newElementNode = new MapNode<K,V>(key,value);
//        newElementNode.next=head;
//        buckets.set(bucketIndex,newElementNode);
//
//        double loadfactor = (1.0*size)/numBuckets;
//
//        if(loadfactor>0.7){
//            rehash();
//        }
//    }
//
//
//}
