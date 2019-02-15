package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhouzhankun
 * @time 19/2/15 11:06
 **/

public class ArrayForm {

    public List<Integer> addToArrayForm(int[] A, int K) {

        if (A == null || A.length <= 0) {
            return null;
        }
        if (K < 0) {
            return null;
        }

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            K += A[i] * Math.pow(10, A.length - i - 1);
        }

        while (K > 9) {
            arrayList.add(K % 10);
            K = K / 10;
        }
        arrayList.add(K);

        Collections.reverse(arrayList);

        return arrayList;
    }

    public List<Integer> addToArrayForm1(int[] A, int K) {
        if (A == null || A.length <= 0) {
            return null;
        }
        if (K < 0) {
            return null;
        }
        List<Integer> arrayList = new ArrayList<>();
        int size = A.length;
        int cur = K;
        int i = size - 1;
        while (i >= 0 || cur > 0) {
            if (i >= 0) {
                cur += A[i];
            }
            arrayList.add(cur % 10);
            cur /= 10;
            i--;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}


