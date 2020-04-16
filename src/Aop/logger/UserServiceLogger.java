package Aop.logger;


import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * Ϊҵ���ķ�����ӵ���־��Ϣ��
 * @author Effort
 * 2020��4��14������4:11:20
 */
public class UserServiceLogger {
	
	private Logger log=Logger.getLogger(UserServiceLogger.class);
	
	//���ñ��淽��ǰ����ǿ����
	public void before(JoinPoint jp) {
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()
				+"����������������"+Arrays.toString(jp.getArgs()));
	}
	
	//���淽�������ǿ����
	public void after(JoinPoint jp,Object result) {
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()
				+"��������������ֵ�ǣ�"+ result);
	}
	
}
