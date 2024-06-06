package Greedy;
import java.util.*;
public class FractionalKnapsack {

    static class Item {
        int weight, value;

        public Item(int value, int weight) {
            this.weight = weight;
            this.value = value;
        }

    }

    public static void main(String[] args) {
        Item i1 = new Item(60,10);
        Item i2 = new Item(120,30);
        Item i3 = new Item(100,20);

        Item items[] = {i1,i2,i3};

        int capacity = 50;
        System.out.println(fractionalKnapsack(items, capacity));
    }

    static double fractionalKnapsack(Item items[], int capacity){
        Arrays.sort(items, (o1,o2)->{
            double rationthis = (double) o1.value/o1.weight;
            double rationthat = (double) o2.value/o2.weight;

            if(rationthis > rationthat) return -1;
            if(rationthat>rationthis) return 1;
            return  0;
        });

        double profit =0;

        for(int i=0;i<items.length;i++){
            if(items[i].weight <= capacity){
                profit += items[i].value;
                capacity -= items[i].weight;
            }
            else{
                double fractionProfit = (double)(items[i].value * capacity)/(items[i].weight);
                profit += fractionProfit;
                break;
            }

        }
        return profit;
    }
}
