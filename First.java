
class First {

    public static void main(String A[]) {

        Arithmatic aobj = new Arithmatic(11, 10);

        int Result = 0;

        Result = aobj.Addition();
        System.out.println("Addition is :" + Result);    //(+ is used for concatination)

        Result = aobj.Substration();
        System.out.println("Substraction is :" + Result); //(+ is used for concatination)

    }
}

class Arithmatic {

    public int No1, No2;

    public Arithmatic() {
        this.No1 = 0;
        this.No2 = 0;
    }

    public Arithmatic(int Value1, int Value2) {
        this.No1 = Value1;
        this.No2 = Value2;
    }

    public int Addition() {
        int Ans = 0;
        Ans = this.No1 + this.No2;
        return Ans;
    }

    public int Substration() {
        int Ans = 0;
        Ans = this.No1 - this.No2;
        return Ans;
    }
}
