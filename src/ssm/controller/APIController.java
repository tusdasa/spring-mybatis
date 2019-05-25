package ssm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.domain.User;
import ssm.service.UserService;

@Controller
@RequestMapping(value = "/api")
public class APIController {

	@Autowired
	UserService userService;

	public APIController() {
	}

	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Map<String, Integer> addUser(@RequestBody User user) {

		Map<String, Integer> result = new HashMap<>();

		if (userService.addUser(user)) {
			result.put("status", 200);
		} else {
			result.put("status", 500);
		}

		return result;
	}

	@ResponseBody
	@RequestMapping(value = "/del", method = RequestMethod.GET)
	public Map<String, Integer> delUser(@RequestParam(name = "uid") String value) {
		Map<String, Integer> result = new HashMap<>();

		try {
			Integer uid = Integer.valueOf(value);
			if (userService.delUser(uid)) {
				result.put("status", 200);
			} else {
				result.put("status", 500);
			}
		} catch (Exception e) {
			result.put("status", 500);
		}
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User getUser(@RequestParam(name = "uid") String value) {
		try {
			Integer i = Integer.valueOf(value);
			return userService.findUserById(i);
		}catch (Exception e) {
			return null;
		}
		
	}
	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Map<String, Integer> updateUser(@RequestBody User user){
		Map<String, Integer> result = new HashMap<>();
		if (userService.updateUser(user)) {
			result.put("status", 200);
		} else {
			result.put("status", 500);
		}
		return result;
	}

}
