public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("TheCarpenter",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);  //overloaded 1
        calculateScore();  //overloaded 2
        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(100);
    }
    public static int calculateScore(String playerName,int score){
        System.out.println("Player " + playerName + " scored " + score +" points");
        return score * 1000;
    }
    public static int calculateScore(int score){  //Overloading the method by changing the parameters
        System.out.println("Unnamed player scored " + score +" points");
        return score * 1000;
    }
    public static int calculateScore(){  //Overloading the method by changing the parameters
        System.out.println("No player name,no player score." );
        return 0;
    }

    //Challenge:
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if (feet >= 0 && (inches >= 0 && inches <= 12)){
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm");
            return centimeters;
        }
        System.out.println("Invalid feet or inches parameters");
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches equal to " + feet + " feet and " + remainingInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        return -1;
    }
}
