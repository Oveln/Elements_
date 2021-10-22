package com.oveln.elements.utils

import com.oveln.elements.Main

object Config {
    var dye = true
    fun load() {
        val config = Main.Instance.config
        dye =config.getBoolean("dye")
    }
}