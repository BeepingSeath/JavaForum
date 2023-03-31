import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame{
    private Model m;
    private View v;
    public Controller(Model m, View v) {


        JFrame frame = new JFrame("view");
        frame.setContentPane(v.getJpanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m,v);
    }
}
