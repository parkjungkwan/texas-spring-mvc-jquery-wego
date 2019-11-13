package com.wego.web.brd;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wego.web.pxy.PageProxy;
import com.wego.web.usr.User;

@Repository
public interface ArticleMapper {
	public void insertArticle(Community param);
	public String countArticle();
	public List<Community> selectAll(PageProxy pxy);
	public void createCommunity(HashMap<String, String> o);
}
