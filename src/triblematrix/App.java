package triblematrix;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<MyObject> list1 = getNumbers(3, 5, -88, -92,-42);
        ArrayList<MyObject> list2 = getNumbers(8, 14, -242, -254,-114);
        ArrayList<MyObject> same = same(list1, list2);
        read(same);
    }

    public static void read(ArrayList<MyObject> list) {
        for (MyObject o : list) {
            System.out.println(o);
        }
    }

    public static ArrayList<MyObject> getNumbers(int inita, int initb, int resulta, int resultb, int resultc) {
        ArrayList<MyObject> list = new ArrayList<MyObject>();
        for (int w1 = -15; w1 >= -15 && w1 <= 15; w1++) {
            for (int w2 = -15; w2 >= -15 && w2 <= 15; w2++) {
                for (int w3 = -15; w3 >= -15 && w3 <= 15; w3++) {
                    for (int w4 = -15; w4 >= -15 && w4 <= 15; w4++) {
                        for (int w5 = -15; w5 >= -15 && w5 <= 15; w5++) {
                            for (int w6 = -15; w6 >= -15 && w6 <= 15; w6++) {
                                if ((w1 * inita + w2 * initb) == resulta && (w3 * inita + w4 * initb) == resultb
                                        && (w5 * inita + w6 * initb) == resultc) {
                                    list.add(new MyObject(w1, w2, w3, w4, w5, w6));
                                }
                            }
                        }
                    }
                }
            }
        }
        return list;
    }

    public static ArrayList<MyObject> same(ArrayList<MyObject> list1, ArrayList<MyObject> list2) {
        ArrayList<MyObject> same = new ArrayList<MyObject>();
        int index1 = 0;
        int index2 = 0;
        try {
            while (index1 < list1.size()) {
                while (index2 < list2.size()) {
                    if (list1.get(index1).compareTo(list2.get(index2)) == 0) {
                        same.add(list1.get(index1));
                        index1++;
                        index2++;
                    } else if (list1.get(index1).compareTo(list2.get(index2)) > 0) {
                        index2++;
                    } else {
                        index1++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("");
        }
        return same;
    }
}
