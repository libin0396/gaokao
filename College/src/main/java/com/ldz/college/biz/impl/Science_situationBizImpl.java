package com.ldz.college.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ldz.college.biz.IScience_situationBiz;
import com.ldz.college.mapper.IScience_situationMapper;

@Service
public class Science_situationBizImpl implements IScience_situationBiz {
	@Autowired
	private IScience_situationMapper science_situationMapper;

	@Transactional
	@Override
	public List<Map<String, Object>> locationRank(Map<String, Object> map) {
		return science_situationMapper.locationRank(map);
	}

	@Transactional
	@Override
	public List<Map<String, Object>> majorRank(Map<String, Object> map) {
		return science_situationMapper.majorRank(map);
	}

	@Transactional
	@Override
	public List<Map<String, Object>> schoolRank(Map<String, Object> map) {
		return science_situationMapper.schoolRank(map);
	}

}
