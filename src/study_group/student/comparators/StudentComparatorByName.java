package study_group.student.comparators;

import study_group.student.Student;
import study_group.study_group.ItemStudyGroup;

import java.util.Comparator;

public class StudentComparatorByName<E extends ItemStudyGroup> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}