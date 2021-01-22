package ru.dgs.patterns.command

class PasteCommand(private var editor: Editor) : ICommand {

    private var backup: String? = null

    override fun execute(): Boolean {
        backup = editor.getTextArea().text
        editor.getTextArea().text = "${editor.getTextArea().text}${editor.clipboard.string}"
        return true
    }

    override fun undo(): Boolean {
        editor.getTextArea().text = backup;
        return true;
    }

}
