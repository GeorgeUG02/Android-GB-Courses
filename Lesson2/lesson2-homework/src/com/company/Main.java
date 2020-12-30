package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a={1,1,0,0,1,0,1,1,0,0};
        for (int i=0;i<a.length;i++){
            if (a[i]==1) a[i]=0;
            else a[i]=1;
        }
        System.out.println(Arrays.toString(a));
        int[] b=new int[8];
        for (int i=0;i<b.length;i++) {
            b[i]=3*i;
        }
        System.out.println(Arrays.toString(b));
        int[] c={1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0;i<c.length;i++){
            if(c[i]<6) c[i]*=2;
        }
        System.out.println(Arrays.toString(c));
        int[][] d=new int[5][5];
        for (int i=0;i<d.length;i++){
            for (int j=0;j<d[i].length;j++){
                if(i==j) d[i][j]=1;
            }
        }
        System.out.println(Arrays.deepToString(d));
        int[] e=new int[10];
        for (int i=0;i<e.length;i++){
            e[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(e));
        int min=e[0],max=e[0];
        for (int i=1;i<e.length;i++){
            if(e[i]>max) max=e[i];
            if(e[i]<min) min=e[i];
        }
        System.out.println("min = "+min+", max = "+max);
        int [] f= {1,3,2,5,7,9,8};
        System.out.println(checkSums(f));
        shift(f,-3);
        shift(f,3);
        System.out.println(Arrays.toString(f));
    }
    public static boolean checkSums(int[] a){
        if (a.length==0) throw new IllegalArgumentException("Массив должен быть непустой");
        int sum1=0,sum2=0;
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<=i;j++){
                sum1+=a[j];
            }
            for (int k=i+1;k<a.length;k++){
                sum2+=a[k];
            }
            if (sum1==sum2) return true;
            sum1=0;
            sum2=0;
        }
        return false;
    }
    public static void shift(int[] a,int n){
        if (a.length==0) throw new IllegalArgumentException("Массив должен быть непустой");
        if (n==0) return;
        int t1,t2,j;
        if (n>0) {
            int r=n%a.length;
            for (int i=0;i<r;i++){
                t1=a[0];
                a[0]=a[a.length-1];
                for(j=1;j<a.length-1;j+=2){
                    t2=a[j];
                    a[j]=t1;
                    t1=a[j+1];
                    a[j+1]=t2;
                }
                if (j==a.length-1)
                a[a.length-1]=t1;
            }
        }
        else{
            int r=Math.abs(n)%a.length;
            for (int i=0;i<r;i++){
                t1=a[a.length-1];
                a[a.length-1]=a[0];
                for(j=a.length-2;j>0;j-=2){
                    t2=a[j];
                    a[j]=t1;
                    t1=a[j-1];
                    a[j-1]=t2;
                }
                if (j==0)
                a[0]=t1;
            }
        }
    }
}
