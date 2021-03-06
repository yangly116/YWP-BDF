package com.iceberg.buildFile.test;

import org.junit.Test;

import com.iceberg.buildFile.main.Setting;
import com.iceberg.buildFile.server.AContextServer;
import com.iceberg.buildFile.service.StartService;
import com.iceberg.buildFile.util.StringUtil;

/** 
 * 删除所有生成的文件
 * @author 作者 杨文培 E-mail:1164180794@qq.com 
 * @version 创建时间：Jul 7, 2017 12:05:19 AM  
 */
public class BTest {
	@Test
	public void cleanScript() {
		StartService startService = (StartService) AContextServer.aContextServer.getAppContext().getBean("BDF.startService");
		//startService.cleanScript();
		startService.start();
		//startService.refreshScript();
	}
	@Test
	public void test(){
		Setting.getInit();
		String type = "d";
		String[] types = {"d","D","i","I","C","c","C128","N","N14","N14.2","nvarchar2(128)","sdfhio","j","INTEGER","number(15,2)"};
		for (int i = 0; i < types.length; i++) {
			type = types[i];
			String resStr = StringUtil.fullFieldType_FDLK(type);
			System.out.println(types[i]+":"+resStr);
		}
	}
}
