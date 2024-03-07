import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Program {
    public static ArrayList<Job> jobs = new ArrayList<>();
    public static void main(String[] args) {
        BufferedWriter bw;
        int clockTime = 0;
        //Create Jobs
        for (int i = 0; i < 100; i++) {
            jobs.add(new Job(clockTime));
            clockTime += jobs.get(i).getInterArrivalTime();
        }
        
        //Output to CSV
        try {
            bw = new BufferedWriter(new FileWriter("output.csv"));
            //Print Program ID
            bw.write("Program ID, ");
            for (int i = 0; i < 100; i++) {
                bw.write(i + ", ");
            }
            bw.newLine();

            //Print out Arrival Times
            bw.write("Arrival Times, ");
            System.out.print("The arrival times are: \t{ ");
            for (int i = 0; i < 100; i++) {
                System.out.print(jobs.get(i).getArrivalTime() + ", ");
                bw.write(jobs.get(i).getArrivalTime() + ", ");
            }
            System.out.print("}\n");
            bw.newLine();
            
            //Print out Service Times
            bw.write("Service Times, ");
            System.out.print("The service times are: \t{ ");
            for (int i = 0; i < 100; i++) {
                System.out.print(jobs.get(i).getServiceTime() + ", ");
                bw.write(jobs.get(i).getServiceTime() + ", ");
            }
            System.out.print("}\n");
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}