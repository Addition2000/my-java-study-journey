# 5 写程序
## 开发一个类的流程
1. 明确类的目的
2. 列出实例变量和方法
3. 为方法输入==预备代码==
4. 为方法输入==测试代码==
5. ==实现类==
6. 测试方法
7. 调试并重新实现
8. 向实际用户测试
## 预备代码 进行解释说明概念
1. 实例变量说明
2. 方法说明
3. 方法逻辑
## 测试代码 test-driven development
一部分一部分是写和测试,从而证明新的代码不会破坏之前的代码
从类的大框架到小的方法部分
## for循环
~~~ java
for（int cell：locationscells）
//其中的：表示in的意思，用for循环遍及一遍
for（int i=0；i《10；i++）
~~~
- (int) 强制转变成整数
- helper.getUserInput('enter a number')
## while 和 for的区别
while没有内置的初始化或迭代表达式
## ++ --的位置与先后顺序
x=0；
int z = x++；
则z为0 x为1

x=0；
int z = ++x；
则z为1 x为1