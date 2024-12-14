package lesson11.Prob1;

import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> data = new HashMap<>();

        for (Student s : students) {
            Key k = new Key(s.getFirstName(), s.getLastName());

            data.put(k, s);
        }

        return data;
    }
}
