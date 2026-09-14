public class KeyboardDirector {
    public static void constructOfficeKeyboard(Keyboard.Builder builder) {
        builder
            .reset()
            .setLanguageLayout("en")
            .setSize(104)
            .setRegion("ANSI")
            .setMaterial(new Material("plastic", "black", 0.5, true))
            .setCableIncluded(true)
            .setWireless(false)
            .setBacklight(false)
            .setScreen(false);
    }
    public static void constructGamingKeyboard(Keyboard.Builder builder) {
        builder
            .reset()
            .setLanguageLayout("en")
            .setSize(104)
            .setRegion("ANSI")
            .setMaterial(new Material("plastic ABS", "black", 0.75, true))
            .setCableIncluded(true)
            .setWireless(true)
            .setBacklight(true)
            .setScreen(false);
    }
    public static void constructBeKeyboard(Keyboard.Builder builder) {
        builder
                .reset()
                .setLanguageLayout("en")
                .setSize(104)
                .setRegion("ANSI")
                .setMaterial(new Material("titan", "black", 0.5, true))
                .setCableIncluded(true)
                .setWireless(true)
                .setBacklight(true)
                .setScreen(true);
    }
}