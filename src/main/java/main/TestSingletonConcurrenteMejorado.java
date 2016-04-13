package main;

import singleton.SingletonConcurrenteMejorado;

/**
 * Created by oscar on 13/4/16.
 */
public class TestSingletonConcurrenteMejorado {
    private void ejecuta() {
        for(int i = 0; i < 1000; i++)
            new Thread(new Hilo()).start();
        SingletonConcurrenteMejorado.saludo();
    }
    public static void main(String[] args) {
        new TestSingletonConcurrenteMejorado().ejecuta();
    }
    private class Hilo implements Runnable {
        @Override
        public void run() {
            SingletonConcurrenteMejorado.getInstance();
        }
    }
}
