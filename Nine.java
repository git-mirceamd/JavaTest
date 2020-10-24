import java.util.Arrays;

public class Nine {

    public static void main(String[] args) {

        int [] sorting = new int[] {7,2,5,1,3,6,4};

        for (int x = 0; x < sorting.length; x++) {
            for (int y = x + 1; y < sorting.length; y++) {
                int temp = 0;
                if (sorting[x] > sorting[y]) {
                    temp = sorting[x];
                    sorting[x] = sorting[y];
                    sorting[y] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sorting));
    }
}
