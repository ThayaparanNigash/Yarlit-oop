
package PackB;
import PackA.A;

public class B extends A {
    public int y;

    public B() {
        this.y = 20;
    }

    public void gety() {
		super.getx();
        System.out.println("By= " + this.y);
    }
}