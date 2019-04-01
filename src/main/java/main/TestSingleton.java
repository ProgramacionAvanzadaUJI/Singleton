package main;

import singleton.Singleton;

/**
 * Created by oscar on 13/4/16.
 */
public class TestSingleton {
    private void ejecuta() {
        for(int i = 0; i < 1000; i++)
            new Thread(new Hilo()).start();
        Singleton.instanciasConcurrentes();
    }
    public static void main(String[] args) {
        new TestSingleton().ejecuta();
    }
    private class Hilo implements Runnable {
        @Override
        public void run() {
            Singleton.getInstance();
        }
    }
}
