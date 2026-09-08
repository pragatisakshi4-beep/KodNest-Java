public class Prog6 {
    public static void main(String[] args) {
        String s1 = "Raja";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        String s2 = "raja";
        if(s1.equals(s2)) {
            System.out.println("strings are equal");
        }
        else {
            System.out.println("strings are not equal");
        }
    }
}
