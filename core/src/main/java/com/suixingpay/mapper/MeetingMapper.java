package com.suixingpay.mapper;

import com.suixingpay.pojo.Meeting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author zhangleying
 * @version 1.0
 * @date 2019/12/18 15:33
 */
@Mapper
public interface MeetingMapper {
    //插入一条会议
    Integer insertMeeting(Meeting meeting);

    // 获取我的可报名的会议
    List<Meeting> getListForFrontShow(@Param("nowDate") Date nowDate);
}