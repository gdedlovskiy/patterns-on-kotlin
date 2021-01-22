package ru.dgs.patterns.command

import tornadofx.putString


class CopyCommand(var editor: Editor) : ICommand {

    override fun execute(): Boolean {
        editor.clipboard.putString(editor.getTextArea().selectedText)
        return true;
    }

    override fun undo(): Boolean {
        return true;
    }

}