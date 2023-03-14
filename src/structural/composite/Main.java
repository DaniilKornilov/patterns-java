package structural.composite;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("File1");
        File file2 = new File("File2");
        File file3 = new File("File3");

        Folder folder1 = new Folder("Folder1");
        folder1.add(file1);

        Folder folder2 = new Folder("Folder2");
        folder2.add(file2);
        folder2.add(file3);
        folder2.add(folder1);

        folder2.search("rose");
    }

}
