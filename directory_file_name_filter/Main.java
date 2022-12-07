import java.io.File;
import java.io.FilenameFilter;


public class Main {
    public static void main(String[] args) {
        System.out.println("begin listing files\n");

        File directory = new File("./target-folder");

        String[] fileNames = directory.list(
            // new FilenameFilter() {
            //     @Override
            //     public boolean accept(File dir, String name) {
            //         return name.endsWith(".bar");
            //     }
            // }
            (dir, name) -> name.endsWith(".bar")
        );

        for (String fileName: fileNames) {
            System.out.println(fileName);
        }

        System.out.println("\nend listing files");
    }
}
