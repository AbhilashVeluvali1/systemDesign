package observerPattern.textEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new PlaintextEditor("This is the sample Text");
        textEditor = new BoldDecorator(textEditor);
        System.out.println(textEditor.renderText());
    }
}
