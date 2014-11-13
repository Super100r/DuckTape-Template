package com.NAME.testmodule;

import net.year4000.ducktape.bukkit.module.BukkitModule;
import net.year4000.ducktape.bukkit.module.ModuleListeners;
import net.year4000.ducktape.module.ModuleInfo;

@ModuleInfo(
    name = "TestModule",
    version = "1.0",
    description = "Test module description",
    authors = {"Year4000"}
)
@ModuleListeners({TestListener.class})
public class TestModule extends BukkitModule {
    private static TestModule instance;

    @Override
    public void load() {
        super.load();
        // Set the instance of this module
        instance = this;
    }

    @Override
    public void enable() {
        super.enable();

        // Register the command classes
        registerCommand(TestCommands.class);
    }

    @Override
    public void disable() {
        super.disable();
    }

    /** Get the instance of the module, throw RunTimeException if instance is null */
    public static TestModule get() {
        if (instance == null) {
            throw new RuntimeException("Test Module's instance is null this should not happen.");
        }

        return instance;
    }
}
