package ru.dgs.patterns.command

import java.util.*

class CommandHistory {
    private val maxSize = 5;
    private val history: Deque<ICommand> = ArrayDeque()

    fun add(command: ICommand) {
        if (history.size >= maxSize) {
            history.removeFirst()
        }
        history.add(command)
    }

    fun pollLast(): ICommand? {
        return history.pollLast()
    }

    fun remove(command: ICommand): Boolean {
        return history.remove(command)
    }
}
