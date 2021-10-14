package com.example.demo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/data-target-types")
	public String hello() {
		JSONObject json = TargetType.getAllTypes();
		JSONArray jsonArray = json.getJSONArray("data");

		String accountid = null;

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject data = jsonArray.getJSONObject(i);
			JSONObject aux1 = (JSONObject) data.get("type");
			accountid = aux1.getString("id");
		}

		return accountid;
	}
	public void hola(TargetHeader target) {
		target.getName();
	}
	
}
