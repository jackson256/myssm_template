package com.hudson.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hudson.ssm.domain.Flow;
import com.hudson.ssm.service.FlowService;

@Controller()
@RequestMapping("/flow")
public class FlowController extends BaseController{
	
	@Autowired
	FlowService flowService;
	
	@RequestMapping(value="/getFlowByName.do", method=RequestMethod.GET)
	@ResponseBody
	public String getFlowByFlownameGet(@RequestParam("flowName") String flowName){
		System.out.println("get request");
		Flow flow = flowService.selectFlowByFlowName(flowName);
		return responseSuccess(flow);
	}
	
	@RequestMapping(value="/getFlowByName.do", method=RequestMethod.POST)
	@ResponseBody
	public String getFlowByFlownamePost(@RequestParam(value="flowName",required=true,defaultValue="KaYRoUFqPdXALcgzcMFO") String flowName){
		System.out.println("post request");
		Flow flow = flowService.selectFlowByFlowName(flowName);
		return responseSuccess(flow);
	}

}
