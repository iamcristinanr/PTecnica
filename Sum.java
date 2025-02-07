
import java.util.ArrayList;
import java.util.List;

public class Sum {


    public static List<Integer> processList(String inputUser){

        String[] numbers = inputUser.split(",");
        List<Integer> listNumbers = new ArrayList<>();

        for (String numberStr : numbers){
            int number = Integer.parseInt(numberStr);
            listNumbers.add(number);
        }

        return listNumbers;

    }

    public static int sumList (List<Integer> listUser){

        Integer resultSum = 0;
        for (Integer number : listUser){
            resultSum += number;

        }
        return resultSum; 
    }
}
