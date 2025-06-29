package observerPattern.textEditor;

public class BoldDecorator extends TextEditorDecorator {
    public BoldDecorator(TextEditor textEditor) {
        super(textEditor);
    }
    public String renderText(){
        return "<b>" + textEditor.renderText() + "</b>";
    }
}
