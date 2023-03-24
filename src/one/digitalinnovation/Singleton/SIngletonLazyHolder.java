package one.digitalinnovation.Singleton;

public class SIngletonLazyHolder {

    private static class InstanceHolder{
        public static SIngletonLazyHolder instancia = new SIngletonLazyHolder();
    }


    private SIngletonLazyHolder() {
        super();
    }

    public static SIngletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    };
}
