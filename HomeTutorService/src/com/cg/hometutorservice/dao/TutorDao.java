package com.cg.hometutorservice.dao;

import java.util.List;

import com.cg.hometutorservice.dto.Address;
import com.cg.hometutorservice.dto.Trainee;
import com.cg.hometutorservice.dto.Tutor;
import com.cg.hometutorservice.exception.TutorException;

public interface TutorDao {
	public Tutor save(Tutor tutor);
	public List<Trainee> findTraineeByTutorId(int tutorId) ;
	public Trainee registerTrainee(int tutorId,String traineeName,Address traineeAddress);

}
