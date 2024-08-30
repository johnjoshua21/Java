import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exit extends Frame {

    Exit()
    {
       Button btn=new Button();
       add(btn);

       addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
       });

       setLayout(new FlowLayout());
       setSize(500,500);
       setVisible(true);
    }

    public static void main(String[] args) {
        new Exit();
    }
}
