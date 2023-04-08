package com.baijinjing;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        String[] split = str.split(",");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        System.out.println(func(arr));
    }
    public static boolean func(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        ArrayList list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                Integer value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            if (entry.getValue() == 1)
                list.add(entry.getKey());
        }
        Collections.sort(list);
        int target = -1;
        if (list.size()==0) {
            System.out.println(target);
            return false;
        }
        target = (int) list.get(list.size() - 1);
        System.out.println(target);
            return true;
    }
}
