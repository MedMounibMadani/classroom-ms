package com.schoolapp.classroomms.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.schoolapp.classroomms.Component.Producer;
import com.schoolapp.classroomms.models.ClassRoom;
import com.schoolapp.classroomms.services.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/classroom")
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;

    @GetMapping
    public List<ClassRoom> fetchAll(){
        return classRoomService.getAll();
    }

    @PostMapping
    public ClassRoom save(
            @RequestBody
            ClassRoom school
    ) {
        return classRoomService.save(school);
    }
    @GetMapping("/school/{schoolId}")
    public List<ClassRoom> fetchAllBySchoolId(
            @PathVariable("schoolId") Integer schoolId
    ){
        return classRoomService.getAllBySchoolId(schoolId);
    }
}
