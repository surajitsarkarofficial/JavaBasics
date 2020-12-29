package com.learning.collection.comparator;

import java.util.Comparator;

public class RnoComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        if(s1.rno >s2.rno)
        {
            return 1;
        }else if(s1.rno==s2.rno)
        {
            return 0;
        }else{
            return -1;
        }

    }
}
