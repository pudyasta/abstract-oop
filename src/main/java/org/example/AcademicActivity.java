package org.example;

import java.util.ArrayList;

public interface AcademicActivity {
    final ArrayList<String> course = new ArrayList<>();
    void ambilCourse(String Course);
    default String[] getDefaultCourse(){
        String[] a = {"course", "summer school", "program pelatihan", "competition"};
        return a;
    }
    default int getMaxAllowedCredits(){
        return 24;
    }

    default ArrayList<String> getCourse(){
        return course;
    };
    static int calculateTotalCredits(Mahasiswas a){
        return a.getCourse().size()*2;
    }
}
