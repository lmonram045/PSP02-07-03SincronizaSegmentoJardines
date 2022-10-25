package principal;

public class Main {
    public static void main(String[] args) {
        RecursoJardin jardin = new RecursoJardin(); // Crea un objeto RecursoJardin
        // Crea 10 hilos de tipo EntraJardin
        for (int i = 0; i < 10; i++) {
            new EntraJardin("Entra " + i, jardin).start();
        }
        // Crea 15 hilos de tipo SaleJardin
        for (int i = 0; i < 15; i++) {
            new SaleJardin("Sale " + i, jardin).start();
        }

    }
}
