package org.example.Model;

import java.util.List;

public interface TeachGroupService {

    TeachGroup create (Teacher teacher, List<Student> students);
    List<TeachGroup> read (List<TeachGroup> teachGroups);

}
