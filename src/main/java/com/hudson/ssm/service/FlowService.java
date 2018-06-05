package com.hudson.ssm.service;

import com.hudson.ssm.domain.Flow;

public interface FlowService {
	
	Flow selectFlowByFlowName(String flowName);

}
