package com.schoolapp.classroomms.services;

import com.schoolapp.classroomms.models.ClassRoom;
import com.schoolapp.classroomms.repositories.ClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {
    @Autowired
    private ClassRoomRepository classRoomRepository;

    public ClassRoom save(ClassRoom classRoom){
        return classRoomRepository.save(classRoom);
    }
    public List<ClassRoom> getAll(){
        return classRoomRepository.findAll();
    }
    public List<ClassRoom> getAllBySchoolId(Integer schoolId){
        return classRoomRepository.findAllBySchoolId(schoolId);
    }
}
