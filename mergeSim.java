/*
2363. Merge Similar Items
You are given two 2D integer arrays, items1 and items2, representing two sets of items. Each array items has the following properties:

items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
The value of each item in items is unique.
Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti being the sum of weights of all items with value valuei.

Note: ret should be returned in ascending order by value.
*/

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int l1 = items1.length;
        int l2 = items2.length;

        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        for (int i = 0; i < l1; i++) {
            tmap.put(items1[i][0], tmap.getOrDefault(items1[i][0], 0) + items1[i][1]);
        }

        for (int i = 0; i < l2; i++) {
            tmap.put(items2[i][0], tmap.getOrDefault(items2[i][0], 0) + items2[i][1]);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int value : tmap.keySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(value);
            list.add(tmap.get(value));
            ans.add(list);
        }

        return ans;
    }
}
