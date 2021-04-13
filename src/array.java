import java.util.Arrays;

public class array {
    public static void main(String[] args) {
    int[] ns = {28,12,11,99,10,8,88,55};
    System.out.println(Arrays.toString(ns));
//    Arrays.sort(ns);
//        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length -i - 1; j++) {
                if (ns[j] < ns[j+1]) {
                    int tmp=ns[j];
                    ns[j]=ns[j+1];
                    ns[j+1]=tmp;
                }
            }
        }

        System.out.println(Arrays.toString(ns));

    }
}

