import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.ThreadInfo;

class A_W_T{


    A_W_T(){
        Frame fr=new Frame("Form");

        Label name= new Label("Enter your NAME:");
        name.setBounds(60,40,100,40);
        TextField eip=new TextField();
        eip.setBounds(200,40,100,40);


        Label pass=new Label("Your PASSWORD:");
        pass.setBounds(60,100,100,40);
        TextField pip=new TextField();
        pip.setBounds(200,100,100,40);


        Button submit=new Button("Submit");
        submit.setBounds(150,200,50,30);

        Buttonlist bn= new Buttonlist(eip,pip);

        submit.addActionListener(bn);

        fr.add(name);
        fr.add(pass);
        fr.add(pip);
        fr.add(eip);
        fr.add(submit);

        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(1000,1000);
    }
    public static void main(String[] args) {

        new A_W_T();
    }
}
class Buttonlist implements ActionListener{

    TextField eip;
    TextField pip;

    Buttonlist(TextField eip,TextField pip){
        this.eip=eip;
        this.pip=pip;

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(eip.getText());
        System.out.println(pip.getText());

    }
}