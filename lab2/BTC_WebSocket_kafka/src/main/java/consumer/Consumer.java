package consumer;

import consumer.BitCoinTransaction;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Iterator;

public class Consumer {
    private PriorityQueue<BitCoinTransaction> topTrades;
    private int capacity;
    public Consumer(int capacity){
        this.capacity =capacity;
        topTrades = new PriorityQueue<>(capacity, Comparator.naturalOrder());
    }
    public void addTrade(BitCoinTransaction inp){
        if(topTrades.size() < this.capacity){
            topTrades.add(inp);
            System.out.println("Added while not enough: "+ inp);
            printCurrentTop();
            return;
        }
        if(topTrades.peek().compareTo(inp)<0){
            topTrades.poll();
            topTrades.add(inp);
            System.out.println("Added: "+ inp);
            printCurrentTop();
            return;
        }
        System.out.println("Not added to small: "+ inp);
        System.out.println("Peek" + topTrades.peek());
        printCurrentTop();
    }
    public void printCurrentTop(){
        int quant=0;
        Iterator<BitCoinTransaction> iter = topTrades.iterator();
        while (iter.hasNext()){
            System.out.println("|| " + quant + " || " + iter.next());
            quant++;
        }
        System.out.println("==========================\n\n");
    }
}
