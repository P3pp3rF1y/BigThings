package com.p3pp3rf1y.bigthings.client.gui;

import com.p3pp3rf1y.bigthings.handler.ConfigurationHandler;
import com.p3pp3rf1y.bigthings.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by jjanecek on 8/29/2014.
 */
public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                ModGuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
