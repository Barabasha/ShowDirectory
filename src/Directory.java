import java.io.File;
import java.io.IOException;

class Directory {
    /**
     * This method creates a directory tree
     * @param path Directory path
     * @param name_dir Directory names
     * @param name_file Files names in directories
     * @param numbers_dir Number of directories
     * @param numbers_file Number of files
     * @throws IOException IOException
     */

    void createDir(String path, String name_dir, String name_file, int numbers_dir, int numbers_file) throws IOException {
        File dir = new File(path);
        dir.mkdir();
        for (int i = 1; i < numbers_dir + 1; i++) {
            File child_dir = new File(path + name_dir + Integer.toString(i));
            child_dir.mkdir();
            for (int j = 1; j < numbers_file + 1; j++) {
                File file = new File(path + name_dir + Integer.toString(i) + name_file + Integer.toString(j) + ".txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
            }
        }
    }

    /**
     * This method shows the contents of the directory
     * @param dir Directory
     * @param path Directory path
     */
    void showDir(File dir, String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            for (File unit : files) {
                if (unit.exists()) {
                    if (!unit.isDirectory()) {
                        System.out.print("-");
                        System.out.println("-" + unit.getName());
                    }
                }
                if (unit.isDirectory()) {
                    System.out.print("-");
                    System.out.println(unit.getName());
                    showDir(unit, unit.getAbsolutePath());
                }
            }
        }
    }
}
