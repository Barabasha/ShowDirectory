import java.io.File;
import java.io.IOException;

public class FileManipulation {
    public static void main(String[] args) throws IOException {

        Directory catalog = new Directory();
        String path = "C:\\dir";
        String name_dir = "\\dir";
        String name_file = "\\file";
        int numbers_dir = 3;
        int numbers_file = 4;
        File dir = new File(path);
        dir.mkdir();

        catalog.createDir(path, name_dir, name_file, numbers_dir, numbers_file);
        System.out.println(dir.getName());
        catalog.showDir(dir, path);
    }
}

