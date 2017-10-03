package sort;

//Mergesort guarantees to sort an array of N items in time proportional to N log N.
// Its prime disadvantage is that it uses extra space proportional to N.
//source: http://algs4.cs.princeton.edu/22mergesort/

public class MergeSort extends SortAbstr{


    public void sort(int[] arr) {

        int mid = arr.length/2;



    }


    private void merge(int[] a, int lo, int mid, int hi){




        int[] aux=new int[a.length];

        int aCounter = lo;
        int bCounter = mid+1;


        for (int i = 0; i<aux.length;i++){
            if (a[aCounter]<a[bCounter]){
                aux[i]=a[aCounter];
                aCounter++;
            } else if (a[bCounter]<a[aCounter]){
                aux[i]=a[bCounter];
                bCounter++;
            }
        }

    }





}
