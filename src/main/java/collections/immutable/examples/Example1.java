package collections.immutable.examples;

import collections.immutable.model.Test;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.ListUtils;

import java.util.Collections;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        testUnmodifiableAndImmutableLists();
        System.out.println();
        testReverse();
    }

    public static void testUnmodifiableAndImmutableLists() {
        List<Test> unmodifiableList = Collections.unmodifiableList(Lists.newArrayList(new Test("1"),
                new Test("2"), new Test("3")));
        System.out.println(">>>> TEST unmodifiableList JDK Collections<<<<");
        test(unmodifiableList);

        System.out.println();

        List<Test> immutableList = ImmutableList.of(new Test("1"), new Test("2"), new Test("3"));
        System.out.println(">>>> TEST immutableList Guava <<<<");
        test(immutableList);

        System.out.println();

        List<Test> unmodifiableListApache = ListUtils.unmodifiableList(Lists.newArrayList(new Test("1"),
                new Test("2"), new Test("3")));
        System.out.println(">>>> TEST unmodifiableListApache <<<<");
        test(unmodifiableListApache);
    }

    public static void testReverse() {
        System.out.println(">>>> TEST reverse <<<<");
        ImmutableList<Integer> original = ImmutableList.of(1, 2, 3);
        System.out.println(original);
        ImmutableList<Integer> reversed = original.reverse();
        System.out.println(reversed);
        System.out.println(reversed == original);
    }

    private static void test(List<Test> tests) {
        System.out.println(tests);
        try {
            tests.add(new Test("4")); // UnsupportedOperationException
            //tests.add(1, new Test("4")); // UnsupportedOperationException
            //tests.remove(0); // UnsupportedOperationException
            //tests.clear(); // UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException");
        }
        Test test = tests.get(0);
        test.setName("111111111");
        System.out.println(tests);
    }
}
