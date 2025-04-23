package Test1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        //给手机赋值
        p.brand = "小米";
        p.price = 2999;


        //获取手机对象中的值
        System.out.println("手机品牌：" + p.brand);
        System.out.println("手机价格：" + p.price);

        //调用手机的功能
        p.call();
        p.playGame();
    }


}
