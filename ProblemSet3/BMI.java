public class BMI{
    public void solveBMI(double weight, double height){
        double result = (weight) / (height *height);

        if (result < 16){
            System.out.println("Severe Thinnes");
        }else if(result > 16 && result < 17){
            System.out.println("Moderate thinness");
        }else if(result >17 && result < 18.5){
            System.out.println("Mild Thinness");
        }else if(result >18.5 && result < 25){
            System.out.println("Normal");
        }else if(result >30 && result < 35){
            System.out.println("Obese Class I");
        }else if(result >35 && result < 40){
            System.out.println("Obese Class II");
        }
        else if(result >40){
            System.out.println("Obese Class III");
        }

    }
}