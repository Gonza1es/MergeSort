package com.company;

public class Start {
    int[] array_gen;
    int[] result;

    public void run_algo(Integer input, Integer input_min, Integer input_max) {
        array_gen = generate_array(input, input_min, input_max);
        System.out.println("Unsorted array:");
        printArray(array_gen, input);
        MergeSort sort = new MergeSort();
        long time = System.currentTimeMillis();
        result = sort.cutArray(array_gen);
        System.out.println("\nSorted array:");
        printArray(result, input);
        System.out.println("\nAlgorithm running time:");
        System.out.println((double) (System.currentTimeMillis() - time) + "ms");
    }

    public int[] generate_array(Integer input, Integer input_min, Integer input_max) {
        int[] array_general = new int[input];
        for (int i = 0; i < input; i++) {
            array_general[i] = (int) (Math.random() * (input_max - input_min) + input_min);
        }
        return array_general;
    }

    public void printArray(int[] Array, Integer input) {
        for (int i = 0; i < input; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
