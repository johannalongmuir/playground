import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List testList  = new ArrayList();
        testList.add("hello");
        testList.add("hi");
        testList.add("hello");
        testList.add("hello");
        testList.add("hello");

        System.out.println(testList.get(0));
        System.out.println(testList);

        // can still use this as expected but each time something added will go through
        // can do as while loop potentiall. While A>=3?
        // as not in a list but just an idividual item should update it for the list?
        // use String builder not string for the receipt

        int helloCounter = 0;
        int hiCounter = 0;
        for (Object a: testList) {
            if (helloCounter == 2) {
                System.out.println("Equals 2!");
                //a = "test";
                helloCounter = 0;
            }
            System.out.println(a);


            if (a.equals("hello")) {
                helloCounter++;
                System.out.println("equals hello");
            } else if (a.equals("hi")) {
                hiCounter++;
                System.out.println("equals hi");
            }

            }
        System.out.println(helloCounter);
        System.out.println(hiCounter);

    }
}
