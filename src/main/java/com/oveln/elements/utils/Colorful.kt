package com.oveln.elements.utils

object Colorful {
    fun String.colorful():String {
        return this.replace("&" , "§")
    }
}