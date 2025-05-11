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



## Layout Manager
- a layout manager is a class that determines how components are aranged in a container/window.
- setLayout() method is used to set the layout
- some of the layout managers are FLowLoyout, BorderLayout, FrdLayout etc which are defined inder java.awt

### FlowLayout()

**FLowLayout()**
- it arrranges componentes left to right and top to bottom in a frame/ window

#### its constructor are
- 5 px horx and 5px vert gab between components
- center aligned

**FlowLayout(int how)**
  - 5px horz and 5px vert ga between components
  - alignment can be controlled bt passing FlowLayout.LEFT , FLowLayout.RIGHT or FlowLayout.CENTER for "int how"

**FlowLayout(int how, int horz, int vert)**
- horz and ver gap can be controlled
- alignment can be controlled
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
## Border Layout
- it arranges components into 5 regions- north, south, west, est and center
- if north or south components are missimng, wast west center components are expaneded vertically to fill up the space
- if east or west components are missing, the space is left blank

its constructor are:
- BorderLayout()
- BorderLayout(int horz, int vert)


## GridLayout
- it divides the container/frame into a matrix of rows and columns and places the components into the grid formed
- components are add left to right and top to bottom

size of every components are
- GridLayout() - creates infinite number of coulmns
- GridLayout(int ows, int cols) - create specified no of rows and columns
- GridLayout(int rows, int cols, int horx, int vert) - creates specified no f orows and column with specied horz and vert gap


## Event handling 
- it is a process of doing something when user ineracts with the ui components

  
### Event delegation Model
- an approach to handle events in java . it is based on those concepts -Event source, event and event listener

#### Event source
- is an object that generates an event, button is event source if it is clicked

#### Event
- An event is an object that describes a state change in a source, eg. ActionEvent, ItemEvent, KeyEvent etc

#### Event Listener
- A listener is an obect that is notified when an event occurs aadter egetting notified, it does the futrther processing. eg. ActionListener, ItemListeeer , KeyListener.

  > Note: Every event source must be registered to the event listener,

## Q1: event handling
```
// create a swing gui with a button, when button is clicked, display "you clicked"
import javax.swing.*; // for GUI Components

import java.awt.FlowLayout;
import java.awt.event.*; 

public class EventHandling implements ActionListener{
    JFrame jf;
    JButton button1;
    EventHandling(){
        jf = new JFrame("blablabla");
        jf.setSize(400,350);
    
        button1 = new JButton("dont click me");
        button1.setBounds(100,160, 50, 40);
    
        button1.addActionListener(this);
    
        jf.setLayout(new FlowLayout());
        jf.add(button1);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
public static void main(String[] args) {
    
 EventHandling frm = new EventHandling();
}    

public void actionPerformed(ActionEvent e){
    JOptionPane.showMessageDialog(null, "dont CLICK ME");
    actionPerformed(e);
}
}

```
## Q2: add 2 btns, one to set etxt on text fied ither to clear the text
```
// create a swing gui with a button, when button is clicked, display "you clicked"
import javax.swing.*; // for GUI Components

import java.awt.FlowLayout;
import java.awt.event.*; 

public class Q2 implements ActionListener{
    JFrame jf;
    JButton btn1,btn2;
    JTextField t1;

    Q2(){
        jf = new JFrame("blablabla");
        jf.setSize(400,350);
    
        btn1 = new JButton("submit");
        btn1.setBounds(100,160, 50, 40);
        btn1.addActionListener(this);

        btn2 = new JButton("clear");
        btn2.setBounds(100,160, 50, 40);
        btn2.addActionListener(this);
        t1 = new JTextField(20);

        jf.add(btn1);
        jf.add(btn2);
        jf.add(t1);
    
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
public static void main(String[] args) {
    
 Q2 frm = new Q2();
}    

public void actionPerformed(ActionEvent e){
    // JOptionPane.showMessageDialog(null, "dont CLICK ME");
    // actionPerformed(e);
    if(e.getSource()==btn1){
        t1.setText("you clicked ok");
    }
    else if(e.getSource()==btn2){
        t1.setText(" ");
    }
}
}

```
### change buttons backgorunf color
```
// create a swing gui with a button, when button is clicked, display "you clicked"
import javax.swing.*; // for GUI Components

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*; 

public class Q1 implements ActionListener{
    JFrame jf;
    JButton btn1,btn2, btn3;
    JTextField t1;

    Q1(){
        jf = new JFrame("blablabla");
        jf.setSize(400,350);
    
        btn1 = new JButton("red");
        btn1.setBounds(100,160, 50, 40);
        btn1.addActionListener(this);

        btn2 = new JButton("blue");
        btn2.setBounds(100,160, 50, 40);
        btn2.addActionListener(this);

        btn3 = new JButton("green");
        btn3.setBounds(100,160, 50, 40);
        btn3.addActionListener(this);
        t1 = new JTextField(20);

        jf.add(btn1);
        jf.add(btn2);
       // jf.add(t1);
       jf.add(btn3);
    
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
public static void main(String[] args) {
    
 Q1 frm = new Q1();
}    

public void actionPerformed(ActionEvent e){
    // JOptionPane.showMessageDialog(null, "dont CLICK ME");
    // actionPerformed(e);
    
    if(e.getSource()==btn1){
       
        btn1.setBackground(Color.RED);
    }
    else if(e.getSource()==btn2){
        btn2.setBackground(Color.BLUE);

    }else if(e.getSource()==btn3){
        btn3.setBackground(Color.GREEN);

    }
}
}

```
### change background color
```
// create a swing gui with a button, when button is clicked, display "you clicked"
import javax.swing.*; // for GUI Components

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*; 

public class Q1 implements ActionListener{
    JFrame jf;
    JButton btn1,btn2, btn3;
    JTextField t1;

    Q1(){
        jf = new JFrame("blablabla");
        jf.setSize(400,350);
    
        btn1 = new JButton("red");
        btn1.setBounds(100,160, 50, 40);
        btn1.addActionListener(this);

        btn2 = new JButton("blue");
        btn2.setBounds(100,160, 50, 40);
        btn2.addActionListener(this);

        btn3 = new JButton("green");
        btn3.setBounds(100,160, 50, 40);
        btn3.addActionListener(this);
        t1 = new JTextField(20);

        jf.add(btn1);
        jf.add(btn2);
       // jf.add(t1);
       jf.add(btn3);
    
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
public static void main(String[] args) {
    
 Q1 frm = new Q1();
}    

public void actionPerformed(ActionEvent e){
    // JOptionPane.showMessageDialog(null, "dont CLICK ME");
    // actionPerformed(e);
    
    if(e.getSource()==btn1){
       
        jf.getContentPane().setBackground(Color.RED);
    }
    else if(e.getSource()==btn2){
        jf.getContentPane().setBackground(Color.BLUE);

    }else if(e.getSource()==btn3){
        jf.getContentPane().setBackground(Color.GREEN);

    }
}
}

```

