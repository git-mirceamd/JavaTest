public class Twelve {

    public static void main(String[] args) {

        String str = "1234";
        boolean digits = true;
        for (int i = 0; i<str.length(); i++) {
            if (!str.substring(i,i+1).matches(".*\\d.*")) {
                digits = false;
            }
        }

        if (digits == true) {
            System.out.println("String contains digits only");
        }else{
            System.out.println("String does not contain digits only");
        }
    }
}
