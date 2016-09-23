package Practica2;

/**
 * Created by jgarcias on 23/09/16.
 */
public class GarbajeCollection {
    @Override
    protected void finalize() throws Throwable{

        System.out.println("ola k ase? me e limpiado o k ase?");

    }

    public static void main(String[] args) throws Throwable {
       GarbajeCollection gc =  new GarbajeCollection();
        gc = null;
        System.gc();
    }
}
