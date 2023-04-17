package com.lucasbui.kotlinfx

import com.lucasbui.kotlinfx.views.InputView
import tornadofx.App
import tornadofx.launch

class KFXApplication : App(InputView::class) {}

fun main(args: Array<String>) {
    launch<KFXApplication>(args)
}