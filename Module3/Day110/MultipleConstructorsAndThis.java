class Phone {

    String phoneNumber;
    String modelNo;
    String uniqueID;

    Phone(String phoneNumber, String modelNo) {
        this(phoneNumber+"#"+modelNo); // Makes call to constructor at Line 14
        
        this.phoneNumber = phoneNumber;
        this.modelNo = modelNo;
    }

    Phone(String uniqueID) {
        this.uniqueID = uniqueID;
    }

}

public class MultipleConstructorsAndThis {

    public static void main(String[] args) {

        System.out.println("\n");

        Phone iphone = new Phone("90909090","14Pro");

        System.out.println("Phone No : "+iphone.phoneNumber);
        System.out.println("Model No : "+iphone.modelNo);
        System.out.println("Unique ID: "+iphone.uniqueID);

        System.out.println("\n");

    }

}