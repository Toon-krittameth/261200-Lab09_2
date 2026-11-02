import oop.lsp.*;

void main() {
        System.out.println("=== All Birds Moving ===");
        new Sparrow().move();
        new Eagle().move();
        new Penguin().move();
        new Ostrich().move();

        System.out.println("\n=== Flying Birds ===");
        new Sparrow().fly();
        new Eagle().fly();
}