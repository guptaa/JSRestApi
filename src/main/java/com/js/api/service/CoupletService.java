package com.js.api.service;

import java.util.List;

import com.js.api.domain.Couplet;

public interface CoupletService {
	public List<Couplet> listAllCouplets();
	public List<Couplet> listAllCoupletsFromAPoem(Integer Id);

}
