public class ch1Ex11 {
    public static void main(String[] args) {

        double pop=312032486;
        for(int i=1;i<=5;i++){
            pop+=(3600*24*365)/7.0-(3600*24*365)/13.0+(3600*24*365)/45.0;
            System.out.println("Population in "+i+" year is"+pop);
        }
    }
    
}
