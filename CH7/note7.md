# 7 继承和多态
超类与子类（继承超累的方法，同时可以覆盖超累）
继承：子类继承超类，作用是避免重复的代码
~~~ java
public class Doctor{
blloean worksAtHospital;
void treatPatient{
//perform a checkup
}
}

// 继承是圆通 extends
public class FamilyDoctor extends Doctor{
blloean makeHoueCalls;
void giveAdvice{
//give homespun advice
}
}

//两个都想保留时
public void roam（）{
super.roam(); //内部调用父类的方法
}

final //标注后将不能被继承
~~~
## is-a和has-a
is-a 相当于继承
hsa-a 引用某一共类
## 访问级别
- private
- default
- protected
- public
## 多态
同一个变量，储存不同子类的内容
1. 建立列表
~~~
Animal[] animals = new Animal[5]
Animal[0] animals = new Dog
~~~
2. 设置继承后，可以在特定方法设定超类的类型，让所有子类可以使用

## 覆盖
覆盖不能改变访问级别和改变参数
## 重载
方法名相同，但是参数列表不同就可以存在（类型，数量，顺序），只有返回值的类型不同是不行的