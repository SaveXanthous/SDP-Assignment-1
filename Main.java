public class Main {
    public static void main(String[] args) {
        System.out.println("Java работает!");

        Keyboard keyboard = new Keyboard.Builder()
                .setLanguageLayout("QWERTY")
                .setSize(104)
                .setRegion("ANSI")
                .setMaterial(new Material("plastic", "black", 0.5, true))
                .setCableIncluded(true)
                .setWireless(false)
                .setAdditionalLanguageLayout("AZERTY")
                .setBacklight(true)
                .setScreen(false)
                .setAdditionalFeatures(true)
                .build();

        System.out.println(keyboard);
    }
}