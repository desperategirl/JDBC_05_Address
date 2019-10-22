package com.biz.addr.persistence.Dao;

import java.sql.Connection;
import java.util.List;

import com.biz.addr.persistence.AddrDTO;

/*
 * 
 * 			  AddrDao 클래스
			  
			  dbConnection 부분
  			  selectAll();
  			  findById(long id);
  			  findByTel(String tel);
  			  findByChain(String chain);
 * 
 */
public abstract class AddrDao {
	
	protected Connection dbConn = null;
	
	public AddrDao() {
		this.dbConn = DBConnection.getDBConnection();
		
	}
	
	public abstract List<AddrDTO> slelectAll();
	
	public abstract List<AddrDTO> selectAll();
	public abstract List<AddrDTO> findById(long id);
	public abstract List<AddrDTO>findByTel (String tel);
	public abstract List<AddrDTO> findByChain(String chain);

}
