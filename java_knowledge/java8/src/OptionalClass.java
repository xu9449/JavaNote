import java.util.Optional;

public class OptionalClass {

    USB usb = new USB();
    Computer c = new Computer();
    SoundCard sd = new SoundCard();

    public static void main(String[] args) {
        OptionalClass s = new OptionalClass();
        USB usb = new USB();
        Computer example = new Computer();
        SoundCard sd2 = new SoundCard();
        sd2.setUsb(Optional.of(usb));
    }
}
class SoundCard{
    private Optional<USB> usb;

    public void setUsb(Optional<USB> usb) {
        this.usb = usb;
    }
}

class Computer{
    USB usb;
    SoundCard dc;

    public Computer(){

    }

    public Computer(USB usb, SoundCard dc) {
        this.usb = usb;
        this.dc = dc;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public void setDc(SoundCard dc) {
        this.dc = dc;
    }
}

class USB {
    Long usbVersion;

    public void setUsbVersion(Long usbVersion) {
        this.usbVersion = usbVersion;
    }
}
