package demo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        List<Integer> open = Arrays.asList(1,1,1,1,4,4);

        List<Integer> special = Arrays.asList();

        List<Integer> resultAreaIds = new ArrayList<>();
        resultAreaIds.addAll(open);
        resultAreaIds.addAll(special);

        System.out.println(resultAreaIds);
    }
}
