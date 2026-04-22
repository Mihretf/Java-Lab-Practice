public class quadraticsolver {
    public void solver(double a, double b, double c){
        double d =(b*b) - (4*a*c) ;
        if (d >0 ){
            double s1 = (-b + Math.sqrt(d) / (2*a));
            double s2 = (b - Math.sqrt(d) / (2 *a));
            System.out.println("We have two real roots of " + s1  + "and " + s2);
        } else if(d ==0 ){
            double s3 = -b / (2*a);
            System.out.println("We have one real root of : " + s3);

        }else {
            System.out.println("There is no real root");
        }

    }
}