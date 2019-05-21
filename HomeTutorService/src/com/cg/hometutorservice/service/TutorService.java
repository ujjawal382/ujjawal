package com.cg.hometutorservice.service;

import java.util.List;

import com.cg.hometutorservice.dto.Address;
import com.cg.hometutorservice.dto.Trainee;
import com.cg.hometutorservice.dto.Tutor;
import com.cg.hometutorservice.exception.TutorException;

public interface TutorService {
	public Tutor addTutor(Tutor tutor);
	Trainee registerTrainee(int tutorId,String traineeName,Address traineeAddress);
	public List<Trainee>searchTraineeByTutorId(int tutorId);

}
