package collections.immutable.examples;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class Example2 {

    public static void main(final String[] arguments) {
        guavaImmutableList();
        jdkUnmodifiableList();
    }

    /**
     * Guava's ImmutableList.
     */
    public static void guavaImmutableList() {
        print("Guava's ImmutableList");
        final List<String> originalList = buildList();
        final ImmutableList<String> immutableList = ImmutableList.copyOf(originalList);
        out.println("Immutable List of Strings: " + immutableList);
        originalList.remove("CA");
        out.println("Original List of Strings: " + originalList);
        out.println("Immutable List of Strings: " + immutableList);
    }

    /**
     * JDK's UnmodifiableList.
     */
    public static void jdkUnmodifiableList() {
        print("JDK unmodifiableList");
        final List<String> originalList = buildList();
        final List<String> unmodifiableList = Collections.unmodifiableList(originalList);
        out.println("Unmodifiable List of Strings: " + unmodifiableList);
        originalList.remove("CA");
        out.println("Original List of Strings: " + originalList);
        out.println("Unmodifiable List of Strings: " + unmodifiableList);
    }

    public static void print(final String text) {
        System.out.println();
        out.println(">>>> " + text + " <<<<");
    }

    private static List<String> buildList() {
        final List<String> result = new ArrayList<String>();
        result.add("US");
        result.add("CA");
        result.add("MEX");
        return result;
    }
}
