package cn.zhidiancan.m.members;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MemberMiddlePlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberMiddlePlatformApplication.class, args);
	}
}

