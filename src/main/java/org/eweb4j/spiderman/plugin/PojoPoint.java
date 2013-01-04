package org.eweb4j.spiderman.plugin;

import java.util.List;
import java.util.Map;

import org.eweb4j.spiderman.spider.SpiderListener;

/**
 * TODO
 * @author weiwei l.weiwei@163.com
 * @date 2013-1-2 下午07:01:00
 */
public interface PojoPoint {

	void init(Class<?> mappingClass, List<Map<String, Object>> models, SpiderListener listener);

	List<Object> mapping(List<Object> pojo);

}