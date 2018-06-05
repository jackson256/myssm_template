package com.hudson.ssm.dao;

import java.util.List;

import com.hudson.ssm.domain.Flow;

/**
 * 
 * @className: FlowDao
 * @Description:
 * @author: hudson
 * @date: 2018年6月2日 下午11:20:21
 * @version: 1.0
 */
public interface FlowDao {

	Flow selectFlowByFlowName(String flowName);

	//List<Flow> selectAllFlow();

}
