class Device {

    String modelNo;

    String getModelNoDevice() {
        return this.modelNo;
    }

}

class Phone extends Device {

    String modelNo;

    Phone(String modelNo) {
        this.modelNo = modelNo;
        super.modelNo = modelNo+"DVD";
    }
    String getModelNoPhone() {       
        return this.modelNo;
    }

}

public class SuperKeywordForAttributes {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Phone iphone = new Phone("14Pro");
        
        System.out.println(iphone.getModelNoPhone());
        System.out.println(iphone.getModelNoDevice());
        
        System.out.println("\n");

    }

}