package Practica1;

import java.util.List;

/**
 * Created by jgarcias on 21/09/16.
 */
public class Agenda {
    private int any;
    private List<Pagina> pagines;
    void passaPagina( int pagina) {

    }

    void tornaPagina (int pagina){

    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public List<Pagina> getPagines() {
        return pagines;
    }

    public void setPagines(List<Pagina> pagines) {
        this.pagines = pagines;
    }
}

class Pagina{
    private int dia;
    private int mes;
    private boolean festiu;

    void escriureCita(String escriure){

    }
    void esborraCita(){

    }

}

class Cita{
    private String motiu;
    private double horaInici;
    private double horaFi;

    void motiu(String motiu){

    }
}