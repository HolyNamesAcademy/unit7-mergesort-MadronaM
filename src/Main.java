import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Use main to run and test the below functions
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses selection sort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void selectionSort(ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("SelectionSort() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function searches linearly in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int linearSearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function uses binary search in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. THIS ARRAYLIST MUST BE
     *                  IN SORTED ORDER. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int binarySearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses MergeSort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void mergeSort(ArrayList<Integer> arrayList) {
        //throw new UnsupportedOperationException("mergeSort() has not been implemented yet");

        //for(int i = 0; i <= arrayList.size(); i++){
        //    sort(arrayList, 0, arrayList.size());
        //}
    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function sorts the portion of arrayList specified by the range [lo, hi). The range
     * includes lo but excludes hi (arrayList[lo] is the first element in the range, but
     * arrayList[hi] is the first element after the last element in the range).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the range
     * @param hi the index of the last element in the range + 1.
     */
    public static void sort(ArrayList<Integer> arrayList, int lo, int hi) {
        //throw new UnsupportedOperationException("sort() has not been implemented yet");

        if(arrayList.size() == 0 || arrayList.size() == 1){
            return;
        }

        int mid ;

        if(lo < hi) {
            mid = (lo + hi) / 2;
            sort(arrayList, lo, mid);
            sort(arrayList, mid + 1, hi);
            merge(arrayList, lo, mid, hi);
        } else {
            return;
        }



    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function merges two consecutive, sorted ranges in the arrayList into one sorted range. The ranges
     * are specified as [lo, mid) and [mid, hi). Each range includes the first element, but excludes
     * the last element (the same way as in sort()).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the first range
     * @param mid the boundary point of the two ranges. arrayList[mid] is in the second range.
     * @param hi the index of the last element in the second range + 1.
     */
    public static void merge(ArrayList<Integer> arrayList, int lo, int mid, int hi) {

        ArrayList <Integer> manipulate = new ArrayList<Integer>();

        int range1 = lo;
        int range2 = mid;

        while(range1 < mid || range2 < hi){
            if(range1 >= mid){
                manipulate.add(arrayList.get(range2));
                range2++;
            }
            else if(range2 >= hi){
                manipulate.add(arrayList.get(range1));
                range1++;
            }
            else{
                if(arrayList.get(range1) < arrayList.get(range2)){
                    manipulate.add(arrayList.get(range1));
                    range1++;
                }
                else if(arrayList.get(range2) < arrayList.get(range1)){
                    manipulate.add(arrayList.get(range2));
                    range2++;
                }
            }
        }
        int j = 0;
        for(int i = lo; i < hi; i++) {
            arrayList.set(i, manipulate.get(j));
            j++;

        }
    }
}
