import oop.lsp.*;

public class Lab09_2 {
    public static void main(String[] args) {
        System.out.println("=== All Birds Moving ===");
        new Sparrow().move();
        new Eagle().move();
        new Penguin().move();
        new Ostrich().move();

        System.out.println("\n=== Flying Birds ===");
        new Sparrow().fly();
        new Eagle().fly();
    }
}