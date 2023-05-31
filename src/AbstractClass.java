abstract class AdstractDemo{
    abstract void callMe();
}

class sub extends AdstractDemo{
    @Override
    void callMe() {
        System.out.println("Ssdsdfsf");
    }
}

public class AbstractClass extends sub{
    public static void main(String[] args) {
        sub s = new sub();
        s.callMe();
    }
}
