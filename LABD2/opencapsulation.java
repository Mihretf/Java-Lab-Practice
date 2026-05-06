public class opencapsulation {
    private String name, id;
    private int age;

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public void setName(String nm){
        this.name = nm;

    }
    
    public void setId(String id){
        this.id = id;

    }

    public void setAge(int a){
        this.age = a;
    }

    public void display(){
        System.out.println(" Name: " + name + " ID: " + id + " Age: " + age);

    }
}


// setter and getters 