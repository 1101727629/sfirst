package com.hwua.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.dao.ShoopDao;
import com.hwua.entity.User;
import com.hwua.service.ShoopService;
@Service
public class ShoopServiceImpl implements ShoopService {
    private ShoopDao shoopDao;

    @Autowired
	public ShoopServiceImpl(ShoopDao shoopDao) {
	this.shoopDao = shoopDao;
}


	public void registered(User user) {
		shoopDao.registered(user);

	}

}
