import javax.swing.*;

public class App {


    //THIS IS CURRENTLY NOT WORKING AS INTENDED
    //TODO LEARN SHIT

    public static int width = 600;
    public static int height = 400;

    public static void main(String[] args) {
        //This is for practicing JFrame and JPanel interaction and how to change between panels
        //This should just make a JFrame and project panels on it at the correct time

        System.out.println("TestTestTest");

        JFrame frame = new JFrame("TestFrame");
        Menu menu = new Menu(width,height);

        frame.setSize(width, height);
        frame.add(menu);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.requestFocus();
    }
}
