public class tryVaribale {
    public static void main(String[] args){
        int age= 21;
        String name = "Mihret";
        String course = "Java";
        double GPA= 3.8;
        boolean passed = true;



        // System.out.println(age);
        // System.out.println(name);

        System.out.println("My name is " + name );
        System.out.println("I am " + age + "years old");
        System.out.println("I am learning " + course);

        // eX. 2

        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + GPA);
        System.out.println("Passed: " + passed);

        // ex. 3
        System.out.println("Hello " + name + " !");
        System.out.println("Next year you will be " + (age+1) + " years old. ");


        if(age>18){
            System.out.println("You, my baby are an adult");
        }else{
            System.out.println("You are actually an acutal baby,minor");
        }

        if (name.equals("Mihret")){
            System.out.println("Hello Mercyyyy");
        }
    }

}

// while adding values in java, we need to mask them in a bracket or else it will treat me as a string concatenation. 


