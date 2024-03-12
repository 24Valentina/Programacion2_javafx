package co.edu.uniquindio.computerfx.maestroapp.factory;

public class ModelFactory {
   private static ModelFactory modelFactory;

    public ModelFactory() {
    }

    public static ModelFactory getInstancia() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
}
