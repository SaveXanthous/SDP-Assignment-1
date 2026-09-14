public class Main {
    public static void main(String[] args) {
        System.out.println("Java работает!");
        Keyboard.Builder builder = new Keyboard.Builder();
        KeyboardDirector.constructOfficeKeyboard(builder);

        Keyboard keyboard = builder
            .setAdditionalLanguageLayout("fr")
            .setAdditionalFeatures(true)
            .build();

        System.out.println(keyboard);
    }
}