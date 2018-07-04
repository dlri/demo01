package com.dlri.chinacnr.bwts.quartz;

import java.util.Date;

import org.springframework.stereotype.Service;
@Service("job1Demo")
public class Job1Demo {

	public void sayHello(){
		System.out.println(new Date()+"->Hello,调用进行1!");
	}
}
