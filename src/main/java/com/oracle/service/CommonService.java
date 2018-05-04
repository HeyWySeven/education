package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.TbGuideMapper;
import com.oracle.dao.TbStateMapper;
import com.oracle.dao.TbTeacherMapper;
import com.oracle.vo.TbGuide;
import com.oracle.vo.TbGuideExample;
import com.oracle.vo.TbState;
import com.oracle.vo.TbStateExample;
import com.oracle.vo.TbTeacher;
import com.oracle.vo.TbTeacherExample;

@Service
public class CommonService {
	
	@Autowired
	TbGuideMapper guideDao;
	
	@Autowired
	TbStateMapper stateDao;
	
	@Autowired
	TbTeacherMapper teacherDao;
	
	@Transactional(readOnly=true)
	public String getState(Integer type,Integer stateId){
		
		//自动生成器为每个类自动生成一个example，将查询结果进行封装
        TbStateExample e=new TbStateExample();
        //createCriteria为创建条件且支持链式编程
        e.createCriteria().andTypeEqualTo(type);
        //按字段进行排序
        e.setOrderByClause("stateName");
		List<TbState> list=stateDao.selectByExample(e);
		
	    //组装字符串<option value='stateId' selected >stateName</option>
		StringBuilder sb=new StringBuilder();
		for(TbState s:list){
			if(s.getStateid().equals(stateId)){
				sb.append("<option value="+s.getStateid()+" seleted>").append(s.getStatename()).append("</option>");
			}else{
				sb.append("<option value="+s.getStateid()+" >").append(s.getStatename()).append("</option>");
			}
		}
		
		return sb.toString();
		
	}
	
	@Transactional(readOnly=true)
	public String getTeacher(Integer state,Integer teacherid){
		TbTeacherExample e=new TbTeacherExample();
		e.createCriteria().andStateEqualTo(state);
		e.setOrderByClause("teacherId");
		List<TbTeacher> list=teacherDao.selectByExample(e);
		StringBuilder sb=new StringBuilder();
		for(TbTeacher s:list){
			if(s.getTeacherid().equals(teacherid)){
				sb.append("<option value="+s.getTeacherid()+" selected>").append(s.getName()).append("</option>");
			}else{
				sb.append("<option value="+s.getTeacherid()+" >").append(s.getName()).append("</option>");
				}
		}
		return sb.toString();
	}

	@Transactional(readOnly=true)
	public String getGuide(Integer state,Integer guideid){
		TbGuideExample e=new TbGuideExample();
		e.createCriteria().andStateEqualTo(state);
		e.setOrderByClause("guideId");
		List<TbGuide> list=guideDao.selectByExample(e);
		StringBuilder sb=new StringBuilder();
		for(TbGuide s:list){
			if(s.getGuideid().equals(guideid)){
				sb.append("<option value="+s.getGuideid()+" selected>").append(s.getName()).append("</option>");
			}else{
				sb.append("<option value="+s.getGuideid()+" >").append(s.getName()).append("</option>");
				}
		}
		return sb.toString();
	}

}
