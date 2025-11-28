
public class SortingFactory{
    public static void apply(String type,int[] arr){
        switch(type){
            case "selection": SelectionSort.sort(arr); break;
            case "insertion": InsertionSort.sort(arr); break;
            case "merge": MergeSort.sort(arr,0,arr.length-1); break;
            case "quick": QuickSort.sort(arr,0,arr.length-1); break;
        }
    }
}
