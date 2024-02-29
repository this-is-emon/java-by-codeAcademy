package conditionalOperator;

public class Reservation {
    int guestCount;
    int restaurentCapacity;
    boolean isRestaurentOpen;
    boolean isConfirmed;

    public Reservation(int count, int capacity, boolean open){
        /* 
        Write 'OR(||)' conditional
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        if:
            guestCount is smaller then 1 'OR' greater then 8:
                print "Reservation Invalid"
        */
        if (count < 1 || count > 8) {
            System.out.println("Reservation Invalid");
        }

        guestCount = count;
        restaurentCapacity = capacity;
        isRestaurentOpen = open;
    }

    public void confirmReservation(){
    /* 
       Write 'AND(&&)' conditional
       ~~~~~~~~~~~~~~~~~~~~~~~~~~~
       if:
            restaurantCapacity is greater or equal to guestCount 'AND' the restaurant is open:
                print "Reservation confirmed"
                set isConfirmed to true
       else:
            print "Reservation denied"
            set isConfirmed to false
    */
        if ((restaurentCapacity > guestCount) && isRestaurentOpen) {
            System.out.println("Reservation Confirmed");
            isConfirmed = true;
        }else{
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser(){
        /* 
        Write 'NOT(!)' conditional
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        if:
            the reservation in not confirmed:
                print "Unable to confirm reservation, please contact restaurant."
        else:
            print "Please enjoy your meal!"
        */
        if (!isConfirmed) {
           System.out.println("Unable to confirm reservation, please contact restaurant."); 
        }else{
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] aStrings){
        Reservation meetingOfThree = new Reservation(3, 12, true);
        Reservation meetingOfFour = new Reservation(4, 3, false);

        meetingOfThree.confirmReservation();
        meetingOfThree.informUser();

        System.out.println("-------------------------");

        meetingOfFour.confirmReservation();
        meetingOfFour.informUser();
        
    }
}
