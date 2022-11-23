/* 

This is how JAVA must be calling main() function!!!

Static.main();

*/

public class Static {

    public static class Phone {

        String modelNo;
        int count = 0;
        static int staticCount = 0;

        Phone(String modelNo) {
            this.modelNo = modelNo;
            this.count++;
            staticCount++;
        }

    }

    public static void main(String[] args) {

        Phone iPhone = new Phone("14 Pro");
        System.out.println("\n Count iPhone: "+iPhone.count);
        System.out.println(" Static Count iPhone: "+iPhone.staticCount); // DO NOT USE
        
        Phone nokia = new Phone("3310");
        System.out.println("\n Count Nokia: "+nokia.count);
        System.out.println(" Static Count Nokia: "+nokia.staticCount); // DO NOT USE
        
        Phone googlePixel = new Phone("Pixel8");
        System.out.println("\n Count Google Pixel: "+googlePixel.count);
        System.out.println(" Static Count Google Pixel: "+googlePixel.staticCount); // DO NOT USE

        System.out.println("\n [USE THIS] Static Count of Phone Class: "+Phone.staticCount);
        
        // YOU CANT DO THIS
        // System.out.println("\n [USE THIS] Static Count of Phone Class: "+Phone.modelNo);
        
        System.out.println("\n");

    }

}