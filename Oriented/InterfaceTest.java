/**
 * Created by jiangning on 2017/4/6.
 */
public interface InterfaceTest extends C, D { // 被实现的 implements

    int ONE = 1;

    void m();
}

interface B {

    void b();
}

interface C {
    void c();
}

interface D {
    void d();
}

class InterfaceTestImpl implements InterfaceTest {


    public void m() {

    }

    public void b() {

    }

    public void c() {

    }

    public void d() {

    }
}






