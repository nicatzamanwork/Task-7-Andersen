package org.example;

public class Main {
    public static void main(String[] args) {

        CustomArrayList<Integer> customList = new CustomArrayList<>();
        customList.add(10);
        customList.add(20);
        customList.add(30);
        System.out.println("Element at index 1: " + customList.get(1));
        customList.printAll();
        customList.remove(1);
        customList.printAll();

        CustomHashSet<String> customSet = new CustomHashSet<>();
        customSet.add("Apple");
        customSet.add("Banana");
        customSet.add("Cherry");
        customSet.add("Apple");
        customSet.printAll();
        System.out.println("Contains 'Banana': " + customSet.contains("Banana"));
        customSet.remove("Banana");
        customSet.printAll();
    }
}
