# MDI APPILICATION
> Multiple Document Interface
- an MDI application is such application that contains one parent window (JFrame) and all other child windows (JInternalFrame)
- JInternalFrame is used to create child frame and i can be opened in a special container called JDesktopPane
- Default Layout of JInternalFrame is BorderLayout and in order to show the close button, setClosable( true) should be called

```

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MDI_APP implements ActionListener{
    JFrame jf;
    JMenuBar mb;
    JMenu menu1;
    JDesktopPane dp;
    JMenuItem mi1;

    MDI_APP(){
        jf = new JFrame("Multiple Document Interface App");
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BorderLayout());
        mb = new JMenuBar();
        menu1 = new JMenu("file");
        mi1 = new JMenuItem("new");

        menu1.add(mi1);
        mb.add(menu1);
        jf.setJMenuBar(mb);

        dp = new JDesktopPane();
        jf.add(dp);
        mi1.addActionListener(this);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        MDI_APP ob = new MDI_APP();
    }

 public void actionPerformed (ActionEvent e){
     JInternalFrame jif = new JInternalFrame();
     jif.setSize(300,300);
     jif.setClosable(true);
     dp.add(jif);
     jif.setVisible(true);
 }
}

```
