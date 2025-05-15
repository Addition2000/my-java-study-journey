# 8 接口和抽象类
## 抽象类
abstract 例如animal类就是一共比较抽象的类，可以通过添加abstract从而不能使用new进行实例化.所以真正使用的是其子类(具体子类).
但是其可以有静态对象(在CH10).
~~~ java
abstract class Canine extends Animal{
public viod （）{}
}
~~~
## 抽象方法
也就是说抽象方法的作用是让子类必须编写相应的方法,抽象方法必须在抽象类或接口中定义
作用:形成一个规范标准,也更方便用于后续多态的使用
~~~ java
public abstract void eat ();
~~~
抽象类canine继承了抽象类animal，是不是不用写animal中的抽象方法，直到有具体类的继承了canine？
## 超类 Object
~~~ java
a.equals(); //看是否相等
c.hashCode(); //唯一ID
c.getClass(); //返回实例化类的名称
c.toString(); //类名和数字
~~~
==注意的是==: 如果把别的类型输入到object里面,出来则变成object的类型,这样会导致子类的功能无法实现.
- 多态: 表示多种形态,例如dog既可以是dog也可以是object
~~~ java
Snow s = new Snow(); //可以控制Snow和object部分
Oject o = s; //只能控制object部分
Dog d = (Dog) o; //强转Dog
if (o instanceof Dog ) //检测是否o属于dog,从而可以确认转换的时候不会出错
~~~
## 继承extends多个超类:多重继承multiple inheritance(c++可行)→api接口
接口解决DDD问题(deadly diamond of death)
~~~ java
public interface pet {} //建立接口,且接口内的方法都是抽象的
public class Dog extends Canine implements pet {} //接入接口,并且可以接入多个接口
~~~