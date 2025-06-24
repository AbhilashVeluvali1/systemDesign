package observerPattern.textEditor;

public abstract class TextEditorDecorator implements TextEditor {
    TextEditor textEditor;
    public TextEditorDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
}
