package com.lucasbui.kotlinfx.views.screens

import tornadofx.View
import tornadofx.borderpane
import tornadofx.label

class MasterView: View() {
    // explicit DI
    private val topView = find(TopView::class)
    // implicit DI, lazy loading
    private val bottomView: BottomView by inject()

    override val root = borderpane{
        top = topView.root
        bottom = bottomView.root
//        top<TopView>()
//        bottom<BottomView>()
    }

    class TopView : View() {
        override val root = label("Top View")
    }

    class BottomView : View() {
        override val root = label("Bottom View")

    }
}

