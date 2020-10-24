public class Fifteen {

    public static void main(String[] args) {

        String str = "pragraisamazing";
        String chr = "a";
        int counter = 0;
        // could be done with charAt as well, but using strings here:
        for (int x = 0; x < str.length(); x++){
            if (chr.equals(str.substring(x,x+1))) {
                counter = counter+1;
            }
        }
        if (counter > 1) {
            System.out.println("Character " + chr + " appears " + counter + " times");
        }
    }
}
