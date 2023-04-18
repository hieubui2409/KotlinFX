package com.lucasbui.kotlinfx.views.fragments

import com.lucasbui.kotlinfx.views.screens.InputView
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class FormFragment : Fragment() {
    private val input = SimpleStringProperty()
    val value: String by param()

    init {
        input.value = value
    }

    override val root = form {
        fieldset {
            vbox {
                alignment = Pos.CENTER_LEFT
                field("Input") {
                    textarea(input)
                    buttonbar {
                        button("Feedback")
                        button("Back") {
                            action {
                                replaceWith(
                                    find<InputView>(),
                                    ViewTransition.Slide(0.3.seconds, ViewTransition.Direction.RIGHT),
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    override fun onDock() {
        println("Docking FormFragment: value is $value")
    }

    override fun onUndock() {
        println("Undocking FormFragment: value is $value")
    }
}