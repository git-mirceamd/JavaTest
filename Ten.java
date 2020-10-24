import java.util.Arrays;

public class Ten {
    public static void main(String[] args) {
        String [] str = new String[] {"one", "two", "three"};
        String [] output = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            output[i] = str[str.length-i-1];
        }
        System.out.println(Arrays.toString(output));
    }
}
