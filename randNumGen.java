public class randNumGen {
    public static void main(String[] arg) {
        int[] lottery = new int[6];
        int randomNum;
        c1:
            for (int i = 0; i < 6; i++) {
                randomNum = (int) (Math.random() * 50); //  The Random Number is born
                if(randomNum == 0) {
                    continue c1;
                }   
                for (int x = 0; x < i; x++) {
                    if (lottery[x] == randomNum ) // Checking if it said number has been used
                    {
                        randomNum = (int) (Math.random() * 50);// If it has, another is chosen
                        x = -1; // Restarts loop
                    }
    
                }
                lottery[i] = randomNum;
            }
    
        for (int i = 0; i < lottery.length; i++)
            System.out.print(lottery[i] + " ");
    
    }
}