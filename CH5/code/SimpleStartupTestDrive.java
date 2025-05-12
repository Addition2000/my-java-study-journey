public class SimpleStartupTestDrive {
    public static void main (String[] args){
        int numOfGuesses;
        java.util.Random randomGenerator = new java.util.Random();
        int chushi = randomGenerator.nextInt(5);
        int[] gongsiweizhi = {chushi,chushi+1,chushi+2};
        System.out.println(java.util.Arrays.toString(gongsiweizhi));
            
        }
    }