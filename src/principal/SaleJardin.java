package principal;

public class SaleJardin extends Thread {

    private RecursoJardin jardin; // Recurso compartido

    public SaleJardin(String nombre, RecursoJardin jardin) {
        this.setName(nombre); // Establece el nombre del hilo, setName es un método de la clase Thread
        this.jardin = jardin;
    }

    /**
     * Método que ejecuta el hilo
     */
    @Override
    public void run() {
        synchronized (jardin) { // Sincroniza el acceso al recurso compartido
            jardin.decrementaCuenta(); // Decrementa la cuenta de personas en el jardín
        }
    }

}

