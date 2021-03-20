package CreationalPatterns.Singleton;

public class President {
    // The sole instance of the class
    private static President obj = null;

    // Make the constructor private so its only accessible to
    // members of the class.
    private President() {
        System.out.println("President is Created..");
    }

    // Create a static method for object creation
    public static President getInstance() {
        // lazy or delayed creation of the object
        if(obj == null)
            obj = new President();
        return obj;
    }
}
