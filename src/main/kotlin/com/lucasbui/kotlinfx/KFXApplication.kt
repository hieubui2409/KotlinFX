package com.lucasbui.kotlinfx

import com.lucasbui.kotlinfx.views.screens.SplashView
import tornadofx.App
import tornadofx.launch

class KFXApplication : App(SplashView::class) {}

fun main(args: Array<String>) {
    launch<KFXApplication>(args)
}