import java.lang.reflect.Array;
import java.util.Arrays;

public class Coding {
    public void run() {
        int[] number = new int[4];
        number[0] = 2;
        number[1] = 23;
        number[2] = 4;
        number[3] = 24;
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }

        String name = "Alex";

        for (int j = 0; j <= name.length()-1; j++){
            System.out.println(name.charAt(j));
        }
    }

    public static void main(String[] args) {
        new Coding().run();
    }
    public int[] makeMiddle(int[] nums) {
        int[] numbs = new int[2];
        numbs[0] = nums[nums.length/2 - 1];
        numbs[1] = nums[nums.length / 2];
    }
}
