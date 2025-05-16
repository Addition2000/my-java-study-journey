# 9 构造器和垃圾回收
## 栈stack和堆heap
stack:存方法调用和局部变量
heap:存所有的对象
方法调用时,将栈帧放到栈顶.(我感觉就是一个任务队列,排队执行)
实例变量会留出所需类型的预留空间放到堆中
引用对象只有创建实例才会赋予空间在堆上,否则只是声明的话只生成(遥控器)
的空间在堆上
## 构造器contructor
~~~ java
Duck myDuck = new Duck():

public class Duck(){
public Duck(){ //构造器没有返回值类型的标注
System.out.println("Quack")
}
}
~~~
构造器:用于实例化对象的代码,相当于初始化时的一个方法执行
自己或者编译器会写一个构造器
==构造器不能继承==
并且构造器可以有多个，根据参数的不同,方法也是可以这样使用的
~~~ java
public Duck2 (){
size = 27}
public Dcuk2 (int ducksize){
size = ducksize
}

public void swim() {
    System.out.println("鸭子以默认速度游泳");
}

public void swim(int speed) {
    System.out.println("鸭子以" + speed + "速度游泳");
}
~~~

==同一个对象，相同各两个构造器和方法名字相同，参数的顺序改变算不同的构造器和方法==
## 继承与构造器
如果有继承的对象,其超类的构造器也会运行会先从最顶的超类开始构建(最上面的超类在栈顶)
默认编译器会帮你写上super,但是也可以自定义
~~~ java
public duck (int newsize){
super(); //必须在这里面的最前面!!!
size = newsize
}
~~~
## super() 和 this() 的区别

`super()`和`this()`都是Java中构造方法中的特殊语句，==两者只能存在一个==
- **super()**: 调用父类的构造方法
- **this()**: 调用这个类里面的其他构造器
~~~ java
class Child extends Parent {
private int age;
// 使用super()调用父类构造
public Child() {
super(); // 调用父类无参构造，可以省略
System.out.println("Child 无参构造");
}
// 使用super(参数)调用父类带参构造
public Child(String name) {
super(name); // 调用父类带参构造
System.out.println("Child 带参构造: " + name);
}
// 使用this()调用本类构造
public Child(String name, int age) {
this(name); // 调用本类的Child(String name)构造方法
this.age = age;
System.out.println("Child 全参构造: " + name + ", " + age);
}
~~~
## 对象的存在时间
局部变量在域中存活
引用活着,对象就活着
~~~ java
z = null //消失方式
