import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import lostsky.tool.mail.MailSender;


public class SmtpSample {

	/**
	 * SMTP主机地址，邮箱用户名，邮箱密码请自行指定。公共邮箱目前已知sohu.com支持SMTP发送功能，可以尝试。
	 * 作者:lostsky
	 * 交流论坛:www.591pic.com
	 */
	public static void main(String[] args) {
		/*SMTP主机地址  如 smtp.sohu.com*/
		String smtpHost="smtpav.travelsky.com";
		/*邮箱用户名 此处用户名不可用 请自行指定*/
		String username="wangwckg@travelsky.com";
		/*邮箱密码 此处密码不可用 请自行指定*/
		String password="123456";
		/*邮件标题*/
		String subject="发送测试";
		/*邮件发送者地址 此处地址不可用 请自行指定*/
		String senders="wangwckg@travelsky.com";
		/*邮件接受者地址， 多个地址用英文半角逗号隔开*/
		String recipients="858078049@qq.com";
		/*邮件正文类型 两种: html格式和纯文本格式*/
		int contentType=MailSender.CONTENT_TYPE_HTML;
		/*邮件正文*/
		String content="<font color='red' style='font-size:12px;'>欢迎使用dfMail-2.0,<a href='www.591pic.com'>交流论坛</a></font>";
		/*邮件正文编码 默认为null 一般不用修改*/
		String contentEncoding=null;
		/*附件文件名编码 默认为null 一般不用修改*/
		String fileNameEncoding=null;
		//附件
		File[] attaches=new File[1];
		attaches[0]=new File("C:\\Documents and Settings\\Administrator\\桌面\\年会就餐安排表（修改）.xls");
//		attaches[1]=new File("d:\\dfMail附件测试.doc");
		try {
			MailSender sender=new MailSender(smtpHost, username, password, 
					senders, recipients, subject, 
					content, contentEncoding, contentType, 
					attaches, fileNameEncoding);
			/*发送*/
			sender.send();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
