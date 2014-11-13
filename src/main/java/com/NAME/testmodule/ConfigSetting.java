package com.NAME.testmodule;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.year4000.utilities.MessageUtil;
import net.year4000.utilities.config.Comment;
import net.year4000.utilities.config.Config;
import net.year4000.utilities.config.InvalidConfigurationException;

import java.io.File;

@Data
@EqualsAndHashCode(callSuper = false)
public class ConfigSetting extends Config {
    private static ConfigSetting inst;

    public ConfigSetting() {
        try {
            CONFIG_HEADER = new String[] {"Chat Configuration"};
            CONFIG_FILE = new File(TestModule.get().getDataFolder(), "config.yml");
            init();
        } catch (InvalidConfigurationException e) {
            TestModule.log(e, true);
        }
    }

    /** Return its self if has not been created before */
    public static ConfigSetting get() {
        if (inst == null) {
            inst = new ConfigSetting();
        }

        return inst;
    }

    @Comment("This is a comment for the setting")
    private String name = "Default String Setting";

    /** Return the name with colors */
    public String getName() {
        return MessageUtil.replaceColors(name);
    }
}
