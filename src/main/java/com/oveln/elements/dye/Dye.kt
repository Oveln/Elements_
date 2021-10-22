package com.oveln.elements.dye

import com.oveln.elements.Main
import org.bukkit.Bukkit
import org.bukkit.Material

object Dye {
    val Dyes = mapOf(
        Pair(Material.BLACK_DYE , '0'),
        Pair(Material.BLUE_DYE , '1'),
        Pair(Material.GREEN_DYE, '2'),
        Pair(Material.LIGHT_BLUE_DYE , 'b'),
        Pair(Material.PURPLE_DYE , '5'),
        Pair(Material.LIGHT_GRAY_DYE , '7'),
        Pair(Material.GRAY_DYE , '8'),
        Pair(Material.YELLOW_DYE , 'e'),
        Pair(Material.CYAN_DYE , '3'),
        Pair(Material.PINK_DYE , 'd')
    )
    fun onEnable() {
        Bukkit.getPluginManager().run {
            registerEvents(PrepareAnvil() , Main.Instance)
        }
    }
}