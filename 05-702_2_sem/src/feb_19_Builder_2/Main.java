package feb_19_Builder_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(a));
        ArrayHandler handler =
                new ArrayHandler(a);
//        int[] b = handler.sort();
//        System.out.println(Arrays.toString(b));
//        ArrayHandler h2 = new ArrayHandler(b);
//        int[] c = h2.changeSign();
//        System.out.println(Arrays.toString(c));
        handler = handler
                .changeSign()
                .sort()
                .changeSign()
                .relu();
        System.out.println(handler);
        int max = handler.findMax();
        System.out.println("max = " + max);
        double avg = handler.average();
        System.out.println("average = " + avg);

    }
}
