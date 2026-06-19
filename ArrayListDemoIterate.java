
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemoIterate {

    public static void main(String A[]) {
        ArrayList<Float> aobj = new ArrayList<Float>();

        aobj.add(90.23f);
        aobj.add(67.323f);
        aobj.add(80.567f);
        aobj.add(90.78f);

        Iterator iobj = aobj.iterator();

        while (iobj.hasNext()) {
            System.out.println(iobj.next());
        }
    }
}
