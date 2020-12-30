package cn.zhidiancan.framework.untility;

import java.util.UUID;

public class CodeUtil {

	/**
	 * 生成应用ID
	 * TODO：算法未实现，后续需要优化该方法
	 *
	 * @return 生成32位的系统唯一字串
	 */
	public static String generateApplicationID() {
		return UUID.randomUUID().toString();
	}


	/**
	 * 生成随机字符串
	 *
	 * @return 12位随机串(字母大小写数字)
	 */
	public static String generateSecret() {
		char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

		return "";
//		return RandomStringUtils.random(12, chars);
	}

}
