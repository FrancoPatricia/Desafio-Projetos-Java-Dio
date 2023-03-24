package one.digitalinnovation.Strategy;

import one.digitalinnovation.Singleton.SIngletonLazyHolder;
import one.digitalinnovation.Singleton.SingletonEager;
import one.digitalinnovation.Singleton.SingletonLazy;

public class TesteStrategy {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Strategy:

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
    }
}
