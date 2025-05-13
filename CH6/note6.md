# 6 java api
## ArrayList
java库中的一个默认的类
~~~ java
add（E e）//增加元素
remove（ine index）//删除指定位置上的元素
remove（Object o） //删除指定元素第一次出现的
contains（Object o） //列表包含指定元素返回true
isEmpty （） //不含元素返回true
indexOf（Object o） //返回第一个所以，或者返回-1
size（） //返回元素个数
get（int index） //返回指定位置的元素

ArrayList<egg> mylist = new ArrayList<egg>（）//专门储存egg对象的列表，string也是一种特殊的对象
~~~
##  布尔表达式
~~~ java
//短路操作符：更高效
&& //且的意思
|| //或的意思

//非短路操作符-：总是评估所有条件，即使结果已经确定
&
|

（） //防止不知道优先级，可以使用括号来确定
m != 100 //不等于
!brand.equals（"x"）//不等于

~~~
## 导入包
~~~ java
import java.util.ArrayList; //导入
java.util.ArrayList<dog> mylist = new java.util.ArrayList //实例化

java.long //这里的包都是免导入的
~~~
