public class Main {
    public static void main(String[] args) {
        // creating the Radio object from the other file
        Radio myRadio = new Radio();

        System.out.println("Starting the program...");
        myRadio.playMusic();
        myRadio.checkVolume(11);

    }
}