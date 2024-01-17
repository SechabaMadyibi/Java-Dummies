/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dmtshoeni
 */
// This class creates a Greeter object →1
// that displays a hello message on
// the console.
//in a dialog box
import javax.swing.JOptionPane;
public class Greeter {

    public void sayHello() {
        System.out.println("Hello, World!");
    }
    
     public void sayHello2() {
        JOptionPane.showMessageDialog(null, 
 "Hello, World!", "Greeter",
 JOptionPane.INFORMATION_MESSAGE);
    }
}
