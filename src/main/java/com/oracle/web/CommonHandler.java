package com.oracle.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.service.CommonService;

@Controller
public class CommonHandler {
	
	@Autowired
	CommonService commonService;
	
	//利用PathVariable传参
	//produces设置该方法不返回Jason，而是返回html
	@ResponseBody
	@RequestMapping(value="/getState/{type}/{stateId}",produces="text/html;charset=UTF-8")
	public String getSubject(@PathVariable("type") Integer type,@PathVariable("stateId") Integer stateId){
		//调用CommonService
		String str=commonService.getState(type, stateId);
		return str;
		
	}

	@ResponseBody
	@RequestMapping(value="/getTeacher/{state}/{teacherid}",produces="text/html;charset=UTF-8")
	public String getTeacher(@PathVariable("state") Integer state,@PathVariable("teacherid") Integer teacherid){
		//调用CommonService
		String str=commonService.getTeacher(state, teacherid);
		return str;
		
	}
	
	@ResponseBody
	@RequestMapping(value="/getGuide/{state}/{guideid}",produces="text/html;charset=UTF-8")
	public String getGuide1(@PathVariable("state") Integer state,@PathVariable("guideid") Integer guideid){
		//调用CommonService
		String str=commonService.getGuide(state, guideid);
		return str;
		
	}
}
