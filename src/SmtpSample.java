import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import lostsky.tool.mail.MailSender;


public class SmtpSample {

	/**
	 * SMTP������ַ�������û�������������������ָ������������Ŀǰ��֪sohu.com֧��SMTP���͹��ܣ����Գ��ԡ�
	 * ����:lostsky
	 * ������̳:www.591pic.com
	 */
	public static void main(String[] args) {
		/*SMTP������ַ  �� smtp.sohu.com*/
		String smtpHost="smtpav.travelsky.com";
		/*�����û��� �˴��û��������� ������ָ��*/
		String username="wangwckg@travelsky.com";
		/*�������� �˴����벻���� ������ָ��*/
		String password="123456";
		/*�ʼ�����*/
		String subject="���Ͳ���";
		/*�ʼ������ߵ�ַ �˴���ַ������ ������ָ��*/
		String senders="wangwckg@travelsky.com";
		/*�ʼ������ߵ�ַ�� �����ַ��Ӣ�İ�Ƕ��Ÿ���*/
		String recipients="858078049@qq.com";
		/*�ʼ��������� ����: html��ʽ�ʹ��ı���ʽ*/
		int contentType=MailSender.CONTENT_TYPE_HTML;
		/*�ʼ�����*/
		String content="<font color='red' style='font-size:12px;'>��ӭʹ��dfMail-2.0,<a href='www.591pic.com'>������̳</a></font>";
		/*�ʼ����ı��� Ĭ��Ϊnull һ�㲻���޸�*/
		String contentEncoding=null;
		/*�����ļ������� Ĭ��Ϊnull һ�㲻���޸�*/
		String fileNameEncoding=null;
		//����
		File[] attaches=new File[1];
		attaches[0]=new File("C:\\Documents and Settings\\Administrator\\����\\���ͲͰ��ű��޸ģ�.xls");
//		attaches[1]=new File("d:\\dfMail��������.doc");
		try {
			MailSender sender=new MailSender(smtpHost, username, password, 
					senders, recipients, subject, 
					content, contentEncoding, contentType, 
					attaches, fileNameEncoding);
			/*����*/
			sender.send();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
