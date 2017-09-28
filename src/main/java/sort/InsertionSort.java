package sort;

public class InsertionSort extends SortAbstr{

    //O(n^2)
    //theta(n)
    //omega(n)
    //Insertion sort works well for certain types of nonrandom arrays
    // that often arise in practice, even if they are huge.
    //
    // An inversion is a pair of keys that are out of order in the array.
    // For instance, E X A M P L E has 11 inversions:
    // E-A, X-A, X-M, X-P, X-L, X-E, M-L, M-E, P-L, P-E, and L-E.
    //
    // If the number of inversions in an array is less than a constant multiple of the array size,
    // we say that the array is partially sorted.
    //Source: Algorithms, http://algs4.cs.princeton.edu/21elementary/


    public void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 && arr[j] <= arr[j-1]; j--) {
                swap(arr,j,j-1);
            }
        }

    }

}
