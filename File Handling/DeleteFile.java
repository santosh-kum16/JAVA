import java.io.File;  // Import the File class

public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File("filename.txt");
        if (obj.delete()) {
            System.out.println("Deleted the file: " + obj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}