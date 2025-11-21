package level3ex1;

public class Generic {

    public <T extends Phone> void executePhoneMethods(T phoneObject){
        phoneObject.call();
    }

    public  <T extends Smartphone> void executeSmartphoneMethods(T smartphoneObject){
        smartphoneObject.call();
        smartphoneObject.takePhoto();
    }
}
