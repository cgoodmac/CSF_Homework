public class IntArraySorter {
    public int[] sortArray(int[] array) {
        // TODO:
        // For each number in the array
        // Look at every number after it, in sequence
        // If the first number is greater than the second, swap them
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i=0; i < array.length - 1; i++ ){
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}