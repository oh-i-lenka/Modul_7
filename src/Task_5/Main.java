package Task_5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        long start, end;

        List<Integer> listInteger = new ArrayList<>();
        List<String> listString = new ArrayList<>();
        List<Integer> linkListInt = new LinkedList<>();
        List<String> linkListString = new LinkedList<>();
        Random myRandom = new Random();

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            listInteger.add(new Integer(myRandom.nextInt()));
        end = System.nanoTime();
        System.out.println("Time of method add    for IntegerList    1000 elements " + (end - start)+ " milisec");
        System.out.println(listInteger);

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            listString.add("");
        }
        end = System.nanoTime();
        System.out.println("Time of method add    for StringList     1000 elements " + (end - start)+ " milisec");
        Collections.fill(listString, "ich");
        System.out.println(listString);

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            linkListInt.add(new Integer(myRandom.nextInt()));
        end = System.nanoTime();
        System.out.println("Time of method add    for linkListInt    1000 elements " + (end - start)+ " milisec");
        System.out.println(linkListInt);

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkListString.add("");
        }
        end = System.nanoTime();
        System.out.println("Time of method add    for linkListString 1000 elements " + (end - start)+ " milisec");
        Collections.fill(linkListString, "bin");
        System.out.println(linkListString);

        //-----------------get
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            Integer obj = listInteger.get(i);
            System.out.println(obj);}
        end = System.nanoTime();
        System.out.println("Time of method get    for IntegerList    1000 elements " + (end - start)+ " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            listString.get(i);
        end = System.nanoTime();
        System.out.println("Time of method get    for StringList     1000 elements " + (end - start)+ " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            linkListInt.get(i);
        end = System.nanoTime();
        System.out.println("Time of method get    for linkListIntege 1000 elements " + (end - start)+ " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            linkListString.get(i);
        end = System.nanoTime();
        System.out.println("Time of method get    for linkListString 1000 elements " + (end - start)+ " milisec");


        //-------------------set
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            listInteger.set(i, myRandom.nextInt());
        end = System.nanoTime();
        System.out.println("Time of method set    for IntegerList    1000 elements " + (end - start) + " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            listString.set(i, "ha");
        end = System.nanoTime();
        System.out.println("Time of method set    for StringList     1000 elements " + (end - start) + " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            linkListInt.set(i, myRandom.nextInt());
        end = System.nanoTime();
        System.out.println("Time of method set    for linkListIntege 1000 elements " + (end - start) + " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            linkListString.set(i, "ha");
        end = System.nanoTime();
        System.out.println("Time of method set    for linkListString 1000 elements " + (end - start) + " milisec");


        //-------------------remove
        start = System.nanoTime();
        Iterator iter = listInteger.iterator();
        while (iter.hasNext()){
            iter.next();
            iter.remove();
        }
        end = System.nanoTime();
        System.out.println("Time of method remove for IntegerList    1000 elements " + (end - start) + " milisec");
        System.out.println(listInteger);

        start = System.nanoTime();
        Iterator iterStr = listString.iterator();
        while (iterStr.hasNext()){
            iterStr.next();
            iterStr.remove();
        }
        end = System.nanoTime();
        System.out.println("Time of method remove for StringList     1000 elements " + (end - start) + " milisec");
        System.out.println(listString);


        start = System.nanoTime();
        Iterator iterlinkListInt = linkListInt.iterator();
        while (iterlinkListInt.hasNext()){
            iterlinkListInt.next();
            iterlinkListInt.remove();
        }
        end = System.nanoTime();
        System.out.println("Time of method remove for linkListIntege 1000 elements " + (end - start) + " milisec");
        System.out.println(linkListInt);

        start = System.nanoTime();
        Iterator iterlinkListString = linkListString.iterator();
        while (iterlinkListString.hasNext()){
            iterlinkListString.next();
            iterlinkListString.remove();
        }
        end = System.nanoTime();
        System.out.println("Time of method remove for linkListString 1000 elements " + (end - start) + " milisec");
        System.out.println(linkListString);

        //-------------------10000

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            listInteger.add(new Integer(myRandom.nextInt()));
        end = System.nanoTime();
        System.out.println("Time of method add    for IntegerList    10000 elements " + (end - start)+ " milisec");
//        System.out.println(listInteger);

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            listString.add("");
        }
        end = System.nanoTime();
        System.out.println("Time of method add    for StringList     10000 elements " + (end - start)+ " milisec");
        Collections.fill(listString, "ich");
//        System.out.println(listString);

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            linkListInt.add(new Integer(myRandom.nextInt()));
        end = System.nanoTime();
        System.out.println("Time of method add    for linkListInt    10000 elements " + (end - start)+ " milisec");
//        System.out.println(linkListInt);

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkListString.add("");
        }
        end = System.nanoTime();
        System.out.println("Time of method add    for linkListString 10000 elements " + (end - start)+ " milisec");
        Collections.fill(linkListString, "bin");
//        System.out.println(linkListString);

        //-----------------get
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++){
            Integer obj = listInteger.get(i);
//            System.out.println(obj);
        }
        end = System.nanoTime();
        System.out.println("Time of method get    for IntegerList    10000 elements " + (end - start)+ " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            listString.get(i);
        end = System.nanoTime();
        System.out.println("Time of method get    for StringList     10000 elements " + (end - start)+ " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            linkListInt.get(i);
        end = System.nanoTime();
        System.out.println("Time of method get    for linkListIntege 10000 elements " + (end - start)+ " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            linkListString.get(i);
        end = System.nanoTime();
        System.out.println("Time of method get    for linkListString 10000 elements " + (end - start)+ " milisec");


        //-------------------set
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            listInteger.set(i, myRandom.nextInt());
        end = System.nanoTime();
        System.out.println("Time of method set    for IntegerList    10000 elements " + (end - start) + " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            listString.set(i, "ha");
        end = System.nanoTime();
        System.out.println("Time of method set    for StringList     10000 elements " + (end - start) + " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            linkListInt.set(i, myRandom.nextInt());
        end = System.nanoTime();
        System.out.println("Time of method set    for linkListIntege 10000 elements " + (end - start) + " milisec");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            linkListString.set(i, "ha");
        end = System.nanoTime();
        System.out.println("Time of method set    for linkListString 10000 elements " + (end - start) + " milisec");


        //-------------------remove
        start = System.nanoTime();
        Iterator listInteger2 = listInteger.iterator();
        while (listInteger2.hasNext()){
            listInteger2.next();
            listInteger2.remove();
        }
        end = System.nanoTime();
        System.out.println("Time of method remove for IntegerList    10000 elements " + (end - start) + " milisec");
        System.out.println(listInteger);

        start = System.nanoTime();
        Iterator listString2 = listString.iterator();
        while (listString2.hasNext()){
            listString2.next();
            listString2.remove();
        }
        end = System.nanoTime();
        System.out.println("Time of method remove for StringList     10000 elements " + (end - start) + " milisec");
        System.out.println(listString);


        start = System.nanoTime();
        Iterator linkListInt2 = linkListInt.iterator();
        while (linkListInt2.hasNext()){
            linkListInt2.next();
            linkListInt2.remove();
        }
        end = System.nanoTime();
        System.out.println("Time of method remove for linkListIntege 10000 elements " + (end - start) + " milisec");
        System.out.println(linkListInt);

        start = System.nanoTime();
        Iterator iterlinkListString2 = linkListString.iterator();
        while (iterlinkListString2.hasNext()){
            iterlinkListString2.next();
            iterlinkListString2.remove();
        }
        end = System.nanoTime();
        System.out.println("Time of method remove for linkListString 10000 elements " + (end - start) + " milisec");
        System.out.println(linkListString);
    }
}
