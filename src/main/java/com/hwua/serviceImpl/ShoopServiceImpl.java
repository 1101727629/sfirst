package com.hwua.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hwua.dao.ShoopDao;
import com.hwua.entity.Product;
import com.hwua.entity.User;
import com.hwua.service.ShoopService;
@Service
public class ShoopServiceImpl implements ShoopService {
    private ShoopDao shoopDao;
    private PasswordEncoder passwordEncoder;
    @Autowired
   
    public ShoopServiceImpl(ShoopDao shoopDao, PasswordEncoder passwordEncoder) {
		this.shoopDao = shoopDao;
		this.passwordEncoder = passwordEncoder;
	}


    @Override
	public void registered(User user) {
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		shoopDao.registered(user);

	}



	@Override
	public void add(Product pro) {
		shoopDao.add(pro);
		
		
	}









    




	

}
