import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class User {
    private String username;
    private int id;

    JFrame frame;
    JLabel usernameLabel;
    JTextField usernameField;
    JLabel idLabel;
    JTextField idField;



    public User() {
        // Create the GUI window
        frame = new JFrame("User");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.BLUE);
        frame.setSize(600, 300);


        // Create the username label and text field
        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        // Create the ID label and text field
        idLabel = new JLabel("ID:");
        idField = new JTextField(5);

        this.description();
    }

    public void description() {
        // TODO: Implement this method

        // Create the submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            // Get the values from the text fields
            String username = usernameField.getText();
            int id = Integer.parseInt(idField.getText());

            // Pass the values to the Data class
            Data data = new Data(username, id);
        });

        // Create the panel and add the components
        JPanel panel = new JPanel();
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(submitButton);

        // Add the panel to the frame and show the window
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new User();
    }
}
