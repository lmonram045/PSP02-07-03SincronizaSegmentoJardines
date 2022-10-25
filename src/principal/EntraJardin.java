package principal;

public class EntraJardin extends Thread {

    private RecursoJardin jardin; // Recurso compartido

    public EntraJardin(String nombre, RecursoJardin jardin) {
        this.setName(nombre); // Establece el nombre del hilo, setName es un método de la clase Thread
        this.jardin = jardin;
    }

    /**
     * Método que ejecuta el hilo
     */
    @Override
    public void run() {
        synchronized (jardin) { // Sincroniza el acceso al recurso compartido
            jardin.incrementaCuenta(); // Incrementa la cuenta de personas en el jardín
        }
    }

}

