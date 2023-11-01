package com.java.FREEGO.dao;

import java.util.List;
import java.util.Map;

import com.java.FREEGO.domain.FreelanceCareerDto;
import com.java.FREEGO.domain.FreelanceCommonDto;
import com.java.FREEGO.domain.FreelanceDto;
import com.java.FREEGO.domain.FreelanceRateDto;
import com.java.FREEGO.domain.FreelanceSkillDto;
import com.java.FREEGO.domain.SearchCondition;

public interface FreelanceDao {
	
	
	List<FreelanceDto> selectAll(SearchCondition sc);
	
	int searchResultCnt(SearchCondition sc);
	
	List<FreelanceRateDto> getRateList(int freelance_id);
	
	int getFreeCount();
	
    int insertRate(FreelanceRateDto dto);
    
    List<FreelanceSkillDto> getFreelanceSkill();
    
    Map<String, Object> selectSkillCount();
    
    List<FreelanceDto> selectSkillDetail(FreelanceDto dto);
    
    List<FreelanceDto> selectListSkill(int freelance_id);
    
    FreelanceDto getFreeUpdate(int freelance_id);
    
    int freeUpdate(FreelanceDto dto);
    
    List<FreelanceCareerDto> getFreeCareer(int freelance_id);
    
    int insertCareer(FreelanceCareerDto dto);
    
    int deleteCareer(int id);
    
    int updateCareer(FreelanceCareerDto dto);
    
    FreelanceDto checkProfileUpload(int id);
    
    List<FreelanceSkillDto> getSkill();
    
    List<FreelanceSkillDto> getSkillSelect(int freelance_id);
    
    int deleteFreeSkill(int freelance_id);
    
    int insertFreeSkill(FreelanceSkillDto dto);
    
	FreelanceDto getOnlySkills(int id);
	
	int deleteFreelance(int id);
	
	List<FreelanceCommonDto> freeTask();
}
