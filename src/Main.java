
public class Main {
    public static void main(String[] args) {

        Rainbow rainbow = new Rainbow(1); // red
        Rainbow rainbow2 = new Rainbow(0); // error
        Rainbow rainbow3 = new Rainbow(3, 6); // yellow-blue
        Rainbow rainbow4 = new Rainbow(3, 10); // error
        Rainbow rainbow5 = new Rainbow(4, 4); // green
    }
}