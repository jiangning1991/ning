package reflect.demo;

/**
 * Created by jiangning on 2017/5/5.
 */
//高层应用类
public class Service {
    private FloppyWriter floppyWriter;
public Service(){
    floppyWriter = new FloppyWriter();
}
    public void write(){
        floppyWriter.writeToFloppy();
    }
}
