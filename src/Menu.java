import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This will create a menu panel
public class Menu extends JPanel implements ActionListener {

    private int width, height;
    private int value;
    CardLayout layout = new CardLayout();
    JPanel menuPanel = new JPanel();
    JPanel gamePanel = new JPanel();

    JButton close = new JButton("Close");
    JButton easy = new JButton("Easy");
    JButton medium = new JButton("Medium");
    JButton hard = new JButton("Hard");

    public Menu(int width, int height){
        this.width = width;
        this.height = height;
        this.setLayout(layout);
        menuPanel.setBackground(Color.CYAN);
        addButtons();
        this.add(gamePanel,"Game");
        this.add(menuPanel,"Menu");
        layout.show(this,"Menu");
        //TODO UNDERSTAND THE ABOVE AND APPLY IT


    }

    private void addButtons(){
        easy.addActionListener(this);
        medium.addActionListener(this);
        hard.addActionListener(this);
        close.addActionListener(this);

        menuPanel.add(easy);
        menuPanel.add(medium);
        menuPanel.add(hard);

        gamePanel.add(close);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object source = actionEvent.getSource();
        //sysout is only for testing purposes
        if (source == easy){
            value = 0;
            gamePanel.setBackground(Color.BLACK);
            layout.show(this,"Game");
            System.out.println(value + " The color should be black");
        }
        else if(source == medium){
            value = 1;
            gamePanel.setBackground(Color.BLUE);
            System.out.println(value + " The color should be blue");
            layout.show(this,"Game");
        }
        else if(source == hard){
            value = 2;
            gamePanel.setBackground(Color.GREEN);
            layout.show(this,"Game");
            System.out.println(value + " The color should be green");

        }
        else if (source == close){
            System.out.println("aödfljadbjvasdflj");
            System.exit(0);
        }

    }
    public int getValue(){
        return value;
    }
}
