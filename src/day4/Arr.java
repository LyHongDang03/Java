package day4;

import java.util.*;

public class Arr {
    public int[] remove(int[] arr, int key) {
        int count = 0;
        for (int j : arr) {
            if (j != key) {
                count++;   // 1 2 3
            }
        }
        int[] newArr = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public int[] add(int[] arr, int key, int map) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == map) {
                newArr[i] = key;
            } else {
                newArr[i] = arr[j++]; // thêm vào mảng mới
            }
        }
        return newArr;
    }

    public int[] removeEl(int[] arr) {
        Set<Integer> setArr = new HashSet<>();
        for (int j : arr) {
            setArr.add(j);
        }
        int[] newArr = new int[setArr.size()];
        int index = 0;
        for (int k : setArr) {
            newArr[index++] = k;
        }
        return newArr;
    }

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public boolean check(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] returnCheck(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int j : arr) {
            if (check(j)) {
                arrList.add(j);
            }
        }
        int[] newArr = new int[arrList.size()];
        int index = 0;
        for (int i : arrList) {
            newArr[index++] = i;
        }
        return newArr;
    }

    public int[] checkCl(int[] a) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int j : a) {
            if (j % 2 == 0) {
                arrList.add(j);
            }
        }
        int[] newArr = new int[arrList.size()];
        int index = 0;
        for (int i : arrList) {
            newArr[index++] = i;
        }
        return newArr;
    }

    // 1 2 3 4 - 20 12 8 4
    public int[] testHbLab(int[] a) {
        int[] newArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int kq = 1;
            for (int j = 0; j < a.length; j++) {
                if(i != j){
                    kq = kq * a[j];
                }
                newArr[i] = kq;
            }
        }
        return newArr;
    }
    public void count(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1); // 11
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
