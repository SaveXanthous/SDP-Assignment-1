public class Keyboard{
    private final String language_layouut;
    private final int size;
    private final String region; // ANSI, ISO, JIS, etc.
    private final Material material;

    private final boolean is_cable_included;
    private final boolean is_wireless;
    private final String adtional_language_layout;
    private final boolean is_backlight;
    private final boolean screen;
    private final boolean addtional_features;

    public Keyboard(Builder builder) {
        this.language_layouut = builder.language_layouut;
        this.size = builder.size;
        this.region = builder.region;
        this.material = builder.material;
        this.is_cable_included = builder.is_cable_included;
        this.is_wireless = builder.is_wireless;
        this.adtional_language_layout = builder.adtional_language_layout;
        this.is_backlight = builder.is_backlight;
        this.screen = builder.screen;
        this.addtional_features = builder.addtional_features;
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

    @Override 
    public String toString() {
            return "Keyboard.Builder{" +
                    "language_layouut='" + language_layouut + '\'' +
                    ", size=" + size +
                    ", region='" + region + '\'' +
                    ", material=" + material +
                    ", is_cable_included=" + is_cable_included +
                    ", is_wireless=" + is_wireless +
                    ", adtional_language_layout='" + adtional_language_layout + '\'' +
                    ", is_backlight=" + is_backlight +
                    ", screen=" + screen +
                    ", addtional_features=" + addtional_features +
                    '}';
        }


    public static class Builder {
        private String language_layouut;
        private int size;
        private String region;
        private Material material;
        private boolean is_cable_included;
        private boolean is_wireless;
        private String adtional_language_layout;
        private boolean is_backlight;
        private boolean screen;
        private boolean addtional_features;

        public Builder() {
        }

        public Builder setLanguageLayout(String language_layouut) {
            this.language_layouut = language_layouut;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = region;
            return this;
        }

        public Builder setMaterial(Material material) {
            this.material = material;
            return this;
        }

        public Builder setCableIncluded(boolean is_cable_included) {
            this.is_cable_included = is_cable_included;
            return this;
        }

        public Builder setWireless(boolean is_wireless) {
            this.is_wireless = is_wireless;
            return this;
        }

        public Builder setAdditionalLanguageLayout(String adtional_language_layout) {
            this.adtional_language_layout = adtional_language_layout;
            return this;
        }

        public Builder setBacklight(boolean is_backlight) {
            this.is_backlight = is_backlight;
            return this;
        }

        public Builder setScreen(boolean screen) {
            this.screen = screen;
            return this;
        }

        public Builder setAdditionalFeatures(boolean addtional_features) {
            this.addtional_features = addtional_features;
            return this;
        }

        public Keyboard build() {
            return new Keyboard(this);
        }
    }
}