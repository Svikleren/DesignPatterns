package composite;

public class Main {
    public static void main(String[] args) {
        Folder users = new Folder("users");
        Folder etc = new Folder("etc");
        Folder root = new Folder("root");

        root.addFolder(users, etc);

        Folder max = new Folder("Max");
        users.addFolder(max);

        root.printFolders();
    }
}
