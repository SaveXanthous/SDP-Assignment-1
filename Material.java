public class Material {
    private String type; // plastic, metal, wood, etc.
    private String color;
    private boolean is_recyclable;
    
    public Material(String type, String color, double weight, boolean is_recyclable) {
        this.type = type;
        this.color = color;
        this.is_recyclable = is_recyclable;
    }

    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public boolean isRecyclable() {
        return is_recyclable;
    }


    public void setType(String type) {
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRecyclable(boolean is_recyclable) {
        this.is_recyclable = is_recyclable;
    }
}