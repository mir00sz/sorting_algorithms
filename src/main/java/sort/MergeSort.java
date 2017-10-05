package sort;

//Mergesort guarantees to sort an array of N items in time proportional to N log N.
// Its prime disadvantage is that it uses extra space proportional to N.
//source: http://algs4.cs.princeton.edu/22mergesort/

public class MergeSort extends SortAbstr {


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

        for (int i = lo; i < hi; i++) {
            aux[i] = a[i];
        }

        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j];
                j++;
            }
            else if (j > hi) {
                a[k] = aux[i];
                i++;
            }
            else if (aux[j] < aux[i]) {
                swap(a, k, j);
                j++;
            } else if (aux[i] < aux[j]) {
                swap(a, k, j);
            }


        }

    }
}
