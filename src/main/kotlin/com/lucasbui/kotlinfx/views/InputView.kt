package com.lucasbui.kotlinfx.views

import com.lucasbui.kotlinfx.controllers.InputController
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class InputView: View() {
    private val controller: InputController by inject()
    private val input = SimpleStringProperty()
    override val root = form {
        fieldset {
            hbox {
                alignment = Pos.CENTER_LEFT
                field("Input") {
                    textfield(input)
                }
                buttonbar {
                    button("Commit") {
                        action {
                            input.value = input.value ?: ""
                            controller.writeToStdOut(input.value!!)
                            controller.addToList(input.value!!)
                        }
                    }
                    button("Undo") {
                        action {
                            controller.removeLast()
                        }
                    }
                }
            }
            label("Items")
            listview(controller.values)
        }
    }
}