package one.digitalinnovation.Singleton;

import one.digitalinnovation.Singleton.SIngletonLazyHolder;
import one.digitalinnovation.Singleton.SingletonEager;
import one.digitalinnovation.Singleton.SingletonLazy;

public class TesteSingleton {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SIngletonLazyHolder lazyHolder = SIngletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SIngletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


    }
}
