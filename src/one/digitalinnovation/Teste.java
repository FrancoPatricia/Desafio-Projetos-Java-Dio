package one.digitalinnovation;

public class Teste {

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