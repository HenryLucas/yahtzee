package org.superluigi.yahtzee.view

import javafx.scene.control.Button
import javafx.scene.layout.ColumnConstraints
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints

object Dice {

    fun addToGrid(grid: GridPane) {

        val dieColumn = ColumnConstraints()
        dieColumn.percentWidth = 10.0

        val diceRow = RowConstraints()
        diceRow.percentHeight = 15.0

        for (i in 1..10) {

            grid.columnConstraints.add(dieColumn)

        }

        grid.rowConstraints.add(diceRow)

        val dice = Array(5, { Button() })

        dice.forEachIndexed { index, die ->

            grid.add(die, index * 2, 0)

            GridPane.setColumnSpan(die, 2)

        }

    }
}

