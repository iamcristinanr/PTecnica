
public class Sum {

    public static int sumDigit(int number){

        int total = 0;
        for (int i = 1 ; i <= number; i++){
            //"temp" is aux variable to continue for and sum numbers greater than 9 
            int temp = i;
            while ( temp > 0){
                // sum last digit to total
                total += temp % 10;
                // remove last digit and continue while
                temp /= 10;
            }
        }
        return total; 
    } 
}
