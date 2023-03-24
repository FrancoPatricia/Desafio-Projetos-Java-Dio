package one.digitalinnovation.Facade;

import one.digitalinnovation.Singleton.SIngletonLazyHolder;
import one.digitalinnovation.Singleton.SingletonEager;
import one.digitalinnovation.Singleton.SingletonLazy;

public class TesteFacade {

    public static void main(String[] args) {

        // Testes relacionados a Facade:

        Facade facade = new Facade();
        facade.migrarCliente("Patricia", "13940000");


    }
}
