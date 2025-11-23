package level3ex1.model;

import level3ex1.interfaces.Phone;

public class Generic {

    public <T extends Phone> void executePhoneMethods(T phoneObject){
        phoneObject.call();
    }

    public  <T extends Smartphone> void executeSmartphoneMethods(T smartphoneObject){
        smartphoneObject.call();
        smartphoneObject.takePhoto();
    }
}
