import java.util.ArrayList;

public class Lider {

    public ArrayList<Integer> damelista(ArrayList<Integer> array){

        for(int i=0; i<array.size();i++){

            array.add((int)(Math.random()*100)+1);

        }


        return array;
    }


}
