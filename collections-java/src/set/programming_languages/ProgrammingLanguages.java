package set.programming_languages;

import set.programming_languages.comparators.IdeComparator;
import set.programming_languages.comparators.NameYearAndIdeComparator;
import set.programming_languages.comparators.YearAndNameComparator;
import set.programming_languages.models.FavoriteLang;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgrammingLanguages {
    public static void solve() {
        Set<FavoriteLang> favoriteLangs = new LinkedHashSet<>();
        Collections.addAll(favoriteLangs,
            new FavoriteLang("Python", 1991, "VsCode"),
            new FavoriteLang("Dart", 2011, "VsCode"),
            new FavoriteLang("Java", 1995, "IntelliJ")
        );
        System.out.println("Linguagens de programação:");
        System.out.println(favoriteLangs);

        System.out.println("Linguagens de programação ordenadas por nome:");
        Set<FavoriteLang> sortedByName = new TreeSet<>(favoriteLangs);
        System.out.println(sortedByName);

        System.out.println("Linguagens de programação ordenadas por IDE:");
        Set<FavoriteLang> sortedByIde = new TreeSet<>(new IdeComparator());
        sortedByIde.addAll(favoriteLangs);
        System.out.println(sortedByIde);

        System.out.println("Linguagens de programação ordenadas por ano de criação e nome:");
        Set<FavoriteLang> sortedByYearAndName = new TreeSet<>(new YearAndNameComparator());
        sortedByYearAndName.addAll(favoriteLangs);
        System.out.println(sortedByYearAndName);

        System.out.println("Linguagens de programação ordenadas por nome, ano de criação e IDE:");
        Set<FavoriteLang> sortedByNameYearAndIde = new TreeSet<>(new NameYearAndIdeComparator());
        sortedByNameYearAndIde.addAll(favoriteLangs);
        System.out.println(sortedByNameYearAndIde);
    }
}
