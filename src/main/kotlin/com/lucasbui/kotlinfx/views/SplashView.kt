package com.lucasbui.kotlinfx.views

import tornadofx.View
import tornadofx.button
import tornadofx.label
import tornadofx.vbox

class SplashView: View() {
    override val root = vbox {
        button("Press me")
        label("Waiting")
    }
}