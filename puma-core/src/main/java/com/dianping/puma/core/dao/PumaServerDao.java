package com.dianping.puma.core.dao;

import com.dianping.puma.core.entity.PumaServer;

import java.util.List;

public interface PumaServerDao {

	PumaServer find(String id);

	PumaServer findByHostAndPort(String host, Integer port);

	List<PumaServer> findAll();

	void create(PumaServer entity);

	void update(PumaServer entity);

	void remove(String id);
}