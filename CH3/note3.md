# 3 基本类型和对象引用
## 基本类型
- 整数(可储存的数值范围大到小)
	- long 64 末尾要有 L (大小写都行)
	- ==int 32==
	- short 16
	- byte 8
- 浮点数
	- ==float 32== 末尾要有f (大小写都行)
	- double 64
- boolean true/false
- char 0-65535
## 对象引用
dog.bark() 相当于对象dog调用bark()的方法
声明引用变量,给对象分配空间,控制dog对象
引用变量和对象 ==d = c 并不是复制c,而是复制c引用的对象!!!==
1. `Book b = new Book();` - 创建一个 Book 对象，并将引用赋给变量 b
2. `Book c = new Book();` - 创建另一个 Book 对象，并将引用赋给变量 c
3. `Book d = c;` - 变量 d 获得了与 c 相同的引用，现在 c 和 d 都指向第二个 Book 对象
4. `c = b;` - 变量 c 的引用被改变，现在 c 指向与 b 相同的对象（第一个 Book 对象）
5. `c = null` - c不引用任何对象
数组也算是对象，数组中也可以引用变量
``` java
Dog[] Pets; //要与对应的类同门，类也相当于一个杯子
pets = new Dog[7];
pets[1] = new Dog();
pets[1].bark(); //可以直接在后面加上点进行访问对应的方法
```