
import java.util.List;

public class MoveZero {

    public static List<Integer> moveZero(List<Integer> listUser){

        for (int i = 0; i < listUser.size(); i++){
            if (listUser.get(i) == 0){
                
                listUser.remove(i);
                listUser.add(0);
            }
        }
        return listUser;
    }
}
