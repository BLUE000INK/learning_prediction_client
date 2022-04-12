package com.example.learning_prediction_client.mapper;

import com.example.learning_prediction_client.entity.MoocData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoocDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MoocData record);

    int insertSelective(MoocData record);

    MoocData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MoocData record);

    int updateByPrimaryKey(MoocData record);

    List<MoocData> getAllData();
}
