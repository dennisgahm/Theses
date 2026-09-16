import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class TextDataApp extends JFrame {

    private final JTextArea textArea;
    private final Path dataFile;

    public TextDataApp() {
        setTitle("Data Editor");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Find the directory containing the JAR
        dataFile = getJarDirectory().resolve("data.txt");

        textArea = new JTextArea();
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> saveFile());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(saveButton, BorderLayout.SOUTH);

        loadFile();
    }

    private Path getJarDirectory() {
        try {
            Path location = Paths.get(
                TextDataApp.class
                    .getProtectionDomain()
                    .getCodeSource()
                    .getLocation()
                    .toURI()
            );

            if (Files.isDirectory(location)) {
                return location;
            }

            return location.getParent();

        } catch (URISyntaxException e) {
            return Paths.get(System.getProperty("user.dir"));
        }
    }

    private void loadFile() {
        try {
            if (Files.exists(dataFile)) {
                textArea.setText(
                    Files.readString(dataFile, StandardCharsets.UTF_8)
                );
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Could not open data.txt:\n" + e.getMessage()
            );
        }
    }

    private void saveFile() {
        try {
            Files.writeString(
                dataFile,
                textArea.getText(),
                StandardCharsets.UTF_8
            );

            JOptionPane.showMessageDialog(
                this,
                "Saved to:\n" + dataFile
            );

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Could not save data.txt:\n" + e.getMessage()
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TextDataApp().setVisible(true);
        });
    }
}