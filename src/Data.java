import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Data {

    public Data(String username, int id) {
        this.dataVerify(username, id);
    }

    public void dataVerify(String username, int id) {
        boolean isValid = false;
        String line = "";
        String csvSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Workspace\\Java_Projects\\DigiLockerSystem\\src\\user-details.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] userDetails = line.split(csvSplitBy);
                if (userDetails[0].equals(username) && userDetails[1].equals(new String(String.valueOf(id)))) {
                    isValid = true;
                    System.out.println(isValid);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Username Or ID Is Incorrect.");
            System.exit(0);
        }

        new Operation(username, id);
    }
}
