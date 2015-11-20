package org.superluigi.yahtzee.view

import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints

object ScoreSheet {

    fun addToGrid(grid: GridPane) {

        val scoreSheetRow = RowConstraints()
        scoreSheetRow.percentHeight = 4.6875

        for (i in 1..16) {

            grid.rowConstraints.add(scoreSheetRow)

        }

        val userScoreSheetLabels = ScoreSheetLabels().labels

        userScoreSheetLabels.forEachIndexed { index, label ->

            grid.add(label, 0, index + 2)

            GridPane.setColumnSpan(label, 3)

        }

        val aiScoreSheetLabels = ScoreSheetLabels().labels

        aiScoreSheetLabels.forEachIndexed { index, label ->

            grid.add(label, 5, index + 2)

            GridPane.setColumnSpan(label, 3)

        }

    }
}

