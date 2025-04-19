import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaludoGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Saludo Mundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Nombre: ");
        JTextField nameField = new JTextField(20);
        JButton greetButton = new JButton("Saludar");

        JLabel greetingLabel = new JLabel();

        greetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String greeting = "Hola, " + name + "!";
                greetingLabel.setText(greeting);
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(greetButton);
        frame.add(greetingLabel);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
