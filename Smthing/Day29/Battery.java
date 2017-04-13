package Smthing.Day29;

/**
 * Created by jiangning on 2017/3/29.
 */
public class Battery {
    //品牌
    String Brand;
    //作用
    String effect;
    public void show(){
        System.out.println("品牌是："+Brand+"\n"+"作用："+effect+"\n");
    }

    public static void main(String[] args) {
        Battery dianchi = new Battery();//创建电池对象
        //赋予电池属性
        dianchi.Brand="南孚";
        dianchi.effect="充电";
        dianchi.show();//输出
    }
}
