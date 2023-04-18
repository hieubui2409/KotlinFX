package com.lucasbui.kotlinfx.views.screens

import com.lucasbui.kotlinfx.controllers.InputController
import com.lucasbui.kotlinfx.views.fragments.FormFragment
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class InputView : View() {
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
                            input.value = ""
                        }
                    }
                    button("Undo") {
                        action {
                            controller.removeLast()
                        }
                    }
                }
            }
            hbox {
                buttonbar {
                    button("Open Modal") {
                        action {
                            find<FormFragment>().openModal()
                        }
                    }
                    button("Open Internal") {
                        action {
                            openInternalWindow(
                                view = FormFragment::class,
                            )
                        }
                    }
                    button("Open Window") {
                        action {
                            find<FormFragment>().openWindow()
                        }
                    }
                    button("Change View") {
                        action {
                            replaceWith(
                                find<FormFragment>(mapOf(FormFragment::value to input.value)),
                                ViewTransition.Slide(0.3.seconds, ViewTransition.Direction.LEFT),
                            )
                        }
                    }
                }
            }
            label("Items")
            listview(controller.values)
        }
    }
}