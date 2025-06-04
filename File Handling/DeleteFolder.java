import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\MyName\\Test");
        if (obj.delete()) {
            System.out.println("Deleted the folder: " + obj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}