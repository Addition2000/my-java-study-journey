# 10 数字和静态
## Math
属于静态方法, 属于类本身而不是类的实例（对象）的方法,不能建立实例
~~~ java
long x = Math.round(43.2);
int y = Math.main(56,12);
int z = Math.abs(-1234);
~~~
## 常规(非静态)和静态
~~~ java
public final class Math {
    // 私有构造器，防止实例化
    private Math() {}
    
    // 所有方法都是静态的
    public static double sqrt(double a) {
        // 实现开平方
    }
    
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
    
    // 其他静态方法...
}

public static void main(String[] args) {
    // 程序代码
}


~~~
静态方法不能使用非静态方法
最好通过类名调用静态方法
mian是一种静态方法
## 静态变量
尽在第一次加载时初始化, 而不是每次创建实例计算,并且静态变量会进行共享
~~~ java
private static int duckcount = 0 ;
~~~
## 常量
初始化后不再改变,不仅可以用于静态的非静态,方法,类等都可以.最终类不能被继承
~~~ java
public static final double PI = 3.1415926
~~~
设定方法
~~~ java
// 1 直接初始化
public class ConstantInit2 {
    public static final int X_VALUE = 25;
}

// 2 使用static静态代码块进行初始化,其会早于静态变量和静态方法前运行
public class ConstantInit3 {
    public static final double VAL;
    
    static {
        VAL = Math.random();
    }
}
~~~
## 静态static和常量final的不同
- 静态变量会自动获得默认值
- `final`变量必须显式初始化，而普通变量（无论是静态还是非静态）都会获得默认值
## 基本类型的包装器
==把基本类型当作对象的时候就给它包装起来==
和arrary差不多,类名首字母都大写了
~~~ java
Boolean
Character
Byte
Short
Integer
Long
Float
Double


// 单一增加
int i = 288;
Integer iWrap = new Integer(i); //包装一个值

int unWrapped = iWrap.intValue(); //解包一个值

//一次加多个
// 使用ArrayList存储多个Integer对象
ArrayList<Integer> values = new ArrayList<>();
values.add(288);
values.add(500);

// 获取第二个值并解包
int secondValue = values.get(1); // 自动拆箱
System.out.println("第二个值: " + secondValue);

// 包装器的功能
//解析
String s = "2";
int x = Integer.parseInt(s); //将不同类型的内容解析为目标类型

//反解析
dpuble d = 42.5;
String doubleString = Double.toString(d);
String doubleString = Double.valueOf(d); //几乎任何东西转换成String
~~~
## 数字格式化

~~~ java
long myBillion = 1_000_000_000;//划线在编译时会被忽略，不影响实际值
String s = String.format("%,d",myBillion); //1,000,000,000
~~~

- `%` 是所有格式说明符的起始标记
- `,` 是一个**标志**(flag)，表示"使用千位分隔符"
- `d` 是**转换字符**(conversion)，表示将值格式化为十进制整数(decimal)
- %.2f: 保留两位小数

格式指示符:
~~~
% [argument number] [flags 分割] [width 宽度] [.precision 精度] type 类型
~~~
- %x 16进制
- %* 字符形式
## 静态导入
省略前面的部分,一般不用因为读起来费劲
~~~ java
import static java.long.Math.* //math后面的直接使用就行
import static java.long.System.out //使用out就行
~~~

==先静态!!!new时进行构造器!!!==

- 静态初始化**只执行一次**：在整个 JVM 生命周期中，每个类的静态初始化只会执行一次
- 初始化**按照继承层次**：总是从父类到子类
- 同一个类中的静态初始化**按照代码声明顺序**执行