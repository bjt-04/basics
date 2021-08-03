import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public void prt255() {
        for(int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void prtoddnum() {
        for(int i = 1; i <= 255; i = i + 2) {
            System.out.println(i);
        }
    }

    public int sum255() {
        int sum = 0;
        for(int i = 1; i <= 255; i++) {
            sum += i;
        }
        return sum;
    }

    public void iteratarray() {
        int[] arrayOne = {1, 3, 5, 7, 9, 13};
        for(int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i]);
        }
    }

    public int max(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        } return max;
    }

    public void oddNumArray() {
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i = i + 2) {
            oddArray.add(i);
        }
        System.out.println(oddArray);
    }
}