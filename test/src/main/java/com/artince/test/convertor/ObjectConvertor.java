package com.artince.test.convertor;

import com.artince.test.dto.UserDto;
import com.artince.test.entity.User;

public class ObjectConvertor {

	public static User convertToUser(UserDto dto) {
		User user = null;
		if(dto!=null) {
			user = new User();
			user.setId(dto.getId());
			user.setName(dto.getName());
			user.setEmpId(dto.getEmpId());
			user.setEmail(dto.getEmail());
			user.setMobNumber(dto.getMobNumber());
		}
		return user;
	}
	
	public static UserDto convertToUserDto(User entity) {
		UserDto dto = null;
		if(entity!=null) {
			dto = new UserDto();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setEmpId(entity.getEmpId());
			dto.setEmail(entity.getEmail());
			dto.setMobNumber(entity.getMobNumber());
		}
		return dto;
	}
}
