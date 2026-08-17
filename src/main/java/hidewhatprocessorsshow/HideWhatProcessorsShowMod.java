package hidewhatprocessorsshow;

import mindustry.mod.Mod;

public class HideWhatProcessorsShowMod extends Mod {
    public HideWhatProcessorsShowMod() {
        ProcessorVisualController.registerKeybinds();
    }

    @Override
    public void init() {
        ProcessorVisualController.init();
    }
}
