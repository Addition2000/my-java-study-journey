# 1 java初探
使用JDK（java开发工具）
源代码(.java)→编辑器→输出(.class)→虚拟机（JVM java虚拟机）
## java 代码结构由外到内
scource file（.java结尾）
class
method
statement

java属于面向对象语言object-oriented

main用于启动程序
## while循环
布尔语法
~~~ java
public class Myapp {
    public static void main (String[] args){
        int x = 1 ;
        System.out.println("before the loop");
        while(x<4){
            System.out.println("in the loop");
            System.out.println("vale is "+ x);
            x = x + 1;
        }
        System.out.println("after loop");
    }
}
~~~
## if条件
~~~ java
public class Myapp {
    public static void main (String[] args){
        int x = 1 ;
        if(x==1){
            System.out.println("x is 1 true");
        }
        System.out.println("run is ok");
    }
}
~~~
## print
println 后面自带换行符
print 后面没有换行符
## random
java.util.Random randomGenerator = new java.util.Random(); 其中java.util.Random为内置的类
~~~
// generate three random numbers
      java.util.Random randomGenerator = new java.util.Random();
      int rand1 = randomGenerator.nextInt(oneLength);
      int rand2 = randomGenerator.nextInt(twoLength);
      int rand3 = randomGenerator.nextInt(threeLength);
      // now build a phrase
      String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

(int)(Math.random() * 5)
~~~