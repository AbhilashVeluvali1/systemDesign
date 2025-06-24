package observerPattern.textEditor;

public class PlaintextEditor implements TextEditor {
    public String content;

    public PlaintextEditor(String content) {
        this.content = content;
    }

    @Override
    public String renderText() {
        return content;
    }
}
