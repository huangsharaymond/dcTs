package com.duplicall.dao.mapper;

import java.sql.ResultSet;

import com.duplicall.dao.common.IRowMapper;
import com.duplicall.entities.CallDetail;

public class CallDetailMapper implements IRowMapper<CallDetail> {
    
    @Override
    public CallDetail getResults(ResultSet rs)
        throws Exception
    {
        CallDetail calldetail = new CallDetail();
        calldetail.setAgent(rs.getString("agent"));
        calldetail.setUcid(rs.getLong("ucid"));
        calldetail.setCreateTime(rs.getString("createtime"));
        calldetail.setCallId(rs.getLong("callid"));
        calldetail.setCallingParty(rs.getString("calling"));
        calldetail.setCalledParty("called");
        calldetail.setAnsweringParty("answer");
        calldetail.setOrigCalling("origcalling");
        calldetail.setType("type");
        calldetail.setExtention(rs.getString("extension"));
        calldetail.setLastDirection(rs.getString("lastDirection"));
        calldetail.setSkill(rs.getString("skill"));
        calldetail.setTrunk(rs.getString("trunk"));
        calldetail.setRingTime(rs.getString("ringtime"));
        calldetail.setDialedTime(rs.getString("dialedtime"));
        calldetail.setEstablishTime(rs.getString("establishtime"));
        calldetail.setEndTime(rs.getString("endtime"));
        calldetail.setUui(rs.getString("uui"));
        calldetail.setNgpUserId(rs.getString("agentname"));
        return calldetail;
    }
    
}