#### Q4 check if num is odd or even

```

    // create a swing gui with a button, when button is clicked, display "you clicked"
import javax.swing.*; // for GUI Components

import java.awt.FlowLayout;
import java.awt.event.*; 

public class Q3 implements ActionListener{
    JFrame jf;
    JButton btn1;
    JTextField t1;

    Q3(){
        jf = new JFrame("blablabla");
        jf.setSize(400,350);
    
        btn1 = new JButton("submit");
        btn1.setBounds(100,160, 50, 40);
        btn1.addActionListener(this);

        t1 = new JTextField(20);

        jf.add(btn1);
        jf.add(t1);
    
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
public static void main(String[] args) {
    
 Q3 frm = new Q3();
}    

public void actionPerformed(ActionEvent e){

    int a = Integer.parseInt(t1.getText());
    if(a%2==0){
        JOptionPane.showMessageDialog(null, "Even");
    }else{
        JOptionPane.showMessageDialog(null, "Odd");

    }
}
}
```

### Q5 GUI Calculator
```

    // create a swing gui with a button, when button is clicked, display "you clicked"
    import javax.swing.*; // for GUI Components

    import java.awt.FlowLayout;
    import java.awt.event.*; 
    
    public class Q4 implements ActionListener{
        JFrame jf;
        JButton add, sub, div, mul, reset;
        JTextField input1, input2, result;
    
        Q4(){
            jf = new JFrame("blablabla");
            jf.setSize(400,350);
        
            add = new JButton("add");
            add.setBounds(100,160, 50, 40);
            add.addActionListener(this);

            sub = new JButton("subtract");
            sub.setBounds(100,160, 50, 40);
            sub.addActionListener(this);

            div = new JButton("divide");
            div.setBounds(100,160, 50, 40);
            div.addActionListener(this);

            mul = new JButton("multiply");
            mul.setBounds(100,160, 50, 40);
            mul.addActionListener(this);

            reset = new JButton("reset");
            reset.setBounds(100,160, 50, 40);
            reset.addActionListener(this);
    
            input1 = new JTextField(20);
            input2 = new JTextField(20);
            result = new JTextField(20);
            result.setEditable(false);
    
            jf.add(add);
            jf.add(sub);
            jf.add(div);
            jf.add(mul);
            // jf.add(reset);
            jf.add(input1);
            jf.add(input2);
            jf.add(result);
        
            jf.setLayout(new FlowLayout());
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setVisible(true);
        }
    public static void main(String[] args) {
        
     Q4 frm = new Q4();
    }    
    
    public void actionPerformed(ActionEvent e){
    int a = Integer.parseInt(input1.getText());
    int b = Integer.parseInt(input2.getText());
    if(e.getSource()==add){
        int c=a+b;
        result.setText(c+" ");
    }else if(e.getSource()==sub){
        int c=a-b;
        result.setText(c+" ");
    }else if(e.getSource()==mul){
        int c=a*b;
        result.setText(c+" ");
    }else if(e.getSource()==div){
        int c=a/b;
        result.setText(c+" ");
    }else if(e.getSource()==reset){
        input1.setText(" ");
        input1.setText(" ");

        result.setText(" ");
    }


        
    }
    }

```

