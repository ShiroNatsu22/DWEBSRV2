package Practica6;

public class Main {
    public static void main (String[] args){
        Persona persona = new Persona();

        Docent docent = new Docent();
        pagaAlTreballador(docent);
        Primaria primaria = new Primaria();
        pagaAlTreballador(primaria);
    }

    public static void pagaAlTreballador(Treballador trabajador) {
        String ccc = trabajador.GetCcc();

    }
}
