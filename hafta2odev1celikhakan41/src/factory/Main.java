package factory;

public class Main {
    public static void main(String[] args) {

        Apple phone=new Apple();
        phone.appleInfo("Iphone 6s","41HKN41","987GG",16000,4.7);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Samsung samsung=new Samsung();
        samsung.samsungInfo("Samsung S8+","27HKN27","HGH455",640000,6.3);

    }
}
