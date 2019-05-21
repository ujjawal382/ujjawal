package com.cg.hometutorservice.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.hometutorservice.dto.Address;
import com.cg.hometutorservice.dto.Trainee;
import com.cg.hometutorservice.dto.Tutor;
import com.cg.hometutorservice.exception.TutorException;
@Repository
public class TutorDaoImpl implements TutorDao{
	static List<Tutor> tutorData;
	public TutorDaoImpl() {
	
		tutorData = new ArrayList<Tutor>();
	}
	
	@PersistenceContext
    EntityManager entitymanager;
	@Override
	public Tutor save(Tutor tutor) {
		
		entitymanager.persist(tutor);
		entitymanager.flush();
		return tutor;
	}

	@Override
	public List<Trainee> findTraineeByTutorId(int tutorId) {
		List<Trainee> traineeList = new ArrayList<Trainee>();

		Tutor tut;
		tut = entitymanager.find(Tutor.class, tutorId);
		if (tut.getId() == tutorId) {
			traineeList = tut.getTrainee();
			return traineeList;
		} else 
		{
			return null;
		}
	}

	@Override
	public Trainee registerTrainee(int tutorId, String traineeName, Address traineeAddress) {
		Tutor tut;
		tut = entitymanager.find(Tutor.class, tutorId);
		
		
		List<Trainee> traineeList = new ArrayList<Trainee>();
		
		Trainee trainee = new Trainee();
		trainee.setName(traineeName);
		trainee.setAddress(traineeAddress);
		
		traineeList = tut.getTrainee();
		traineeList.add(trainee);
		tut.setTrainee(traineeList);
		
		entitymanager.persist(tut);
		entitymanager.flush();
	
		return trainee;
	}



}
