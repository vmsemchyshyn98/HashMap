package com.company;
import java.util.Arrays;

public class OpenHashMap {
    int size;
    int[] keys;
    long[] values;
    int FREE = Integer.MIN_VALUE;

    public OpenHashMap(int size) {
        this.size = Math.max(3 * size / 2, size) + 1;
        keys = new int [this.size];
        values = new long [this.size];
        Arrays.fill(keys, FREE);
    }

    int hash(int k) {
        return (k >> 15) ^ k;
    }

    int index(int hash) {
        return Math.abs(hash) % size;
    }

   public void put(int k, int v) {
        for (int i = index(hash(k)); ; i++) {
            if (i == size)
                i = 0;
            if (keys[i] == FREE)
                keys[i] = k;
            if (keys[i] == k)
                values[i] = v;
            return;
        }
    }

    public long get(int k) {
         for (int i = index(hash(k)); ; i++) {
         if (i == size)
             i = 0;
         if (keys[i] == FREE)
             throw new RuntimeException("No such key!!!!!");
         if (keys[i] == k)
             return values[i];
        }
     }

     public int getSize(){
         int count=0;
         for (int i = 0; i < keys.length - 1; i++) {
             if(keys[i]!=FREE){
                 count++;
             }
         }
         return count;
     }

}





