public class SimpleStartupTest {
    public static void main (string[] args){
        SimpleStartup dot = new SimpleStartupTest();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        int userGuess = 2;
        String result = dot.checkYourself(userGuess);
        
        String testResult = "failed";
        if (result.equals("hit"){
            testResult="passed";
        }

        System.out.println(testResult);

    }
}
