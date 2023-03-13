public class SelectionSort implements ISortingStrategy {
    private double startTme = System.currentTimeMillis();
    private int[] sortedData;


    @Override
    public void sort(int[] data) {
        this.sortedData = data;
        for (int i = 0; i< sortedData.length -1; i++) {
            int index = i;
            for(int j = i+1; j < sortedData.length; j++) {
                if(sortedData[j] < sortedData[index])
                    index = j;
            }
            int smallerNumber = sortedData[index];
            sortedData[index] = sortedData[i];
            sortedData[i] = smallerNumber;

        }
    }

}
