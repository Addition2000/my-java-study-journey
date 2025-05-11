# 4 方法使用实例变量
## 可以向方法中传递值
调用者传递实参(argument),方法接受参数(parameter)
~~~ java
void bark (int numbarks){
while (numbarks>0){
System.out.println("ruff");
numbarks = numbarks - 1;
}
}
// 如果有多个参数要用 , 进行分开
~~~
## 方法可以获得返回值
~~~ java
int giveSecret() {
return 42;
}
//返回值必须与标注的类性一致
~~~
## 隐藏数据
实例变量标记为private
获取方法和设置方法标记为public,
方法中的为局部变量,局部变量没有值,所以使用前需要进行初始化,类中的变量则为实例变量
封装（Encapsulation）是面向对象编程的核心原则之一，它指的是将数据（属性）和操作这些数据的方法绑定在一起，并对外部隐藏实现细节。