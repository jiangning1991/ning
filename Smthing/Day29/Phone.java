package Smthing.Day29;

/**
 * Created by jiangning on 2017/3/29.
 */
public class Phone {
    //行为： 播放下载的音乐下载充电
    //品牌
    String Brand;
    //播放音乐
    String music;
    //下载
    String download;
    //充电
    //String Charge;
    public void show(){
        System.out.println("品牌是："+Brand+"\n"+"可以："+music+"\n"+"可以："+download+"\n");
    }

    public static void main(String[] args) {
        Phone vivo = new Phone();//创建手机对象
        //赋予属性
        vivo.Brand="vivo";
        vivo.music="听音乐";
        vivo.download="下载东西";
        vivo.show();//打印手机
        Battery dianchi=new Battery();
        dianchi.Brand="南孚";
        dianchi.effect="充电";
        dianchi.show();//引入电池属性
    }
}
