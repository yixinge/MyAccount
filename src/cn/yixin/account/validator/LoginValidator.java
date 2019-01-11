package cn.yixin.account.validator;

import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import cn.yixin.account.domain.User;

@Repository
public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "loginName", null, "登入名不能为空");
		ValidationUtils.rejectIfEmpty(errors, "password", null, "密码不能为空");
	}
	
}
