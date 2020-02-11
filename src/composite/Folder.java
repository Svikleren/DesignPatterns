package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Folder {
    String name;
    List<Folder> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder folder) {
        list.add(folder);
    }

    public void addFolder(Folder... folders) {
        list.addAll(Arrays.asList(folders));
    }

    public void printFolders() {
        list.forEach(folder -> {
            System.out.println(folder.name);
            folder.printFolders();
        });
    }
}
