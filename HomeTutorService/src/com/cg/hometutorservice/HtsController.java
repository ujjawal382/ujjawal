package com.cg.hometutorservice;
import com.cg.hometutorservice.dto.Address;
import com.cg.hometutorservice.dto.Trainee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hometutorservice.dto.Tutor;
import com.cg.hometutorservice.service.TutorService;

@Controller
public class HtsController {
	@Autowired
	TutorService tutorservice;
	@GetMapping("home")
	public ModelAndView homePage()
	{
		return new ModelAndView("homepage");
	}
	
	@GetMapping("addtutor")
	public ModelAndView getAddTutor(@ModelAttribute("tutor") Tutor tutor)
	{
		return new ModelAndView("addtutor");
		
	}
	@PostMapping("addTutor")
	public ModelAndView AddTutor(@ModelAttribute("tutor") Tutor tutor)
	{
		Tutor addtutor=tutorservice.addTutor(tutor);
		return new ModelAndView("sucess","key",addtutor);
		
	}
	@GetMapping("registertrainee")
	public ModelAndView getRegisterTrainee(@ModelAttribute("trainee") Trainee trainee)
	{
		return new ModelAndView("registertrainee");
	}
   @PostMapping("registerTrainee")
	public ModelAndView RegisterTrainee(@ModelAttribute("traineedetail") Trainee trainee,@RequestParam("tutor_id") String id)
	{    int tutorid=Integer.parseInt(id);
	     String name=trainee.getName();
	     Address addr=trainee.getAddress();
		System.out.println(trainee.getAddress().getHouse_no());
		Trainee registertrainee=tutorservice.registerTrainee(tutorid,name,addr);
		
		return new ModelAndView("sucesstrainee","key",registertrainee);
	}
   @GetMapping("searchtrainee")
   public ModelAndView getSearchTrainee(@ModelAttribute("searchtrainee") Trainee trainee) {
	return new ModelAndView("Searchtrainee");
	   
   }
   @PostMapping("searchTrainee")
   public ModelAndView SearchTrainee(@ModelAttribute("searchtrainee") Trainee trainee,@RequestParam("id") int tutor_id)
   {
	  List<Trainee> traineelist; 
	  traineelist=tutorservice.searchTraineeByTutorId(tutor_id);
	 

	return new ModelAndView("sucesssearch","key",traineelist);
	   
   }
   
	

}
