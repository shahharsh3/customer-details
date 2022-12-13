package com.project.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.customer.dto.PlanDTO;

@Service
public class CustHystricService {

	@Autowired
	RestTemplate template;
	
	public PlanDTO getSpecificPlan(int planId) {
		return template.getForObject("http://PlanMS"+"/plans/"+planId, PlanDTO.class);
	}
	
	public List<Long> getFriends(long phoneNo){
		return template.getForObject("http://FriendMS"+"/customers/"+phoneNo+"/friends", List.class);
	}
}
