package factory;

import interfacee.BehavioursApple;

public class Apple extends Phone implements BehavioursApple {


    @Override
    public void call() {
        System.out.println("Arama yapılıyor... Apple !");
    }

    @Override
    public void sendSms() {
        System.out.println("SMS gönderiliyor... Apple !");

    }

    @Override
    public void videoCallInfo() {
        System.out.println("Görüntülü görüşme var");

    }

    @Override
    public void screenSharingInfo() {
        System.out.println("Ekran paylaşımı var");
    }

    @Override
    public void keyboardInfo() {
        System.out.println("Dokunmatik klavye var");
    }

    public void appleInfo(String modelName,String imeiNo,String versionNo,double memoryCapacity,double screenSize){
        System.out.println("Model No: "+modelName);
        System.out.println("IMEI No: "+imeiNo);
        System.out.println("Versiyon No: "+versionNo);
        System.out.println("Bellek Kapasitesi : "+memoryCapacity);
        System.out.println("Ekran Boyutu : "+screenSize);
        call();
        sendSms();
        videoCallInfo();
        screenSharingInfo();
        keyboardInfo();
    }

}
