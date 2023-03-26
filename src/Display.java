import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Display extends JFrame implements ActionListener {
    private JButton reportButton, docButton, leadButton;
    private JLabel imageLabel;
    private String imagePath;

    public Display(String imagePath) {
        this.imagePath = imagePath;

        setTitle("Display");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int xPos = (screenSize.width ) / 2;
        int yPos = (screenSize.height ) / 2;
        setLocation(xPos, yPos);

        reportButton = new JButton("Display Report");
        docButton = new JButton("Display Documents");
        leadButton = new JButton("Generate Leads");
        imageLabel = new JLabel();

        reportButton.addActionListener(this);
        docButton.addActionListener(this);
        leadButton.addActionListener(this);

        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(reportButton);
        buttonPanel.add(docButton);
        buttonPanel.add(leadButton);
        add(buttonPanel, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void displayReport() {
        JOptionPane.showMessageDialog(this, "Displaying report...");
    }

    public void displayDocument() {
        ImageIcon icon = new ImageIcon(imagePath);
        imageLabel.setIcon(icon);
    }

    public void generateLeads() {
        JOptionPane.showMessageDialog(this, "Generating leads...");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reportButton) {
            displayReport();
        } else if (e.getSource() == docButton) {
            displayDocument();
        } else if (e.getSource() == leadButton) {
            generateLeads();
        }
    }
}
