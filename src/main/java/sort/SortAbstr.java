package sort;

public abstract class SortAbstr implements SortingInterface{


    protected void swap(int[] arr, int firstIndex, int secondIndex){
        int copy = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = copy;
    }

}
