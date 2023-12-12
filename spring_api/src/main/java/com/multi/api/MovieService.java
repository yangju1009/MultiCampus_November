package com.multi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class MovieService {
	
	@Autowired
	MovieDAO movieDAO;
	
	@RequestMapping("movie")
	public void insert(MovieVO movieVO) {
		//전처리할 것이 있으면 진행하기
		movieDAO.insert(movieVO);
	}
}
