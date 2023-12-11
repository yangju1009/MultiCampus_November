package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 컬렉션구분 {

    public static void main(String[] args) {
        // 중복 제거된 컬렉션 ==> set
        HashSet<Object> bag = new HashSet<>();
        bag.add("휴지"); // element(요소)
        bag.add(1000);
        bag.add(1000);
        System.out.println(bag);
        System.out.println(bag.size());

        ArrayList<Object> list = new ArrayList<>();
        list.add("코딩수업"); // Object <-- String
        list.add(2);
        System.out.println(list);
        String s = (String) list.get(0); // String <-- Object
        int time = (int) list.get(1);
        System.out.println(time + 1);

        // <타입클래스명>는 객체 생성할 때 결정 가능!
        ArrayList<String> name = new ArrayList<>();
        name.add("홍길동");
        name.add("김길동");
        String s2 = name.get(0);

        ArrayList<Integer> food = new ArrayList<>();
        food.add(18000);
        food.add(12000);
        int in = food.get(0);
        food.add(0, 10000); // 오버로딩(다형성)
        boolean result = food.contains(12000);
        System.out.println(result);
        int in2 = food.indexOf(12000);
        System.out.println(in2);
        food.clear();
        System.out.println(food);

        boolean result2 = food.isEmpty();
        System.out.println(result2);
        int in3 = food.lastIndexOf(10000);
        System.out.println(in3);
        food.add(11000);
        food.set(0, 11000);
        System.out.println(food);
        Object[] arr = food.toArray();
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
