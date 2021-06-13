package com.company;

public class Heap {




    void add(int x, int s, int[] a){
        a[s] = x;
        s++;
        int i = s - 1;
        while (i!=0 && a[i]<a[(i-1)/2]){
            swap(i,(i-1)/2,a);
            i = (i-1)/2;
        }
    }
    void swap(int i, int j, int[] a) {
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
    }

    int minDel(int[] a, int s){
        int ans = a[0];
        swap(0,s-1,a); s--;
        int i = 0, m = 2*i+1;
        if (m+1<s && a[m]>a[m+1]) m++;
        while (2*i+1<s && a[i]>a[m]){
            swap(i,m,a);
            i = m;
            m = 2*i+1;
            if (m+1<s && a[m]>a[m+1]) m++;
        }
        return ans; }


void heapSort(int[] b,int n) {
     int s = 0;

    for (int i = 0; i < n; i++)
        add1(b[i], b.length, b);
    for (int i = n-1; i>=0; i--)
        b[i] = maxDel(b, b.length);

}

    int maxDel(int[] a, int s){
        int ans = a[0];
        swap(0,s-1,a); s--;
        int i = 0, m = 2*i+1;
        if (m+1<s && a[m]<a[m+1]) m++;
        while (2*i+1<s && a[i]<a[m]){
            swap(i,m,a);
            i = m;
            m = 2*i+1;
            if (m+1<s && a[m]<a[m+1]) m++;
        }
        return ans; }

    void add1(int x, int s, int[] a){
        a[s] = x;
        s++;
        int i = s - 1;
        while (i!=0 && a[i]>a[(i-1)/2]){
            swap(i,(i-1)/2,a);
            i = (i-1)/2;
        }
    }
}

