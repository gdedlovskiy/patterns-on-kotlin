package ru.dgs.patterns.command

import javafx.event.Event
import javafx.event.EventHandler
import javafx.scene.Parent
import javafx.scene.control.TextArea
import tornadofx.*

class Editor : View("Editor") {
    private lateinit var textArea: TextArea
    private val history: CommandHistory = CommandHistory()

    override val root: Parent = group {
        vbox {
            textArea = textarea {
                minHeight = 100.0
            }
            hbox {
                button {
                    label("Copy")
                    onMouseClicked = handler { CopyCommand(this@Editor) }
                }
                button {
                    label("Cut")
                    onMouseClicked = withHistoryHandler { CutCommand(this@Editor) }
                }
                button {
                    label("Paste")
                    onMouseClicked = withHistoryHandler { PasteCommand(this@Editor) }
                }
                button {
                    label("Undo")
                    onMouseClicked = undoHandler()
                }
            }
        }
    }

    fun getTextArea(): TextArea {
        return textArea;
    }

    private fun handler(supplier: () -> ICommand): EventHandler<Event> {
        return EventHandler { event -> supplier().execute() }
    }

    private fun withHistoryHandler(supplier: () -> ICommand): EventHandler<Event> {
        return EventHandler { event ->
            val command = supplier()
            if (command.execute()) {
                history.add(command)
            }
        }
    }

    private fun undoHandler(): EventHandler<Event> {
        return EventHandler { event ->
            history.pollLast()?.undo()
        }
    }

}