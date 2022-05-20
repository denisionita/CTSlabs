package ro.ase.cts.gr1085.Seminar10.Memento;

public class FileSnapshot {
    String content;
    String message;

    public FileSnapshot(String content, String message) {
        this.content = content;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FileSnapshot{" +
                "content='" + content + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
