public class Prog5 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "jaVa";
        if(s1 == s2) {
            System.out.println("Ref are equal");
        }
        else {
            System.out.println("Ref are not equal");
        }
        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("strings are equal");
        }
        else {
            System.out.println("strings are Not equal");
        }       
    }
    
}
