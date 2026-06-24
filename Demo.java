import java.util.*;

class Demo {
    public static void main(String[] args){
        System.out.println("Welcome");


        List<String> bucket = new ArrayList<>();

        bucket.add("test");
        bucket.add("test2");
        bucket.add("test3");

        for (String item: bucket){
            System.out.println(item);
        }
    }
}