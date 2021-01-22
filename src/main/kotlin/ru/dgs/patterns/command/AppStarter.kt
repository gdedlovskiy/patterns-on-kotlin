package ru.dgs.patterns.command

import javafx.application.Application
import javafx.stage.Stage
import tornadofx.App

fun main(args: Array<String>) {
    Application.launch(AppEditor::class.java, *args)
}

class AppEditor : App(Editor::class) {
    override fun start(stage: Stage) {
        stage.minWidth = 400.0
        stage.minHeight = 400.0
        super.start(stage)
    }


}
