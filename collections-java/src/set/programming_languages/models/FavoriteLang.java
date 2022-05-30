package set.programming_languages.models;

import java.util.Objects;

public class FavoriteLang implements Comparable<FavoriteLang> {
    private final String name;
    private final int yearOfCreation;
    private final String ide;

    public FavoriteLang(String name, int yearOfCreation, String ide) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.ide = ide;
    }

    public String getName() {
        return name;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteLang that = (FavoriteLang) o;
        return yearOfCreation == that.yearOfCreation && name.equals(that.name) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfCreation, ide);
    }

    @Override
    public int compareTo(FavoriteLang favoriteLang) {
        return this.getName().compareToIgnoreCase(favoriteLang.getName());
    }
}

