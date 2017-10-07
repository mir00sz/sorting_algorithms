package sort;

//Mergesort guarantees to sort an array of N items in time proportional to N log N.
// Its prime disadvantage is that it uses extra space proportional to N.
//source: http://algs4.cs.princeton.edu/22mergesort/

import org.apache.log4j.Logger;

public class MergeSort extends SortAbstr {

    private static final Logger LOGGER = Logger.getLogger(MergeSort.class);

    public void sort(int[] arr) {

        int aux[] = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);


    }


    private void sort(int[] arr, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(arr, aux, lo, mid);
        sort(arr, aux, mid + 1, hi);
        merge(arr, aux, lo, mid, hi);

    }


    private void merge(int[] a, int[] aux, int lo, int mid, int hi) {

        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }

        int counterLeft1 = lo;
        int counterRight1 = mid + 1;
        for (int i = lo; i <= hi; i++) {
            if (counterLeft1 > mid) {
                a[i] = aux[counterRight1++];
            } else if (counterRight1 > hi) {
                a[i] = aux[counterLeft1++];
            } else if (aux[counterRight1] < aux[counterLeft1]) {
                a[i] = aux[counterRight1++];
            } else a[i] = aux[counterLeft1++];
        }

    }
}
