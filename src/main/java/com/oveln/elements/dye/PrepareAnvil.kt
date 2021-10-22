package com.oveln.elements.dye

import com.oveln.elements.utils.Colorful.colorful
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.inventory.PrepareAnvilEvent
import org.bukkit.inventory.AnvilInventory

class PrepareAnvil: Listener {
    @EventHandler
    fun onListened(event: PrepareAnvilEvent) {
        val inv = event.inventory
        if (inv.getItem(0) == null || inv.getItem(1) == null) return
        if (Dye.Dyes.containsKey(inv.getItem(1)!!.type)) {
            val result = inv.getItem(0)!!.clone()
            val meta = result.itemMeta!!
            val name = if (inv.renameText == "") "请改成不同于物品名的名字" else inv.renameText
            meta.setDisplayName("&${Dye.Dyes[inv.getItem(1)!!.type]}${name}".colorful())
            result.itemMeta = meta
            event.result = result
        }
    }
    @EventHandler
    fun onClick(event: InventoryClickEvent) {
        if (event.inventory !is AnvilInventory) return
        val inv = event.inventory
        if (inv.getItem(0) == null || inv.getItem(1) == null) return
        if (Dye.Dyes.containsKey(inv.getItem(1)!!.type) && event.slot == 2) {
            event.cursor = inv.getItem(2)
            inv.clear(0)
            inv.getItem(1)!!.amount = inv.getItem(1)!!.amount -1
        }
    }
}