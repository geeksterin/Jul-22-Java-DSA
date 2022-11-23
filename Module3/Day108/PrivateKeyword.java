/* 

This is how JAVA must be calling main() function!!!

Static.main();

*/

// public class Collections {

//     private class HashMap {

        

//     }

// }

// Hashmap hm = new ...



public class PrivateKeyword {

    public static class Phone {

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

    public static class Human {

        Phone phone;
        String name;

        Human( String name, String phoneModel ) {
            this.phone = new Phone(phoneModel);
            this.name = name;
        }

        void setPhoneModel(String newModelNo) {
            // phone.modelNo = newModelNo;
            phone.setModelNo(newModelNo);
        }

    }

    public static void main(String[] args) {

        System.out.println("\n");
        
        // Phone iPhone = new Phone("14 Pro");
        
        Human shubh = new Human("Shubh", "14 Pro");

        System.out.println("Old phone: " + shubh.phone.getModelNo());

        shubh.setPhoneModel("14 Pro Max"); 

        System.out.println("New phone: " + shubh.phone.getModelNo());
    
        System.out.println("\n");

    }

}