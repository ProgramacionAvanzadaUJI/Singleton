package singleton;

/**
 * Created by oscar on 13/4/16.
 */
public class SingletonConcurrenteMejorado {
    private static volatile SingletonConcurrenteMejorado instancia = null;
    private static int numeroInstancias = 0;

    private SingletonConcurrenteMejorado() {
        super();
    }

    public static SingletonConcurrenteMejorado getInstance() {
        if (instancia == null)
            synchronized (SingletonConcurrenteMejorado.class) {
                if (instancia == null)
                    try {
                        Thread.sleep(10);
                        instancia = new SingletonConcurrenteMejorado();
                        numeroInstancias++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        return instancia;
    }

    public static void saludo() {
        System.out.println("Hola soy la única instancia de Singleton: " + numeroInstancias);
    }
}
