package com.cg.hometutorservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hometutorservice.dao.TutorDao;
import com.cg.hometutorservice.dao.TutorDaoImpl;
import com.cg.hometutorservice.dto.Address;
import com.cg.hometutorservice.dto.Trainee;
import com.cg.hometutorservice.dto.Tutor;
import com.cg.hometutorservice.exception.TutorException;
@Service
@Transactional
public class TutorServiceImpl implements TutorService{
	  @Autowired
	  TutorDao dao;
	  
	public Tutor addTutor(Tutor tutor) {
		return dao.save(tutor);
	}

	public Trainee registerTrainee(int tutorId, String traineeName, Address traineeAddress) {
		// TODO Auto-generated method stub
		return  dao.registerTrainee(tutorId, traineeName, traineeAddress);
	}

	public List<Trainee> searchTraineeByTutorId(int tutorId) {
		// TODO Auto-generated method stub
		return dao.findTraineeByTutorId(tutorId);
	}
	

}
