import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DiaryFrame extends JFrame {

    private JTextArea textArea;
    private JTextField titleField;

    public DiaryFrame() {

        setTitle("Digital Diary");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        titleField = new JTextField(20);
        textArea = new JTextArea();

        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton saveButton = new JButton("Save");
        JButton loadButton = new JButton("Load");
        JButton deleteButton = new JButton("Delete");
        JButton clearButton = new JButton("Clear");

        saveButton.addActionListener((ActionEvent e) -> saveNote());
        loadButton.addActionListener((ActionEvent e) -> loadNote());
        deleteButton.addActionListener((ActionEvent e) -> deleteNote());
        clearButton.addActionListener((ActionEvent e) -> clearFields());

        JPanel topPanel = new JPanel();

        topPanel.add(new JLabel("Note Title:"));
        topPanel.add(titleField);

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void saveNote() {
        try {
            String title = titleField.getText();
            String content = textArea.getText();

            Note note = new Note(title, content);

            FileManager.saveNote(note);

            JOptionPane.showMessageDialog(this, "Note Saved!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Saving Note");
        }
    }

    private void loadNote() {
        try {
            String title = titleField.getText();

            Note note = FileManager.loadNote(title);

            textArea.setText(note.getContent());

            JOptionPane.showMessageDialog(this, "Note Loaded!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Loading Note");
        }
    }

    private void deleteNote() {
        try {
            String title = titleField.getText();

            FileManager.deleteNote(title);

            textArea.setText("");

            JOptionPane.showMessageDialog(this, "Note Deleted!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Deleting Note");
        }
    }

    private void clearFields() {
        titleField.setText("");
        textArea.setText("");
    }
}