package test_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Baseclass;
import generic.Generic_excel;
import pom_script.Pom_Loginfacebook;

public class Testscript extends Baseclass{
	@Test
	public static void test() throws EncryptedDocumentException, IOException, InterruptedException {
		String un = Generic_excel.getData("sheet1", 0, 0);
		String pwd = Generic_excel.getData("sheet1", 1, 0);
		Pom_Loginfacebook fb=new Pom_Loginfacebook(driver);
		
		fb.username(un);
		fb.password(pwd);
		fb.loginbtn();
		Thread.sleep(5000);
		Assert.fail();
	}
}
