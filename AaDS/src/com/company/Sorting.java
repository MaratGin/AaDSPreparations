package com.company;

public class Sorting {

    public static void main(String[] args) {
//        Boolean[] pr= new Boolean[10000000];
//        int a=2;
//        int b=100000;
//        int count=0;
//        for (int p = 2; p<=b; p++) pr[p] = true;
//        for (int p = 2; p<=b; p++)
//            if (pr[p]){
//                count++;
//                for (int j = 2*p; j <= b; j+=p)
//                    pr[j] = false;
//            }
//        System.out.println(count);

        int[] a={1,9,3,5,0,12,1,2,3,10,11,12};
        Sorting sorting= new Sorting();
        sorting.msort(a,0,11);




    }
    void msort(int [] a,int l, int r){
        if (l>=r) return;
        int m = (l+r)/2;
        msort(a,l, m);
        msort(a,m+1,r);
        merge(a,l, m, r);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    void merge(int [] a,int l, int m, int r) {
        int[] c= new int[a.length];
        int i = l, j = m + 1, k = l;
        while (i <= m && j <= r)
            if (a[i] < a[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = a[j];
                j++;
                k++;
            }
        while (i <= m) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j <= r) {
            c[k] = a[j];
            j++;
            k++;
        }
        for ( i = l; i <= r; i++)
            a[i] = c[i];
    }
}
