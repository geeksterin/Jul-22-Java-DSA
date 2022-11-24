import java.util.*;

public class Inheritance {
    
    public static class Computer {

        String os, processor;
        int noOfCores;
        String state;
        
        Computer() {
            this.state = "OFF";
        }

        public boolean boot() {
            if ( this.state.equals("OFF") ) {
                this.state = "ON";
                return true;
            } else {
                return false;    
            }
        }
        public boolean shutdown() {
            if ( this.state.equals("ON") ) {
                this.state = "OFF";
                return true;
            } else {
                return false;    
            }
        }

    }

    public static class Desktop extends Computer {

        String monitor, mouse, keyboard;
        ArrayList<String> externalDrives;

        Desktop() {
            this.externalDrives = new ArrayList<String>();
        }

        public boolean insertDrive(String driveName) {
            this.externalDrives.add(driveName);
            return true;
        }

    }

    public static void main(String[] args) {

        Computer computer = new Computer();
        Desktop desktop = new Desktop();

        System.out.println("Computer Before Boot: "+computer.state);
        computer.boot();
        System.out.println("Computer After  Boot: "+computer.state);


        System.out.println("Desktop Before Boot: "+desktop.state);
        desktop.boot();
        System.out.println("Desktop After  Boot: "+desktop.state);


        System.out.println("Desktop Drives Before: "+desktop.externalDrives);
        desktop.insertDrive("USB_A");
        System.out.println("Desktop Drives After : "+desktop.externalDrives);
        
        // CANT DO THIS
        // System.out.println("Computer Drives Before: "+computer.externalDrives);
        // computer.insertDrive("USB_A");
        // System.out.println("Computer Drives After : "+computer.externalDrives);

    }

}
