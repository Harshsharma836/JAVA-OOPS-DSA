class SmartPhone{
    public void IamSmartPhone(){
        System.out.println("I am a smartphone");
    }
}

interface IClickPhoto{
       public void clickingPhoto();
}

interface IplayRadio{
    public void playingRadio();
}

class phone extends SmartPhone implements IClickPhoto , IplayRadio{
    public void clickingPhoto(){
        System.out.println("Clicking The Photo");
    }

    public void playingRadio(){
        System.out.println("Radio is on");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        phone newPhone = new phone();
        newPhone.clickingPhoto();
        newPhone.playingRadio();
    }
}
