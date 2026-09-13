public class Keyboard{
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

    public String getLanguageLayout() {
        return language_layouut;
    }
    public int getSize() {
        return size; 
    }
    public String getRegion() {
        return region;
    }
    public Material getMaterial() {
        return material;
    }
    public boolean isCableIncluded() {
        return is_cable_included;
    }
    public boolean isWireless() {
        return is_wireless;
    }
    public String getAdditionalLanguageLayout() {
        return adtional_language_layout;
    }
    public boolean isBacklight() {
        return is_backlight;
    }
    public boolean hasScreen() {
        return screen;
    }
    public boolean hasAdditionalFeatures() {
        return addtional_features;
    }
    
    // ---------------------------------------------------------------------------------------------------

    public void setLanguageLayout(String language_layouut) {
        this.language_layouut = language_layouut;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public void setCableIncluded(boolean is_cable_included) {
        this.is_cable_included = is_cable_included;
    }
    public void setWireless(boolean is_wireless) {
        this.is_wireless = is_wireless;
    }
    public void setAdditionalLanguageLayout(String adtional_language_layout) {
        this.adtional_language_layout = adtional_language_layout;
    }
    public void setBacklight(boolean is_backlight) {
        this.is_backlight = is_backlight;
    }
    public void setScreen(boolean screen) {
        this.screen = screen;
    }
    public void setAdditionalFeatures(boolean addtional_features) {
        this.addtional_features = addtional_features;
    }
}