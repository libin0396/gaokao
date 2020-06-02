package com.ldz.college.biz;

import java.util.List;
import java.util.Map;

public interface ILiberalarts_situationBiz {
	/**
	 * 地域优先算法
	 * @param map
	 * @return
	 */
	public List<Map<String, Object>> locationRank(Map<String, Object> map);
	
	/**
	 * 专业优先算法
	 * @param map
	 * @return
	 */
	public List<Map<String, Object>> majorRank(Map<String, Object> map);
	
	/**
	 * 学校优先算法
	 * @param map
	 * @return
	 */
	public List<Map<String, Object>> schoolRank(Map<String, Object> map);
	
	/**
	 * 以位置权重扩展的学校
	 * @param map
	 * @return
	 */
	public List<Map<String, Object>> locationRankExtensionSchool(Map<String, Object> map);
	
	/**
	 * 以专业权重扩展的学校
	 * @param map
	 * @return
	 */
	public List<Map<String, Object>> majorRankExtensionSchool(Map<String, Object> map);
	
	/**
	 * 以学校权重扩展的学校
	 * @param map
	 * @return
	 */
	public List<Map<String, Object>> schoolRankExtensionSchool(Map<String, Object> map);
}
