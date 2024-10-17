import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecurityManager securityManager = System.getSecurityManager();
        
        if (securityManager != null) {
            System.out.println("A security manager is already established.");
        } else {
            System.out.println("No security manager is established.");
        }
    }
}