package com.artince.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artince.test.convertor.ObjectConvertor;
import com.artince.test.dto.UserDto;
import com.artince.test.entity.User;
import com.artince.test.exception.BadRequestException;
import com.artince.test.extra.BaseDto;
import com.artince.test.extra.CodeDescription;
import com.artince.test.repository.UserRepository;
import com.artince.test.validateUtil.ValidateUtil;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public BaseDto save(UserDto userDto) {
		BaseDto baseDto = new BaseDto();
		System.out.println(userDto.getId());
		try {
			ValidateUtil.notNull(userDto);
			ValidateUtil.notNull(userDto.getName());
			ValidateUtil.notNull(userDto.getEmpId());
			if(userDto.getEmail()!=null) {
				ValidateUtil.emailCheck(userDto.getEmail());
			}
			User user = ObjectConvertor.convertToUser(userDto);
			user = userRepository.save(user);
			baseDto.setResponseCode(CodeDescription.SUCCESS.getCode());
			baseDto.setResponseDescription(CodeDescription.SUCCESS.getDescription());
			baseDto.setResponseObject(user.getId());
		}catch(BadRequestException be) {
			baseDto.setResponseCode(be.getResponseCode());
			baseDto.setResponseDescription(be.getResponseDescription());
		}catch(Exception e) {
			baseDto.setResponseCode(CodeDescription.FAILURE.getCode());
			baseDto.setResponseDescription(CodeDescription.FAILURE.getDescription());
		}
		
		return baseDto;
	}
	
	public BaseDto get(Long id) {
		BaseDto baseDto = new BaseDto();
		try {
			ValidateUtil.notNull(id);
			User user = userRepository.getOne(id);
			UserDto dto = ObjectConvertor.convertToUserDto(user);
			ValidateUtil.notNull(dto);
			baseDto.setResponseCode(CodeDescription.SUCCESS.getCode());
			baseDto.setResponseDescription(CodeDescription.SUCCESS.getDescription());
			baseDto.setResponseObject(dto);
		}catch(BadRequestException be) {
			baseDto.setResponseCode(be.getResponseCode());
			baseDto.setResponseDescription(be.getResponseDescription());
		}catch(Exception e) {
			baseDto.setResponseCode(CodeDescription.FAILURE.getCode());
			baseDto.setResponseDescription(CodeDescription.FAILURE.getDescription());
		}
		
		return baseDto;
	}
}
