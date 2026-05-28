public class NoteManager {

    public void createNote(String title, String content) {
        Note note = new Note(title, content);

        try {
            FileManager.saveNote(note);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}