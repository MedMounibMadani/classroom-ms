package com.schoolapp.classroomms.repositories;

import com.schoolapp.classroomms.models.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassRoomRepository extends JpaRepository<ClassRoom, Integer> {
    List<ClassRoom> findAllBySchoolId(Integer schoolId);
}
