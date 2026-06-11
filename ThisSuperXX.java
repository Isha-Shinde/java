
class ThisSuperXX {

    public static void main(String A[]) {
        Derived dobj = new Derived();

        dobj.gun();
        System.out.println(dobj.i);

    }
}

class Base {

    public int i;

    public Base() {
        System.out.println("Inside Base Constructor");
        this.i = 11;
    }

    public void fun() {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base {

    public int i;

    public Derived() {
        System.out.println("Inside Derived constructor");
        this.i = 21;
    }

    public void gun() {
        System.out.println("Inside gun of Derived");
        System.out.println("value of i:" + i);
        System.out.println("value of i from Base:" + super.i);
    }

}
