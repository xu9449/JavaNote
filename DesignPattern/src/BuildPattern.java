public class BuildPattern {

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    public BuildPattern(String hdd, String ram) {
        this.HDD = hdd; this.RAM = ram;
    }

    public BuildPattern setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        return this;
    }
    public BuildPattern setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}
