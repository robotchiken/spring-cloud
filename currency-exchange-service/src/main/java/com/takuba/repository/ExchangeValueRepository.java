package com.takuba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.takuba.controller.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from,String to);
}
