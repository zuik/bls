public class AirplaneTester {

    //One your simulation works, modify your code so that the program
    //simulate 10000 trials and print out the estimated probability
    //that the last passenger finds his seat empty.
    public static void main(String[] args) {
        int trails = 10000;
        int hasSeat = 0;
        for(int i=0;i<trails;i++){
            if (runSim())
                    hasSeat ++;
        }
        System.out.printf("Last passenger has his seat %d out of %d => %.2f %n",
                hasSeat,
                trails,
                (float) hasSeat/trails);
    }
    public static boolean runSim(){
        // the following will run one simulation of the test.
        //create new AirplaneSeats object
        AirplaneSeats a = new AirplaneSeats();
        //process first passenger
        a.processFirstPassenger();
        //process passengers # 2-99
        a.simulate();
        //check last passenger
        return (a.isLastPassengerSeatEmpty());
    }

}