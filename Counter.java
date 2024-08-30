import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {

    Counter(){
        Frame fr=new Frame("Counter");


        TextField txt=new TextField("0");
        fr.add(txt);
        txt.setBounds(100,50,200,40);

        Button decr=new Button("Decrement");
        fr.add(decr);
        decr.setBounds(100,180,80,40);
        decr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(txt.getText());
                txt.setText(String.valueOf(--num));
            }
        });

        Button incr=new Button("Increment");
        fr.add(incr);
        incr.setBounds(100,120,80,40);

        ActionListener act1=new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(txt.getText());
                txt.setText(String.valueOf(++num));




            }
        };
        incr.addActionListener(act1);

        Button rest=new Button("Reset");
        fr.add(rest);
        rest.setBounds(200,120,80,40);
        rest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("0");
            }
        });

        fr.setLayout(null);
        fr.setSize(500,500);
        fr.setVisible(true);








    }

    public static void main(String[] args) {
        new Counter();

    }



}




