# Creating GUI based aplication in java

- two methods
- swing
- AWT (Abstract Window Toolkit)

### Swing 
swing is a st e opf c;asses under  java.swing package that can be used to create GUI based java application

### AWT
AWT is a set of classes under java.awt package

| swing | awt |
| ------ | ------- |
| swin g components donot use native resources in order to render them visually | AWT use native resources in order to render them visually |
| swing is platform independent | awt is platform dependent |
| swing componments are light weight compionents | awt copmomponents are heavyy weight components|
| swing is derived from awt | awt is base for swing |
| swing has more components | awt has less compoinents than swing |


```
import javax.swing.*; // for GUI Components
import java.awt.event.*; // for event handling
//creating a window
JFrame appWindow = new JFrame("Gui App in java")


            


        frame.setSize(350,  250); //setting window size
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ecit on closing the app
        frame.setVisible(true); // visibility
        frame.setResizable(false); 
    }
```
