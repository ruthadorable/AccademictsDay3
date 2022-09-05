package world.inetum.accademicts3;

import java.util.Arrays;

public class Util {

    public static int findLargestNumber(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(0);
    }

}
