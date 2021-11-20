package com.astorcrm.casesmodule;

import org.testng.annotations.Test;

import com.astorcrm.genericLib.BaseTest;
import com.astorcrm.genericLib.CaseCancel;
import com.astorcrm.genericLib.FileLib;
import com.astorcrm.genericLib.WebDriverCommonLib;
import com.astorcrm.pages.CasePage;
import com.astorcrm.pages.Clone;
import com.astorcrm.pages.CreatePage;
import com.astorcrm.pages.Dnmslokesh;
import com.astorcrm.pages.Edit;
import com.astorcrm.pages.EditData;
import com.astorcrm.pages.NewCasePage;
import com.astorcrm.pages.SaveAndNew;
import com.astorcrm.pages.Signin;
import com.astorcrm.pages.Subject;

public class CaseTab extends BaseTest {

	@Test
	public void SigninPage() throws Throwable {

		Signin sp = new Signin();
		FileLib fl = new FileLib();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		sp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password"));

		CasePage Cp = new CasePage();
		Cp.CaseTab();
		NewCasePage nc = new NewCasePage();
		nc.NewTab();

		CreatePage cp = new CreatePage();

		cp.Create(fl.readPropData(PROP_PATH, "sub"));

		Edit ed = new Edit();
		ed.edi();

		EditData edt = new EditData();
		edt.Editd(fl.readPropData(PROP_PATH, "st"));

		SaveAndNew sn = new SaveAndNew();
		sn.savenew(fl.readPropData(PROP_PATH, "pn"));

		CaseCancel cc = new CaseCancel();
		cc.cancel();
		Subject su = new Subject();
		su.sub();
		Dnmslokesh dn = new Dnmslokesh();
		dn.loki();
        Clone cl = new Clone();
        cl.clon();
	}

}
