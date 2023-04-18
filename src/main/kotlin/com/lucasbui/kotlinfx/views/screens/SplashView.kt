package com.lucasbui.kotlinfx.views.screens

import tornadofx.*

class SplashView: View() {
    override val root = vbox {
        paddingAll = 20.0
        button("Press me") {
            action {
                close()
                find<InputView>().openWindow()
            }
        }
        label("Waiting")
    }
}