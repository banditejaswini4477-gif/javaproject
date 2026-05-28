import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class LoginFrame extends JFrame {

    private final String PASSWORD = "1234";

    public LoginFrame() {

        setTitle("Digital Diary Login");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(30, 30, 30));

        // Top Title
        JLabel title = new JLabel("DIGITAL DIARY", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        title.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        // Center Panel
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(new Color(30, 30, 30));

        GridBagConstraints gbc = new GridBagConstraints();

        JLabel passwordLabel = new JLabel("Enter Password:");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16));

        JButton loginButton = new JButton("LOGIN");

        loginButton.setBackground(new Color(0, 120, 215));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));

        // Action Listener
        loginButton.addActionListener((ActionEvent e) -> {

            String password = new String(passwordField.getPassword());

            if (password.equals(PASSWORD)) {

                JOptionPane.showMessageDialog(this,
                        "Login Successful!");

                dispose();

                new DiaryFrame();

            } else {

                JOptionPane.showMessageDialog(this,
                        "Wrong Password!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // Add Components
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(passwordLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(loginButton, gbc);

        // Footer
        JLabel footer = new JLabel("Secure Notes Manager",
                SwingConstants.CENTER);

        footer.setForeground(Color.LIGHT_GRAY);

        // Add to Main Panel
        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(footer, BorderLayout.SOUTH);

        add(mainPanel);

        setVisible(true);
    }
}