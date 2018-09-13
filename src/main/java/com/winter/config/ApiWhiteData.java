package com.winter.config;

import java.util.ArrayList;
import java.util.List;
/**
 * API白名单列表
 * @author xxx
 *
 */
public class ApiWhiteData {
	
	private static List<String> whiteApis = new ArrayList<String>();
	
	static {
		whiteApis.add("/user/login");
		whiteApis.add("/file/upload");
		whiteApis.add("/test");
		whiteApis.add("/book");
		
		//swagger 访问接口 资源 放行
		whiteApis.add("/swagger-ui.html");
		whiteApis.add("/swagger-resources/**");
		whiteApis.add("/webjars/**");
		whiteApis.add("/images/**");
		whiteApis.add("/v2/api-docs");
		whiteApis.add("/configuration/ui");
		whiteApis.add("/configuration/security");
	}
	
	public static List<String> getWhiteApis() {
		return whiteApis;
	}
	
	public static void add(String uri) {
		whiteApis.add(uri);
	}
	
}
