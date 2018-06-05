package com.hudson.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hudson.ssm.dao.FlowDao;
import com.hudson.ssm.domain.Flow;

@Service
public class FlowServiceImpl implements FlowService{
	
	@Autowired
	private FlowDao flowDao;

	public Flow selectFlowByFlowName(String flowName) {
		return flowDao.selectFlowByFlowName(flowName);
	}

}
