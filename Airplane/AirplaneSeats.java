import java.util.*;

public class AirplaneSeats {
    private boolean[] isFilled;
    private List<Integer> availableSeats;
    public static int[] orderOfBoarding;

    public AirplaneSeats() {
        isFilled = new boolean[100]; //initially all false
        orderOfBoarding = new int[100];//initially all 0
        availableSeats = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            availableSeats.add(i);
            orderOfBoarding[i] = i;
        }
        shuffleArray(orderOfBoarding);
    }

    //process passenger #1
    public void processFirstPassenger() {
        //create random seat for first passenger: use int random
        int random = (int) (Math.random() * 100);
        //System.out.println(random);
        //fill that seat
        isFilled[random] = true;
        //remove seat from availableSeats
        availableSeats.remove(new Integer(random));
        //System.out.printf("Passenger %d has taken seat %d%n", 1, random );
    }

    //process passenger #2 to #99 and assign them seats
    public void simulate() {
        for (int i = 1; i < 99; i++) {
            if (isFilled[orderOfBoarding[i]]){
                int random = (int) (Math.random() * availableSeats.size());
                isFilled[random] = true;
                availableSeats.remove(new Integer(random));
                //System.out.printf("Passenger %d has finally taken seat %d%n", i+1, random);
            } else{
                int seat = orderOfBoarding[i];
                isFilled[seat] = true;
                availableSeats.remove(new Integer(seat));
                //System.out.printf("Passenger %d has taken seat %d%n", i+1, seat);
            }
        }
    }
    // check if last passenger's seat is empty
    public boolean isLastPassengerSeatEmpty() {
        return !isFilled[orderOfBoarding[99]];
    }
    //shuffle array
    static void shuffleArray(int[] ar) {
        for (int i = ar.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            // swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}