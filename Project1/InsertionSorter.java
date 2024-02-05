public class InsertionSorter {

    private int numberOfComparisons;
    private int numberOfArrayWrites;

    public InsertionSorter() {
        resetComparisonCount();
        resetWritesCount();
    }

    private void resetComparisonCount() {
        numberOfComparisons = 0;
    }

    private void resetWritesCount() {
        numberOfArrayWrites = 0;
    }

    private boolean lessThan(int value1, int value2) {
        numberOfComparisons += 1;
        return value1 < value2;
    }

    public void sort(int[] data) {
        resetComparisonCount();
        resetWritesCount();
        if ((data != null) && (data.length > 0)) {
            int temp;
            int i;
            int j;
            for (i = 1; i < data.length; i++) { // Insert ith record
                for (j = i; (j > 0) && lessThan(data[j], data[j-1]); j--) {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                    numberOfArrayWrites += 2;
                }
            }
        }
    }

    public void sort2(int[] data) {
        // TODO: Remove the next line after completing this method
        System.out.println("sort2 method not implemented yet, so array will be unchanged...");
        resetComparisonCount();
        resetWritesCount();

        if ((data != null) && (data.length > 0)) {
            // TODO: Write a variant of the sort method that reduces the number of array writes

        }
    }

    public int getNumberOfComparisons() {
        return numberOfComparisons;
    }

    public int getNumberOfArrayWrites() {
        return numberOfArrayWrites;
    }
}
