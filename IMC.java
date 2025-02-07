
public class IMC {

    public static String calculateIMC(double weight, double height){

        double imc = weight / (height * height);
        
        if (imc <= 18) {
            return "Infrapeso";
        } else if (imc <= 25.0) {
            return "Normal";
        } else if (imc <= 30) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }

}