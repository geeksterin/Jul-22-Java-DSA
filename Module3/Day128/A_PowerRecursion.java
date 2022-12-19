import java.util.* ;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.io.* ;

class A_PowerRecursion {

    public static int pow( int base, int power ) {

        // T&S -> O(power)
        System.out.println("POW called with power = " + power);
        if ( power == 0 ) {
            return 1;
        }
        return base * pow( base, power-1 );

    }

    public static int powEfficient( int base, int power ) {
        
        // base ^ power
        // T&S -> O(log2(power))
        System.out.println("POW EFFICIENT called with power = " + power);
        if ( power==0 ) {
            return 1;
        }

        int halfPower = powEfficient(base,power/2);
        int ans = halfPower * halfPower;

        if ( power%2==1 ) {
            ans *= base;
        }

        return ans;
    }


    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(pow(x,y));
        System.out.println("--------------------------------");
        System.out.println(powEfficient(x,y));

        
    }

}
