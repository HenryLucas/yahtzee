package org.superluigi.yahtzee.view

import javafx.scene.control.Button
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints

object RollButton {

    fun addToGrid(grid: GridPane) {

        val rollRow = RowConstraints()
        rollRow.percentHeight = 5.0

        grid.rowConstraints.add(rollRow)

        val rollButton = Button("ROLL!")

        GridPane.setColumnSpan(rollButton, 5)

        grid.add(rollButton, 0, 1)

    }
}

