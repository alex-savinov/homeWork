package family_tree.model.family_tree.comparators;

import family_tree.model.family_tree.ItemFamilyTree;

import java.util.Comparator;

public class ComparatorByBirthDate<T extends ItemFamilyTree> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
