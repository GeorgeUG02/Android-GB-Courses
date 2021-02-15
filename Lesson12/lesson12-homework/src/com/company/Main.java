package com.company;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    public static void main(String[] args) {
         arr1();
         arr2();
    }

    private static void arr2() {
        float[] arr = new float[SIZE];
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        Arrays.fill(arr,1);
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            for(int i=0;i<HALF;i++){
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        executorService.execute(()->{
            for(int i=0;i<HALF;i++){
                a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        executorService.shutdown();
        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void arr1() {
        float[] arr = new float[SIZE];
        Arrays.fill(arr,1);
        long a = System.currentTimeMillis();
        for(int i=0;i<SIZE;i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }
}
