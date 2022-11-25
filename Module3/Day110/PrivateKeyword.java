class Phone {

    private String modelNo;

    Phone(String modelNo) {
        this.modelNo = modelNo;
    }

    String getModelNo() {
        return this.modelNo;
    }
    void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

}

public class PrivateKeyword {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Phone iphone = new Phone("14 Pro");

        // System.out.println("Model No:" + iphone.modelNo);
        System.out.println("Model No:" + iphone.getModelNo());

        System.out.println("\n");

    }

}