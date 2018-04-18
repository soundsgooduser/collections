package collections.immutable.examples;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;

import static java.lang.System.out;

public class Example3 {

    public static void main(String[] args) {
        guavaBuilders();
    }

    public static void guavaBuilders() {

        final ImmutableMap<String, String> languageStrings =
                ImmutableMap.<String, String>builder().put("USA", "US")
                        .put("Canada", "CA")
                        .put("Mexico", "MEX")
                        .build();
        out.println("Languages Map: " + languageStrings);

        final ImmutableSet<String> states =
                ImmutableSet.<String>builder().add("Arizona")
                        .add("Colorado")
                        .add("Wyoming").build();
        out.println("States: " + states);

        final ImmutableList<String> cities =
                ImmutableList.<String>builder().add("Boston")
                        .add("Colorado Springs")
                        .add("Denver")
                        .build();
        out.println("Cities: " + cities);

        final ImmutableMultimap<String, String> multimapLanguages =
                ImmutableMultimap.<String, String>builder().put("C", "C")
                        .put("C", "C++")
                        .put("C", "C#")
                        .put("P", "Pascal")
                        .put("P", "Perl")
                        .put("S", "Scala").build();
        out.println("Languages: " + multimapLanguages);
    }
}
