import java.util.ArrayList;

public class Lider {

    public ArrayList<Integer> damelista(ArrayList<Integer> array){

        for(int i=0; i<10;i++){

            array.add((int)(Math.random()*100)+1);


        }


        return array;
    }

    public <T> void damelista(T[] array){

        for(T elemento:array){

            System.out.println(elemento);
        }


    }


}
