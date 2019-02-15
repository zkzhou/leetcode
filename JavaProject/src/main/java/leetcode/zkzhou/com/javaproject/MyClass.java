package leetcode.zkzhou.com.javaproject;

import solution.ArrayForm;
import solution.OneEditDistance;
import solution.OriginalDigits;
import solution.ShortestWordDistanceII;

public class MyClass {
    public static void main(String[] args) {
        OneEditDistance oneEditDistance = new OneEditDistance();
        System.out.print("OneEditDistance: " + oneEditDistance.isOneEditDistance("ad","add") + "\n");
        OriginalDigits originalDigits = new OriginalDigits();
        System.out.print("OriginalDigits: " + originalDigits.originalDigits("owoztneoersadfljasiewjafoi") + "\n");
        ShortestWordDistanceII shortestWordDistanceII = new ShortestWordDistanceII(new String[]{"practice", "makes", "perfect", "coding", "makes"});
        System.out.print("ShortestWordDistanceII: " + shortestWordDistanceII.getShortestDistance("coding","makes") + "\n");
        ArrayForm arrayForm = new ArrayForm();
        System.out.print("ArrayForm: " + arrayForm.addToArrayForm(new int[]{2,1,5},8060) + "\n");
        System.out.print("ArrayForm: " + arrayForm.addToArrayForm1(new int[]{2,1,5},8060) + "\n");
    }
}
