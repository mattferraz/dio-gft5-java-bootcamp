package set.programming_languages.comparators;

import set.programming_languages.models.FavoriteLang;

import java.util.Comparator;

public class IdeComparator implements Comparator<FavoriteLang> {
    @Override
    public int compare(FavoriteLang fl1, FavoriteLang fl2) {
        int ideFactor = fl1.getIde().compareTo(fl2.getIde());
        if (ideFactor != 0) return ideFactor;

        int nameFactor = fl1.getName().compareTo(fl2.getName());
        if (nameFactor != 0) return nameFactor;

        return Integer.compare(fl1.getYearOfCreation(), fl2.getYearOfCreation());
    }
}
