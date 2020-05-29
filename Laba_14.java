import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Laba_14 extends Frame implements ActionListener {
    Label label1, label2, label3;
    TextField textField1, textField2, textField3;
    Button but1, but2;

    public Laba_14() {
        setLayout(null);
        label1 = new Label("a");
        label1.setLocation(150, 155);
        label1.setSize(100, 10);

        label2 = new Label("b");
        label2.setLocation(150, 185);
        label2.setSize(100, 10);

        label3 = new Label("sum");
        label3.setLocation(150, 215);
        label3.setSize(100, 10);

        textField1 = new TextField();
        textField1.setLocation(200, 150);
        textField1.setSize(100, 25);

        textField2 = new TextField();
        textField2.setLocation(200, 180);
        textField2.setSize(100, 25);

        textField3 = new TextField();
        textField3.setLocation(200, 210);
        textField3.setSize(100, 25);

        but1 = new Button("Calculate");
        but1.setSize(100, 25);
        but1.setLocation(200, 250);
        but1.addActionListener(this);

        but2 = new Button("Clear");
        but2.setSize(100, 25);
        but2.setLocation(200, 280);
        but2.addActionListener(this);

        add(textField1);
        add(textField2);
        add(textField3);
        add(but1);
        add(but2);
        add(label1);
        add(label2);
        add(label3);

        setSize(500, 500);
        setLocation(500, 100);
        setTitle("Sum of two digits");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Calculate")) {
            try {
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());
                int c = a + b;
                textField3.setText(String.valueOf(c));
            } catch (NumberFormatException nf) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("Error");
            }

        } else {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
        }
    }

    public static void main(String[] args) {
        new Laba_14();
    }
}

