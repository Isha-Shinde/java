
class SuperDemo {

    public static void main(String A[]) {
        Derived dobj = new Derived();

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

        System.out.println("Inside Derived constructor");
        this.i = 21;
    }

    public void gun() {
        System.out.println("Inside gun of Derived");
        System.out.println("value of i:" + i);
        System.out.println("value of i from Base:" + super.i);
    }

}

//Java automatically tries to call default constructor of Base, but it doesn't exist.

// So this code will give compile-time error
