package org.example;

import java.util.LinkedList;

public class CustomHashSet<T> {
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<T>[] buckets;
    private int size;

    public CustomHashSet() {
        this.buckets = new LinkedList[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(T element) {
        int index = getBucketIndex(element);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        if (!buckets[index].contains(element)) {
            buckets[index].add(element);
            size++;
        }
    }

    public boolean contains(T element) {
        int index = getBucketIndex(element);
        return buckets[index] != null && buckets[index].contains(element);
    }

    public void remove(T element) {
        int index = getBucketIndex(element);
        if (buckets[index] != null && buckets[index].remove(element)) {
            size--;
        }
    }

    public int size() {
        return size;
    }

    public void printAll() {
        for (LinkedList<T> bucket : buckets) {
            if (bucket != null) {
                for (T element : bucket) {
                    System.out.print(element + " ");
                }
            }
        }
        System.out.println();
    }

    private int getBucketIndex(T element) {
        return Math.abs(element.hashCode() % buckets.length);
    }
}
