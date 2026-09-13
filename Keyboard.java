public class Keyboard() {
    private String language_layouut;
    private int size;
    private String region; // ANSI, ISO, JIS, etc.
    private Material material;

    private boolean is_cable_included;
    private boolean is_wireless;
    private String adtional_language_layout;
    private boolean is_backlight;
    private boolean screen;
    private boolean addtional_features;

    public Keyboard(String language_layouut, int size, String region, Material material, boolean is_cable_included, boolean is_wireless, String adtional_language_layout, boolean is_backlight, boolean screen, boolean addtional_features) {
        this.language_layouut = language_layouut;
        this.size = size;
        this.region = region;
        this.material = material;
        this.is_cable_included = is_cable_included;
        this.is_wireless = is_wireless;
        this.adtional_language_layout = adtional_language_layout;
        this.is_backlight = is_backlight;
        this.screen = screen;
        this.addtional_features = addtional_features;
    }
}