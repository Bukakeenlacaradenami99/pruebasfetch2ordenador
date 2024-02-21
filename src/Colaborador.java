import java.util.*;
public class Colaborador {

    private static ArrayList <Integer> edades = new ArrayList <>();
    private static String [] nombres={"pepe", "carlos", "javier", "lucia", "jeremy"};

    public Colaborador(){


    }

    public static ArrayList<Integer> getEdades() {
        return edades;
    }

    public static String[] getNombres() {
        return nombres;
    }

    @Override
    public String toString() {
        return edades.toString();
    }
}
