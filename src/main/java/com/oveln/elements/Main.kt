package com.oveln.elements

import com.oveln.elements.dye.Dye
import com.oveln.elements.utils.Colorful.colorful
import com.oveln.elements.utils.Config
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    companion object {
        lateinit var Instance: Main
    }

    override fun onEnable() {
        Instance = this

        saveDefaultConfig()
        Config.load()

        if (Config.dye) Dye.onEnable()

        logger.info("&6${description.name}&f ${description.version}&2 启动成功   &c作者${description.authors}".colorful())
    }

    override fun onDisable() {
        logger.info("&6${description.name}&f ${description.version}&2 关闭成功   &c作者${description.authors}".colorful())
    }
}