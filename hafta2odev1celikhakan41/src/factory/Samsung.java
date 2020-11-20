package factory;

import interfacee.BehavioursApple;
import interfacee.BehavioursSamsung;

public  class Samsung extends Phone implements BehavioursSamsung {


    @Override
    public void call() {
        System.out.println("Arama yapılıyor... Samsung !");
    }

    @Override
    public void sendSms() {
        System.out.println("SMS gönderiliyor... Samsung !");
    }

    @Override
    public void fileSharing() {
        System.out.println("Dosya paylaşımı mevcut");
    }

    @Override
    public void listenToMp3() {
        System.out.println("MP3 müzik dinleme şansı var");

    }

    @Override
    public void keyboardInfo() {
        System.out.println("Tuşlu klavye var");

    }

    public void samsungInfo(String modelName,String imeiNo,String versionNo,double memoryCapacity,double screenSize){
        System.out.println("Model No: "+modelName);
        System.out.println("IMEI No: "+imeiNo);
        System.out.println("Versiyon No: "+versionNo);
        System.out.println("Bellek Kapasitesi : "+memoryCapacity);
        System.out.println("Ekran Boyutu : "+screenSize);
        call();
        sendSms();
        fileSharing();
        listenToMp3();
        keyboardInfo();
    }
}
