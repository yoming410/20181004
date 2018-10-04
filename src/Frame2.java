import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Frame2 extends JFrame{
    private Container cp;
    private JMenuBar jmb = new JMenuBar();
    private JMenu JmF1 = new JMenu("file");
    private JMenu JmF2 = new JMenu("Tool");
    private JMenu JmF3= new JMenu("Game");
    private JMenu JmF4 = new JMenu("Exit");
    private JMenuItem jmuopen = new JMenuItem("open");
    private JMenuItem jmuclose= new JMenuItem("close");
    private JMenuItem jmExit = new JMenuItem("Exit");
    private JMenuItem jmioxgame = new JMenuItem("oxgame");

    public Frame2(){
        init();
    }
    private void init(){
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        this.setJMenuBar(jmb);
        jmb.add(JmF1);
        jmb.add(JmF2);
        jmb.add(JmF3);
        jmb.add(JmF4);
        jmb.add(jmuopen);
        jmb.add(jmuclose);
        jmb.add(jmExit);
        JmF3.add(jmioxgame);
        jmExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jmioxgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                oxgame Oxgame = new oxgame();
                Oxgame.setVisible(true);
                Frame2.this.setVisible(false);
            }
        });


    }
}