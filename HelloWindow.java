import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class HelloWindow extends JFrame{
    private JButton btnGreet;

    public HelloWindow(){
        btnGreet = new JButton("Greet");
        setTitle("Hello World");
        setSize(300,300);
        add(btnGreet);
        setLocationRelativeTo(null);
        btnGreet.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Hello", "Hello World", JOptionPane.INFORMATION_MESSAGE);
            }
            
        });
        setVisible(true);
    }

    public static void main(String args[]){
        new HelloWindow();
    }
}