## Handling MouseEvent
- when user interacts on a UI component using a mouse, MouseEvent occurs
- MouseListener is udused to handle MouseEvent
- MouseListner contains 4 abstarct methods
  - public void mousePressed(MouseEvent e)
  - public void mouseReleased(MouseEvent e)
  - public void mouseClicked(MouseEvent e)
  - public void mouseEntered(MouseEvent e) //hovering
  - public void mouseExited(MouseEvent e) //un-hover/ de-hover
 
> Note: if we implement MouseListener we must override all 5 abstarct methods
> If we want to override only the required methods, we should use the adapter class (Mouse Adapter)

## Adapter Class
- An adapter class is an alternative of listener interface. it provides the default implemantation of all methods to defined inside the listener interface. Hence we can override onlt the required methods.
- Adapter class is provided for only the required methods
- Adapter class is provided for only three listeners that contain mre than 1 abstract methods



 ## add on pressing he add button and subtract on releasing the button
```

    // create a swing gui with a button, when button is clicked, display "you clicked"
    import javax.swing.*; // for GUI Components

    import java.awt.FlowLayout;
    import java.awt.event.*; 
    
    public class Mouselst extends MouseAdapter{
        JFrame jf;
        JButton add, sub, div, mul, reset;
        JTextField input1, input2, result;
    
        Mouselst(){
            jf = new JFrame("blablabla");
            jf.setSize(400,350);
        
            add = new JButton("add/sub");
            add.setBounds(100,160, 50, 40);
            add.addMouseListener(this);
    
            input1 = new JTextField(20);
            input2 = new JTextField(20);
            result = new JTextField(20);
            result.setEditable(false);
    
            jf.add(add);
            jf.add(input1);
            jf.add(input2);
            jf.add(result);

        
            jf.setLayout(new FlowLayout());
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setVisible(true);
        }
    public static void main(String[] args) {
        
     Mouselst frm = new Mouselst();
    }    
    
    public void mousePressed(MouseEvent e){
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());
        int c =a+b;
        result.setText(c+" ");
    }
    public void mouseReleased(MouseEvent e){
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());
        int c=a-b;
        result.setText(c+" ");
    }
    }
```
## Exploring Swing components
---
JCheckBox 
- it is used to create a checkbox , multiple selections can be done.
```
eg. JCheckBox c1,c2;
c1=  new JCheckBox("Music");
c1=  new JCheckBox("Dance");
```

JRadioButton
- it is used to create a radio button, only one item from group can be selected ,bubttn group calss is used for grouping the radio buttons.

```
JRadioButton r1,r2;
r1  =new JRadioButton("Male");
r2  =new JRadioButton("Female");
ButtonGroup bg = new ButtonGroup();
bg.add(r1);
bg.add(r1);

```
In order to know whether a radio button or checkbox is sleected or not, we suse isSelected() method that returns true/false


| JComboBOx | JList |
|----|----|
| it is udes to create a drop down list | it is sued to create a list box |
| only one item can be selected | multiple items can be selected |
| scrollbar is added automatically | scrollbar is added manually |
|  setMaximumRowCount(int) is used to specify the no. of items at a time  | setVisibleRowCount(int) is used to specify the no of items at a time  |
| both ActionEvent and ItemEvent occur when an item is selected | ListSelection Event occurs when an item is selected |
| getSelectedItem() , getSelectedIndex() returns selected items/ index | getSelectedValue(), getSelectedValueList(), getSelectedIndices() returns selected value/list/index |


JFrame
used to create a frame/window that contains title bar and 3 control buttons (close, maximmize and minimize). It is the main component because all other components are added inside it. The default layout of JFrame is BorderLayout







