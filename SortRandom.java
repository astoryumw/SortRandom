import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Built a class that randomizes an array, checks if its sorted, then rescrambles it if it is not
public class SortRandom {
    public static void main(String[] args) {
        Integer[] newArray = {3, 1, 2};
        System.out.println(Arrays.toString(newArray));
        SortRandom sr = new SortRandom();
        // System.out.println(Arrays.toString(sr.randomArray(newArray)));
        while (!sr.isSorted(newArray)) {
            newArray = sr.randomArray(newArray);
            System.out.println(Arrays.toString(newArray));
        } 
    }

    public Integer[] randomArray(Integer[] array) {
        List<Integer> intList = Arrays.asList(array);
        Collections.shuffle(intList);
        intList.toArray(array);
        return array;
    }

    public boolean isSorted(Integer[] array) {
        for (int i=0; i < array.length-1; i++) {
            // System.out.println(array[i]);
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}