package co.jeong.prj.sales.service;

import java.util.List;

public interface SalesMapper {
	List<SalesVO> salesSelectList();
	SalesVO salesSelect(SalesVO vo);
	int salesSelectInsert(SalesVO vo);
	int salesSelectUpdate(SalesVO vo);
	int salesSelectDelete(SalesVO vo);
}
