package HW6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Notebook {
    private int Rom;
    private int Ram;
    private double screenSize;
    private int diskSize;

    public Notebook(String brand, String model, String OS, int ROM, int RAM, double screenSize, int diskSize, String color) {
    }

    public static void main(String[] args) {
        NotebookStore store = new NotebookStore();

        store.addNotebook(new Notebook("Dell", "XPS 13", "Windows10", 512, 8, 15.7, 2, "silver"));
        store.addNotebook(new Notebook("Apple", "MacBook Air", "Mac OS X", 256, 32, 17.0, 1, "silver"));
        store.addNotebook(new Notebook("Lenovo", "ThinkPad X1", "Windows 7", 1024, 16, 19, 1, "black"));
        store.addNotebook(new Notebook("HP", "Spectre x360", "Windows 10", 512, 24, 17.0, 2, "gold"));

        Map filters = new HashMap();
        filters.put("operatingSystem", "Windows 10");
        filters.put("hardDriveCapacity", 500);
        filters.put("ramCapacity", 8);

        store.filterNotebooks(filters);
    }

    public Object getModel() {
        return null;
    }

    public Object getBrand() {
        return null;
    }

    public Object getOS() {
        return null;
    }

    public int getRom() {
        return Rom;
    }
    public void setRom(int Rom) {
        this.Rom = Rom;
    }
    public int getRam() {
        return Ram;
    }
    public void setRam(int Ram) {
        this.Ram = Ram;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public int getDiskSize() {
        return diskSize;
    }
    public void diskSize(int diskSize) {
        this.diskSize = diskSize;
    }
    public Object getColor() {
        return null;
    }
}
