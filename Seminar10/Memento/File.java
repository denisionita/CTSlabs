package ro.ase.cts.gr1085.Seminar10.Memento;

public class File {
    String content;
    private String name;

    public File(String content, String name) {
        this.content = content;
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public FileSnapshot createSnapshot(String m){
        return new FileSnapshot(this.content,m);
    }

    public void restoreFileContent(FileSnapshot fileSnapshot){
        if(fileSnapshot!=null)
            this.content = fileSnapshot.getContent();
    }
    public void print(){
        System.out.println("File, name: " + name + ", content: " + content);
    }
}
