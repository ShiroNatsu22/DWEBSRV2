package Practica4;

/**
 * Created by jgarcias on 29/09/16.
 */
public class Persones {
    private String nom;
    private String adreca;

}
class Estudiant extends Persones{
  private String documentIdentificacio;
    private String dataAlta;
    private int edat;


}
class Intercambi extends Estudiant{

    private String paisOrigen;
}
class Treballadors extends Persones{

    private String numSS;

}
class PersonalGestio extends Treballadors {
    private String posicio;
}

class Professor extends Treballadors{
    private String titulacio;
    private String especialitat;

}