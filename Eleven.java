public class Eleven {

    public static void main(String[] args) {
        String str = "pragraargarp";
        boolean palindrome = true;
        String uhoh = "";
        if (str.length() % 2 == 0) {
            for (int i=0; i < str.length()/2; i++) {
                if (!str.substring(i,i+1).equals(str.substring(str.length()-1-i,str.length()-i))) {
                    palindrome = false;
                    uhoh = "not";
                }
            }
            System.out.println(str + " is " + uhoh + " a palindrome!");
        }
    }
}
