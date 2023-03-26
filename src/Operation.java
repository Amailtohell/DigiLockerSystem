import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Operation extends JFrame {
    public Operation(String username, int id) {
        super("Welcome " + username +".Select an Operation.");

        JPanel panel = new JPanel(new GridLayout(2, 1));
        JButton scanButton = new JButton("Scan a Document");
        JButton reportButton = new JButton("Verify Documents");
        panel.add(scanButton);
        panel.add(reportButton);

        scanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select an image file");
                fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "png", "gif"));

                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    new Display(selectedFile.getPath());

                }
            }
        });


        reportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Verification will be implemented here internally.");
            }
        });

        getContentPane().add(panel);
        getContentPane().add(panel);
        setSize(600, 300);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int xPos = (screenSize.width ) / 2;
        int yPos = (screenSize.height ) / 2;
        setLocation(xPos, yPos);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
