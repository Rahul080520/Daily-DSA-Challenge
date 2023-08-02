import java.util.Arrays;

public class SameElementsAppearsTogether {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 1, 2, 1};
        for(int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if(inputArray[i] == inputArray[j]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[i+1];
                    inputArray[i+1] = temp;
                }
            }
        }
        System.out.println("Result :: " + Arrays.toString(inputArray));
    }
}
