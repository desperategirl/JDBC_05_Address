package com.biz.addr.service;

import java.util.List;
import java.util.Scanner;

import com.biz.addr.persistence.AddrDTO;
import com.biz.addr.persistence.Dao.AddrDao;
import com.biz.addr.persistence.Dao.AddrDaoImp;

public class AddrServiceV1 {

	// 객체 선언 (아직 사용준비 전 단계)
	AddrDao addrDao = null;
	Scanner scanner = null;

	// 클래스 생성자
	public AddrServiceV1() {

		// 선언된 객체를 사용할 수 있도록 초기화
		// 초기화 된 클래스 = 인스턴스(화 되었다)
		scanner = new Scanner(System.in);
		addrDao = new AddrDaoImp();

	}
	
	public void viewAddrList() {
		List<AddrDTO> addrList = addrDao.selectAll();
		
		this.viewList(addrList);
		 
	}

}
