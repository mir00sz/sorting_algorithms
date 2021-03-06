package sort;

public class SelectionSort  extends SortAbstr{


    //time complexity: theta(n^2), O(n^2)
    //memmory complexity: n


    private static int VAR=0;

    public void sort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int indexOfMinimalElement = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMinimalElement])
                    indexOfMinimalElement = j;
            }

            swap(arr, i, indexOfMinimalElement);
        }

    }

}
