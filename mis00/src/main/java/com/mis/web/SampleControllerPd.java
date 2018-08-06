package com.mis.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mis.domain.ProductVO;

@Controller
public class SampleControllerPd {

	private static final Logger logger = LoggerFactory.getLogger(SampleControllerPd.class);

	@RequestMapping("doPd")
	public String doPd(Model model) {
		logger.info("doPd called.........");
		ProductVO product = new ProductVO("Ã»¹ÙÁö", 10000, 100, 20);
		
		model.addAttribute(product);
		
		return "productDetail2";
	}
}
