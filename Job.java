import java.util.Random;

public class Job {
    int serviceTime;
    int interArrivalTime;
    int arrivalTime;
    Random rand = new Random();
    public Job (int clockTime) {
        serviceTime = rand.nextInt(4) + 2;
        interArrivalTime = rand.nextInt(6) + 4;
        arrivalTime = clockTime;
    }

    public int getServiceTime () {
        return this.serviceTime;
    }
    public int getInterArrivalTime () {
        return this.interArrivalTime;
    }
    public int getArrivalTime () {
        return this.arrivalTime;
    }
}
