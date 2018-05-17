package com.hwua.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hwua.dao.ShoopDao;
import com.hwua.entity.Address;
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


	@Override
	public void vipupdate(User user) {
		shoopDao.vipupdate(user);
		
	}


	@Override
	public void updatePwd(long id, String PassWord) {
		String encodedPassword = passwordEncoder.encode(PassWord);
		
		shoopDao.updatePwd(id,encodedPassword);
		
	}


	@Override
	public void addAddress(Address addres) {
		shoopDao.addAddress(addres);
		
	}


	@Override
	public List<Address> findAll(long id) {
		
		return shoopDao.findAll(id);
	}


	@Override
	public void updateAddress(Address addres) {
		shoopDao.updateAddress(addres);
		
	}


	@Override
	public Address findIdOneAddres(Long id) {
		return shoopDao.findIdOneAddres(id);
	}









    




	

}
