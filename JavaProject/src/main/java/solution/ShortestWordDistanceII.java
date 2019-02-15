package solution;

import java.util.ArrayList;

/**
 * @author zhouzhankun
 * @time 19/2/15 09:44
 **/


public class ShortestWordDistanceII {

    private String[] strings;

    public ShortestWordDistanceII(String[] strList) {
        strings = strList;
    }

    public int getShortestDistance(String string1, String string2) {
        int minDistance = -1;
        ArrayList<Integer> arrayList1 = new ArrayList<>(), arrayList2 = new ArrayList<>();
        if (strings == null || strings.length < 3) {
            return minDistance;
        }
        if (string1 == null || string1.length() < 0) {
            return minDistance;
        }
        if (string2 == null || string2.length() < 0) {
            return minDistance;
        }
        if (string1.equals(string2)) {
            return 0;
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string1)) {
                arrayList1.add(i);
            }
            if (strings[i].equals(string2)) {
                arrayList2.add(i);
            }
        }
        if (arrayList1.size() <= 0 || arrayList2.size() <= 0) {
            return minDistance;
        }
        for (int j = 0; j < arrayList1.size(); j++) {
            for (int k = 0; k < arrayList2.size(); k++) {
                if (minDistance == -1) {
                    minDistance = Math.abs(arrayList1.get(j) - arrayList2.get(k));
                } else {
                    if (minDistance > Math.abs(arrayList1.get(j) - arrayList2.get(k))) {
                        minDistance = Math.abs(arrayList1.get(j) - arrayList2.get(k));
                    }
                }
            }
        }
        return minDistance;
    }
}
