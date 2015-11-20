package org.superluigi.yahtzee.view

import javafx.scene.control.Label
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints

object Dialog {

    fun addToGrid(grid: GridPane) {

        val dialogRow = RowConstraints()
        dialogRow.percentHeight = 5.0

        grid.rowConstraints.add(dialogRow)

        val dialogLabel = Label("YAHTZEE")

        grid.add(dialogLabel, 0, 18)

        GridPane.setColumnSpan(dialogLabel, 10)

    }
}

