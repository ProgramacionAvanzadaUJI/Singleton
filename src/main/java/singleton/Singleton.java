package singleton;

/**
 * Created by oscar on 13/4/16.
 */
public class Singleton {
    private static Singleton instancia = null;
    private static int numeroInstancias = 0;

    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        if (instancia == null) {
            try {
                Thread.sleep(10); // Simula que crear la instancia lleva un tiempo.
                instancia = new Singleton();
                numeroInstancias++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return instancia;
    }

    public static void instanciasConcurrentes() {
        System.out.println("El número de instancias creadas es: " + numeroInstancias);
    }
}
