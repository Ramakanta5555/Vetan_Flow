package com.vetan.mool.PageObjects;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthCloseArrearPage {
    
    WebDriver ldriver;
    public MonthCloseArrearPage (WebDriver rdriver)
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

    @FindBy(xpath = "(//span[normalize-space()='Arrears'])[1]")
    @CacheLookup
    WebElement btnArrear;

    public void clickbtnArrear()
    {
        btnArrear.click();
    }

    @FindBy(xpath = "(//div[@class='flex justify-between align-center'][normalize-space()='Add'])[2]")
    @CacheLookup
    WebElement btnAdd;

    public void clickbtnAdd()
    {
        btnAdd.click();
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

    @FindBy(xpath = "(//span[normalize-space()='Other Allowance Arrear'])[1]")
    @CacheLookup
    WebElement btnAllowancesArrear;

    public void clickbtnAllowancesArrear()
    {
        btnAllowancesArrear.click();
    }

    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
    @CacheLookup
    WebElement btnStartMonth;

    public void clickbtnStartMonth()
    {
        btnStartMonth.click();
    }

    @FindBy(xpath = "(//div[contains(text(),'January')])[1]")
    @CacheLookup
    WebElement btnJanuary;

    public void clickbtnJanuary()
    {
        btnJanuary.click();
    }

    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[3]")
    @CacheLookup
    WebElement btnStartYear;

    public void clickbtnStartYear()
    {
        btnStartYear.click();
    }

    @FindBy(xpath = "(//input[@id='rc_select_3'])[1]")
    @CacheLookup
    WebElement txtStartYear;

    public void settxtStartYear(String syear)
    {
        txtStartYear.sendKeys(syear);
    }

    @FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='2023'])[1]")
    @CacheLookup
    WebElement btnS2023;

    public void clicknbtnS2023()
    {
        btnS2023.click();
    }

    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[4]")
    @CacheLookup
    WebElement btnEndMonth;

    public void clickbtnEndMonth()
    {
        btnEndMonth.click();
    }

    @FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='February'])[2]")
    @CacheLookup
    WebElement btnFebruary;

    public void clickbtnFebruary()
    {
        btnFebruary.click();
    }

    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[5]")
    @CacheLookup
    WebElement btnEndYear;

    public void clickbtnEndYear()
    {
        btnEndYear.click();
    }

    @FindBy(xpath = "(//input[@id='rc_select_5'])[1]")
    @CacheLookup
    WebElement txtEndYear;

    public void settxtEndYear(String eyear)
    {
        txtEndYear.sendKeys(eyear);
    }

    @FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='2023'])[2]")
    @CacheLookup
    WebElement btnE2023;

    public void clickbtnE2023()
    {
        btnE2023.click();
    }

    @FindBy(xpath = "(//input[contains(@value,'false')])[1]")
    @CacheLookup
    WebElement btnMultiPhase;

    public void clickbtnMultiPhase()
    {
        btnMultiPhase.click();
    }

    @FindBy(xpath = "(//input[@placeholder=' '])[1]")
    @CacheLookup
    WebElement txtTotalAmount;

    public void settxtTotalAmount(String Amount)
    {
        txtTotalAmount.sendKeys(Amount);
    }

    @FindBy(xpath = "(//div[contains(text(),'Add to the month end data')])[1]")
    @CacheLookup
    WebElement btnAddtoMonthEndData;

    public void clickbtnAddtoMonthEndData()
    {
        btnAddtoMonthEndData.click();
    }

    //PAYROLL
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

    @FindBy(xpath = "(//img[@alt='pri-icon'])[3]")
    @CacheLookup
    WebElement btnDeleteArrear;

    public void clickbtnDeleteArrear()
    {
        btnDeleteArrear.click();
    }

    @FindBy(xpath = "(//span[normalize-space()='OK'])[1]")
    @CacheLookup
    WebElement btnConfirmDelete;

    public void clickbtnConfirmDelete()
    {
        btnConfirmDelete.click();
    }
}
