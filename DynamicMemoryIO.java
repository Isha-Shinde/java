
import java.util.Scanner;

class DynamicMemoryIO {

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;
        int i = 0;   //loop counter

        System.out.println("Enter number of elements:");
        Size = sobj.nextInt();

        //Dnamic memory allocation
        float Marks[] = new float[Size];

        //use the memory
        System.out.println("Enetr your Marks: ");

        for (i = 0; i < Size; i++) {
            Marks[i] = sobj.nextFloat();
        }

        System.err.println("Entered marks are :");

        for (i = 0; i < Size; i++) {
            System.out.println(Marks[i]);
        }
        Marks = null;
        System.gc();

    }

}
