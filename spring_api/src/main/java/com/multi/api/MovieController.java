package com.multi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieService movieservice;
	
	@RequestMapping("movie")
	public void insert(MovieVO movieVO) {
		//전처리한다음에
		//db처리함.
		//views/movie.jsp로 이동함
		movieservice.insert(movieVO);
	}
}
