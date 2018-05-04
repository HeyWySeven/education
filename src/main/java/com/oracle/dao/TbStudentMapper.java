package com.oracle.dao;

import com.oracle.vo.TbStudent;
import com.oracle.vo.TbStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbStudentMapper {
    long countByExample(TbStudentExample example);

    int deleteByExample(TbStudentExample example);

    int deleteByPrimaryKey(Integer stuid);

    int insert(TbStudent record);

    int insertSelective(TbStudent record);

    List<TbStudent> selectByExample(TbStudentExample example);

    TbStudent selectByPrimaryKey(Integer stuid);

    int updateByExampleSelective(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    int updateByExample(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    int updateByPrimaryKeySelective(TbStudent record);

    int updateByPrimaryKey(TbStudent record);
}