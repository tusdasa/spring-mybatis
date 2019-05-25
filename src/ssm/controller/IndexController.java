package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ssm.service.UserService;
import ssm.utils.PageUtils;

@Controller
@RequestMapping(value = "/")
public class IndexController {

	@Autowired
	UserService userService;

	public IndexController() {
	}

	@RequestMapping(value = "/index")
	public String IndexView(Model model,
			@RequestParam(name = "page", defaultValue = "0", required = false) String page) {

		Integer p = Integer.valueOf(page);

		model.addAttribute("users", userService.findAllByPage(p * 6, PageUtils.pagesize));
		model.addAttribute("page", PageUtils.getPagetoal(userService.count(), PageUtils.pagesize));
		
		return "index";
	}

}
