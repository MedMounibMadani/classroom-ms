package com.schoolapp.classroomms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassRoom {
    @Id
    private Integer classId;
    private String className;
    private Integer classCapacity;
    private Integer schoolId;
}
