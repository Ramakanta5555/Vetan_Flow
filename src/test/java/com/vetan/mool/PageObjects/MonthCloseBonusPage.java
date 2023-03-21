package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthCloseBonusPage {

    WebDriver ldriver;
	public MonthCloseBonusPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "(//img[@alt='Payroll'])[1]")
	@CacheLookup
	WebElement btnPayroll;
	
	public void clickbtnPayroll()
	{
		btnPayroll.click();
	}
	
	@FindBy(xpath = "(//a[@href='/org/payroll/payroll_inputs'])[1]")
	@CacheLookup
	WebElement btnPayrollInput;
	
	public void clickbtnPayrollInput()
	{
		btnPayrollInput.click();
	}

	@FindBy(xpath = "(//span[normalize-space()='Bonus'])[1]")
	@CacheLookup
	WebElement btnBonus;

	public void clickbtnBonus()
	{
		btnBonus.click();
	}

	@FindBy(xpath = "(//img[contains(@alt,'pri-icon')])[2]")
	@CacheLookup
	WebElement btnAdd;

	public void clickbtnAdd()
	{
		btnAdd.click();
	}

	@FindBy(xpath = "(//span[normalize-space()='Single Record'])[1]")
	@CacheLookup
	WebElement btnAddSingleRecord;

	public void clickbtnAddSingleRecord()
	{
		btnAddSingleRecord.click();
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")
	@CacheLookup
	WebElement btnEmployeeName;

	public void clickbtnEmployeeName()
	{
		btnEmployeeName.click();
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	@CacheLookup
	WebElement btnRamakantaSamal;

	public void clickbtnRamakantaSamal()
	{
		btnRamakantaSamal.click();
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
	@CacheLookup
	WebElement btnFinancialYear;

	public void clickbtnFinancialYear()
	{
		btnFinancialYear.click();
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='2022-2023'])[1]")
	@CacheLookup
	WebElement btn202223;

	public void clickbtn202223()
	{
		btn202223.click();
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[3]")
	@CacheLookup
	WebElement btnMonth;

	public void clickbtnMonth()
	{
		btnMonth.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'March')])[1]")
	@CacheLookup
	WebElement btnFebruary;

	public void clickbtnFebruary()
	{
		btnFebruary.click();
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[4]")
	@CacheLookup
	WebElement btnBonusType;

	public void clickbtnBonusType()
	{
		btnBonusType.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Puja Bonus')])[1]")
	@CacheLookup
	WebElement btnPujaBonus;

	public void clickbtnPujaBonus()
	{
		btnPujaBonus.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Interim Bonus')])[1]")
	@CacheLookup
	WebElement btnInterimBonus;

	public void clickbtnInterimBonus()
	{
		btnInterimBonus.click();
	}

	@FindBy(xpath = "(//input[@placeholder=' '])[1]")
	@CacheLookup
	WebElement txtBonusAmount;

	public void settxtBonusAmount(String bAmount)
	{
		txtBonusAmount.sendKeys(bAmount);
	}

	@FindBy(xpath = "(//div[contains(text(),'Add to the month end data')])[1]")
	@CacheLookup
	WebElement btnAddToMonthEndData;

	public void clickbtnAddToMonthEndData()
	{
		btnAddToMonthEndData.click();
	}

	@FindBy(xpath = "(//img[@alt='pri-icon'])[3]")
	@CacheLookup
	WebElement btnDeleteBonus;

	public void clickbtnDeleteBonus()
	{
		btnDeleteBonus.click();
	}

	@FindBy(xpath = "(//span[normalize-space()='OK'])[1]")
	@CacheLookup
	WebElement btnConfirmDelete;

	public void clickbtnConfirmDelete()
	{
		btnConfirmDelete.click();
	}

	//PayRoll

	@FindBy(xpath = "(//a[@href='/org/payroll/history'])[1]")
	@CacheLookup
	WebElement btnPayrolllHistory;

	public void clickbtnPayrollHistory()
	{
		btnPayrolllHistory.click();
	}

	@FindBy(xpath = "(//h3[normalize-space()='Payroll for February'])[1]")
	@CacheLookup
	WebElement btnPayrollFebruary;

	public void clickbtnPayrollFebruary()
	{
		btnPayrollFebruary.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Run payroll')])[1]")
	@CacheLookup
	WebElement btnRunPayroll;

	public void clickbtnRunPayroll()
	{
		btnRunPayroll.click();
	}
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	@CacheLookup
	WebElement btnCheckbox;

	public void clickbtncheckbox()
	{
		btnCheckbox.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Run Payroll')])[1]")
	@CacheLookup
	WebElement btnRunPayrollFinal;

	public void clickbtnRunPayrollFinal()
	{
		btnRunPayrollFinal.click();
	}

	//Employee

	@FindBy(xpath = "(//img[@alt='Employees'])[1]")
	@CacheLookup
	WebElement btnEmployee;

	public void clickbtnEmployee()
	{
		btnEmployee.click();
	}

	@FindBy(xpath = "(//td[@class='ant-table-cell ant-table-column-sort ant-table-cell-fix-left ant-table-cell-fix-left-last'])[1]")
	@CacheLookup
	WebElement btnRamakantaSamalEmployee;

	public void clickbtnRamakantaSamalEmployee()
	{
		btnRamakantaSamalEmployee.click();
	}

	@FindBy(xpath = "(//span[normalize-space()='Payslips & Forms'])[1]")
	@CacheLookup
	WebElement btnPayslipandForms;

	public void clickbtnPayslipandForms()
	{
		btnPayslipandForms.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'View')])[1]")
	@CacheLookup
	WebElement btnViewFebPayslip;

	public void clickbtnViewFebPayslip()
	{
		btnViewFebPayslip.click();
	}

	@FindBy(xpath = "(//*[name()='svg'])[3]")
	@CacheLookup
	WebElement btnClosePayslip;

	public void clickbtnCloseOPayslip()
	{
		btnClosePayslip.click();
	}

}
