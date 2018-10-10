import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Decrypt extends JFrame {
    Container cp;
    private JTextArea jtaR = new JTextArea("",30,15);
    private JTextArea jtaL = new JTextArea("",30,15);
    private JScrollPane jspR = new JScrollPane(jtaR);
    private JScrollPane jspL = new JScrollPane(jtaL);
    private JPanel jpnC = new JPanel(new GridLayout(9,1,5,5));
    private JPanel jpnR = new JPanel(new GridLayout(1,1,5,5));
    private JPanel jpnL = new JPanel(new GridLayout(1,1,5,5));
    private JLabel jlb = new JLabel("Method");
    private String methodStr [] = {"DES","AES", "XOR","Caesar"};
    private JComboBox jcb = new JComboBox<String>(methodStr);
    private JLabel jlbpw = new JLabel("PassWord");
    private JTextField jtf = new JTextField();
    private JRadioButton jrb1 = new JRadioButton("Encrypt");
    private JRadioButton jrb2 = new JRadioButton("Decrypt");
    private JButton jbtRN = new JButton("Run");
    private JButton jbtCL = new JButton("Close");
    private ButtonGroup buttonGroup = new ButtonGroup();
    Frame2 frm5;
    public Decrypt(Frame2 frm6){
        frm5 = frm6;
        ex1();
    }private void ex1(){
        this.setBounds(100,100,560,400);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                frm5.setVisible(true);
            }
        });
        cp = this.getContentPane();
        cp.add(jpnL, BorderLayout.WEST);
        cp.add(jpnC, BorderLayout.CENTER);
        cp.add(jpnR, BorderLayout.EAST);
        jpnL.add(jspL);
        jpnR.add(jspR);
        jpnC.add(jlb);
        jpnC.add(jcb);
        jpnC.add(jlbpw);
        jpnC.add(jtf);
        jpnC.add(jrb1);
        jpnC.add(jrb2);
        jpnC.add(jbtRN);
        jpnC.add(jbtCL);
        buttonGroup.add(jrb1);
        buttonGroup.add(jrb2);
        jbtRN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jbtCL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame2 frm2 = new Frame2();
                frm2.setVisible(true);
                Decrypt.this.dispose();
            }
        });
    }
}