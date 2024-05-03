import javax.swing.*;

public class gui {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age: "));
        JOptionPane.showMessageDialog(null, "You are " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height: "));
        JOptionPane.showMessageDialog(null, "You are " + height + "tall.");





    }
}
