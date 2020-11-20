package factory;

public abstract class Phone {

    private String _modelName;
    private String _imeiNo;
    private String _versionNo;
    private double _memoryCapacity;
    private double _screenSize;

    public abstract void call();

    public abstract void sendSms();

}
