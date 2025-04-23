public class FirstRepeatStr {
    public static void main(String[] args) {
        String palin = "hhelloo";
        String check = " ";
        for (int i = 0; i < palin.length(); i++) {
            for (int k = 0; k < check.length(); k++) {
                if (palin.charAt(i) == check.charAt(k)) {
                    System.out.println(check.charAt(i));
                    i++;

                }
            }
            check = check + palin.charAt(i);
        }
    }

}
