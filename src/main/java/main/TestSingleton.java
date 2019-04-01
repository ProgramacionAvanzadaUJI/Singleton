package main;

import singleton.Singleton;

public class TestSingleton {
    private void ejecuta() {
        for(int i = 0; i < 1000; i++)
            new Thread(() -> Singleton.getInstance()).start();
        Singleton.instanciasConcurrentes();
    }
    public static void main(String[] args) {
        new TestSingleton().ejecuta();
    }
}
