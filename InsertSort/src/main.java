public class main {
    public static void main(String[] args) {
        int[] unsortedArr = {1,0,9,3,1,7,32,61};
        unsortedArr = InsertSort(unsortedArr);
        for(int i = 0; i < unsortedArr.length; i++)
            System.out.print(unsortedArr[i]+ " ");
    }
    public static int[] InsertSort(int[] input) {
        for(int i = 0; i <  input.length; i++) {
            int element = input[i];
            int j = i;
            while (j > 0 && input[j-1] > element) {
                input[j] = input[j-1];
                j = j-1;
                input[j] = element;
            }
        }
        return input;
    }
}