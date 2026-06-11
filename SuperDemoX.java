
class SuperDemoX {

    public static void main(String A[]) {
        Derived dobj = new Derived();  //Error

        dobj.gun();

    }
}

class Base {

    public int i;

    public Base(int no) {
        System.out.println("Inside Base Constructor");
        this.i = no;
    }

    public void fun() {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base {

    public int i;

    public Derived() {
        super(11);  //explicit call to Base constructor
        System.out.println("Inside Derived constructor");
        this.i = 21;
    }

    public void gun() {
        System.out.println("Inside gun of Derived");
        System.out.println("value of i:" + i);
        System.out.println("value of i from Base:" + super.i);
    }

}
