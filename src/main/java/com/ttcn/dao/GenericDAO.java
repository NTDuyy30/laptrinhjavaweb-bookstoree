package com.ttcn.dao;

import java.util.List;

import com.ttcn.mapper.RowMapper;

public interface GenericDAO<T> {
	List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);

	Long insert(String sql, Object... parameters);

	void update_delete(String sql, Object... parameters);
	
	int count(String sql, Object... parameters);
}
