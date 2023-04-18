package HW6;

import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotebookStore {
    public NotebookStore(){
        ArrayList<Object> notebooks = new ArrayList<>();
    }
    public void addNotebook(Notebook notebook) {
        UnicodeSet notebooks;
        notebooks = null;
        int Notebook;
        Notebook = 0;
        notebooks.add(Notebook);
    }

    public List getNotebooks() {
        List notebooks = null;
        return null;
    }

    public void filterNotebooks(Map filters) {
        Notebook[] notebooks = new Notebook[0];
        for (Notebook notebook : notebooks) {
            boolean matches = true;
            for (Object filterKey : filters.keySet()) {
                Object filterValue = filters.get(filterKey);
                if (filterKey.equals("brand")) {
                    if (!notebook.getBrand().equals(filterValue)) {
                        matches = false;
                    }
                } else if (filterKey.equals("model")) {
                    if (!notebook.getModel().equals(filterValue)) {
                        matches = false;
                    }
                } else if (filterKey.equals("OS")) {
                    if (!notebook.getOS().equals(filterValue)) {
                        matches = false;
                    }
                } else if (filterKey.equals("ROM")) {
                    if (notebook.getRom() < (int) filterValue) {
                        matches = false;
                    }
                } else if (filterKey.equals("RAM")) {
                    if (notebook.getRam() < (int) filterValue) {
                        matches = false;
                    }
                } else if (filterKey.equals("screenSize")) {
                    if (notebook.getScreenSize() < (double) filterValue) {
                        matches = false;
                    }
                } else if (filterKey.equals("diskSize")) {
                    if (notebook.getDiskSize() > (int) filterValue) {
                        matches = false;
                    }
                } else if (filterKey.equals("color")) {
                    if (!notebook.getColor().equals(filterValue)) {
                        matches = false;
                    }
                } else {
                    System.out.println("Неподходящий критерий: " + filterKey);
                }
            }
            if (matches) {
                System.out.println(notebook);
            }
        }
    }
}
