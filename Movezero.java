
import java.util.ArrayList;
import java.util.List;

public class MoveZero {

    //Change to process objects, not only numbers
    public static List<Object> processList(String inputUser){

        String[] elements = inputUser.split(",");
        List<Object> listElements = new ArrayList<>();

        for (String element : elements) {
            listElements.add(element);
        }

        return listElements;

    }

    public static List<Object> moveZero(List<Object> listUser){

        for (int i = 0; i < listUser.size(); i++){
            if (listUser.get(i).equals("0") ){
                
                listUser.remove(i);
                listUser.add(0);
                --i; // Come back to index deleted. Example: 1,0,0,3
            }
        }
        return listUser;
    }
}
