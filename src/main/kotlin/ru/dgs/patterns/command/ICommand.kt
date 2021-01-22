package ru.dgs.patterns.command

/**
 * Команда
 */
interface ICommand {

    /**
     * Выполнение
     */
    fun execute(): Boolean;

    /**
     * Откат
     */
    fun undo(): Boolean;

}