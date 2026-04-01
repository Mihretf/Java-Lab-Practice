// this is the class header, it should match the file name, it actually automatically creates this class when I first create the file, why tho?

public class practice {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }

}

//! public class practice:
// this is called class declaration.
// Public : access modifier--> it means this class can be accessed from anywhere, we can change it into private or protected later on. 

// Class: class is basically us creating a blueprint or a template. So when we say class practice- it means I am creating a blueprint or a template called practice. 

//! public static void main(String[] args)
// this is what we call the main method. 
// This is where Java will start running my program.
// public: again access modifier
// static: when we add the word static it means that Java can ran the program without needing to create an object. It can be run directly
// void: this is a return method right, so in this case this method will return nothing, we can change it to int or some other data type when we want to return something that has a type of something. 
// main: without this the program literally won't run. 

// String: accepts a text data type.
// []: array of multiple values, so it can accept mutliple texts
// args: this is the variable name

// so the whole thing would mean, an array of text values passed to the program. 

// We can access the specific words through like by indexing on the arg and it would give us the word. args[0]...


//! System.out.println ("Hello, Java! ");
// this is the syntax that prints output to the console. 
// system.out basially means output stream....
// println: means print line which means print the following things 
