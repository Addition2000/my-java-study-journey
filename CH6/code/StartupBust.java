import java.util.ArrayList; //引入arraylist

public class StartupBust {  

  private GameHelper helper = new GameHelper(); //创建一个玩家实例
  private ArrayList<Startup> startups = new ArrayList<Startup>(); //存放三个创业公司位置的arraylist
  private int numOfGuesses = 0; //玩家猜测次数

  private void setUpGame() {
    // first make some Startups and give them locations
    Startup one = new Startup(); //创建公司one，
    one.setName("poniez");
    Startup two = new Startup();
    two.setName("hacqi");
    Startup three = new Startup();
    three.setName("cabista");
    startups.add(one); //存放三个创业公司位置
    startups.add(two);
    startups.add(three);

    System.out.println("Your goal is to sink three Startups."); //游戏说明
    System.out.println("poniez, hacqi, cabista");
    System.out.println("Try to sink them all in the fewest number of guesses");

    for (Startup startup : startups) {
      ArrayList<String> newLocation = helper.placeStartup(3); //传出三个参数，为一个startup的位置
      startup.setLocationCells(newLocation);
    } // close for loop
  } // close setUpGame method

  private void startPlaying() {
    while (!startups.isEmpty()) {
      String userGuess = helper.getUserInput("Enter a guess");
      checkUserGuess(userGuess); //玩家测试
    } // close while
    finishGame(); //结束游戏
  } // close startPlaying method

  private void checkUserGuess(String userGuess) {
    numOfGuesses++;
    String result = "miss"; // assume a miss until told otherwise

    for (Startup startupToTest : startups) {
      result = startupToTest.checkYourself(userGuess);

      if (result.equals("hit")) {
        break;
      }
      if (result.equals("kill")) {
        startups.remove(startupToTest); // 清除
        break;
      }
    } // close for

    System.out.println(result);
  } // close method

  private void finishGame() { //结束游戏
    System.out.println("All Startups are dead! Your stock is now worthless");
    if (numOfGuesses <= 18) {
      System.out.println("It only took you " + numOfGuesses + " guesses.");
      System.out.println("You got out before your options sank.");
    } else {
      System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
      System.out.println("Fish are dancing with your options");
    }
  } // close method

  public static void main(String[] args) {
    StartupBust game = new StartupBust(); //初始化游戏
    game.setUpGame(); //设置公司初始位置
    game.startPlaying();
  } // close method
}