package CreationalPatterns.Singleton;

public class Main {
    public static void main(String[] args) {

        President president = President.getInstance();

        System.out.println(president);
    }
}
