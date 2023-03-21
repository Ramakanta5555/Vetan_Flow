package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthCloseCustomPage {
    
    WebDriver ldriver;

    public MonthCloseCustomPage(WebDriver rdriver)
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

    @FindBy(xpath = "(//span[normalize-space()='Custom'])[1]")
    @CacheLookup
    WebElement btnCustom;

    public void clickbtnCustom()
    {
        btnCustom.click();
    }

    @FindBy(xpath = "(//div[@class='flex justify-between align-center'][normalize-space()='Add'])[2]")
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

    @FindBy(xpath = "(//div[@title='Ramakanta Samal'])[1]")
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

    @FindBy(xpath = "(//input[@value='credit'])[1]")
    @CacheLookup
    WebElement btnCheckboxCredit;

    public void clickbtncheckboxCredit()
    {
        btnCheckboxCredit.click();
    }

    @FindBy(xpath = "(//input[@value='debit'])[1]")
    @CacheLookup
    WebElement btnCheckboxDebit;

    public void clickbtnCheckboxDebit()
    {
        btnCheckboxDebit.click();
    }

    @FindBy(xpath = "(//input[@type='text'])[1]")
    @CacheLookup
    WebElement txtName;

    public void settxtName(String name)
    {
        txtName.sendKeys(name);
    }

    @FindBy(xpath = "(//input[@value='NaN'])[1]")
    @CacheLookup
    WebElement txtAmount;

    public void settxtAmount(String amount)
    {
        txtAmount.sendKeys(amount);
    }

    @FindBy(xpath = "(//div[contains(text(),'Add to the month end data')])[1]")
    @CacheLookup
    WebElement btnAddToTheMonthEnddata;

    public void clickbtnAddToTheMonthEnddata()
    {
        btnAddToTheMonthEnddata.click();
    }

	@FindBy(xpath = "(//img[@alt='pri-icon'])[3]")
	@CacheLookup
	WebElement btnDeleteCustom;

	public void clickbtnDeleteCustom()
	{
		btnDeleteCustom.click();
	}

	@FindBy(xpath = "(//span[normalize-space()='OK'])[1]")
	@CacheLookup
	WebElement btnConfirmDeleteCustom;

	public void clickbtnConfirmDeleteCustom()
	{
		btnConfirmDeleteCustom.click();
	}



    //PAYROLL

    @FindBy(xpath = "(//a[@href='/org/payroll/history'])[1]")
	@CacheLookup
	WebElement btnPayrolllHistory;

	public void clickbtnPayrollHistory()
	{
		btnPayrolllHistory.click();
	}

	@FindBy(xpath = "(//h3[normalize-space()='Payroll for March'])[1]")
	@CacheLookup
	WebElement btnPayrollMarch;

	public void clickbtnPayrollMarch()
	{
		btnPayrollMarch.click();
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
	
	@FindBy(xpath = "(//div[contains(text(),'View')])[2]")
	@CacheLookup
	WebElement btnViewMarchPayslip;

	public void clickbtnViewMarchPayslip()
	{
		btnViewMarchPayslip.click();
	}

	@FindBy(xpath = "(//*[name()='svg'])[3]")
	@CacheLookup
	WebElement btnClosePayslip;

	public void clickbtnCloseOPayslip()
	{
		btnClosePayslip.click();
	}
}
