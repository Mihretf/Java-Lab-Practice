public class constdemo {
    String name, id;

    public constdemo(String name, String id){
        this.name = name;
        this.id = id;
        System.out.println("constructor called");
    }

    public constdemo(String department){
        System.out.println("Student department: " + department);
    }

   void display(){
    System.out.println("Name is: " + name + "  Id is: " + id);
   }

}
