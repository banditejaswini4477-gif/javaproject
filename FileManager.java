import java.io.*;

public class FileManager {

    private static final String FOLDER = "notes/";

    public static void saveNote(Note note) throws IOException {

        File folder = new File(FOLDER);

        if (!folder.exists()) {
            folder.mkdir();
        }

        FileWriter writer = new FileWriter(FOLDER + note.getTitle() + ".txt");

        writer.write(note.getContent());

        writer.close();
    }

    public static Note loadNote(String title) throws IOException {

        BufferedReader reader = new BufferedReader(
                new FileReader(FOLDER + title + ".txt"));

        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();

        return new Note(title, content.toString());
    }

    public static void deleteNote(String title) {

        File file = new File(FOLDER + title + ".txt");

        if (file.exists()) {
            file.delete();
        }
    }
}