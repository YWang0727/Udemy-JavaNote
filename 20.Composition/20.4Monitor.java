public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resolution nativeResolution;  //Resolution is a class

    public Monitor(String model, String manufacture, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x,int y,String colour){
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
