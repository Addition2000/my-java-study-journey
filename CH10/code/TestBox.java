public class TestBox {
    private Integer i = 0; // 初始化Integer对象，避免空指针异常
    private int j;

    public static void main (String[] args){
        TestBox t = new TestBox();
        t.go();
    }

    public void go(){
        // 也可以使用空值检查：j = (i != null) ? i : 0;
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
