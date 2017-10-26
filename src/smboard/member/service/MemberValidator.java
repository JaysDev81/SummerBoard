package smboard.member.service;

import smboard.member.model.MemberModel;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {
	
		@Override
		public boolean supports(Class<?> clazz) {
				return MemberModel.class.isAssignableFrom(clazz);
		}

}
