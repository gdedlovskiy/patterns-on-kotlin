package ru.dgs.patterns.command

import tornadofx.putString


class CutCommand(var editor: Editor) : ICommand {
    private var backup: String? = null

    override fun execute(): Boolean {
        backup = editor.getTextArea().text
        val value = editor.getTextArea().selectedText
        if (value?.length ?: value.length > 0) {
            editor.clipboard.putString(value)
            removeSelectionText()
            return true
        }
        return false;
    }

    override fun undo(): Boolean {
        editor.getTextArea().text = backup
        return true;
    }

    private fun removeSelectionText() {
        val text = editor.getTextArea().text
        val selection = editor.getTextArea().selection
        editor.getTextArea().text = text.removeRange(selection.start, selection.end)
    }

}