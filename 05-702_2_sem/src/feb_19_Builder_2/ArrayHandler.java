package feb_19_Builder_2;

import java.util.Arrays;

public class ArrayHandler {

    private int[] array;

    public ArrayHandler(int[] array){
        this.array = array;
    }

    public ArrayHandler sort(){
        Arrays.sort(array);
        return this;
    }

    public ArrayHandler changeSign(){
        for (int i = 0; i < array.length; i++) {
            array[i] *= (-1);
        }
        return this;
    }

    public ArrayHandler relu(){
        for (int i = 0; i <array.length; i++) {
            if(array[i] < 0){
                array[i] = 0;
            }
        }
        return this;
    }

    public ArrayHandler trim(){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
        return this;

    }

    public int findMax(){
        int max = array[0];
        for (int i = 1; i <array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(){
        int min = array[0];
        for (int i = 1; i <array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public double average(){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum * 1.0 / array.length;
    }



    @Override
    public String toString() {
        return "array=" +
                Arrays.toString(array);
    }


}
