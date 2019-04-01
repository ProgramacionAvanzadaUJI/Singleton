package main;

import singleton.SingletonConcurrenteMejorado;

public class TestSingletonConcurrenteMejorado {
    private void ejecuta() {
        for(int i = 0; i < 1000; i++)
            new Thread(() -> SingletonConcurrenteMejorado.getInstance()).start();
        SingletonConcurrenteMejorado.instanciasConcurrentes();
    }
    public static void main(String[] args) {
        new TestSingletonConcurrenteMejorado().ejecuta();
    }
}
