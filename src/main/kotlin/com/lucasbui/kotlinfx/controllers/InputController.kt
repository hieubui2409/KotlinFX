package com.lucasbui.kotlinfx.controllers

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.Controller

class InputController: Controller() {
    val values: ObservableList<String> = FXCollections.observableArrayList("Init")
    fun writeToStdOut(value: String) = println(if (value.isNotEmpty()) "Writing $value to std out" else "Empty input")
    fun addToList(value: String) = if (value.isNotEmpty()) values.add(value) else false
    fun removeLast(): String = if (values.isNotEmpty()) values.removeLast() else ""
}