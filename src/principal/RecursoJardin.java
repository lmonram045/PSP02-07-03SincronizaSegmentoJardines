package principal;

/**
 * Clase para llevar la cuenta de personas en el jardín
 * @author LMR
 */
public class RecursoJardin {

    private int cuenta; // cuenta de personas en el jardín

    /** Constructor por defecto de la clase RecursoJardin */
    public RecursoJardin() {
        cuenta = 100; // inicialmente hay 100 personas en el jardín
    }

    /** Método que incrementa en uno la cuenta de personas en el jardín */
    public synchronized void incrementaCuenta() {
        // Muestra el hilo que entra en el jardín
        System.out.println("Entra " + Thread.currentThread().getName());
        // Incrementa la cuenta de personas en el jardín
        cuenta++;
        System.out.println("Hay " + cuenta + " personas en el jardín");
    }

    /** Método que decrementa en uno la cuenta de personas en el jardín */
    public synchronized void decrementaCuenta() {
        // Muestra el hilo que sale del jardín
        System.out.println("Sale " + Thread.currentThread().getName());
        // Decrementa la cuenta de personas en el jardín
        cuenta--;
        System.out.println("Hay " + cuenta + " personas en el jardín");
    }
}

