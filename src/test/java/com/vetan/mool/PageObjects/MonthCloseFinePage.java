package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthCloseFinePage {
    
    WebDriver ldriver;
    public MonthCloseFinePage(WebDriver rdriver)
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

    @FindBy(xpath = "(//span[normalize-space()='Fine'])[1]")
    @CacheLookup
    WebElement btnFine;

    public void clickbtnFine()
    {
        btnFine.click();
    }

    @FindBy(xpath = "(//img[@alt='sec-icon'])[2]")
    @CacheLookup
    WebElement btnAdd;

    public void clickbtnAdd()
    {
        btnAdd.click();
    }

    @FindBy(xpath = "(//span[contains(text(),'Single Record')])[1]")
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

	@FindBy(xpath = "(//span[@title='February'][normalize-space()='February'])[2]")
	@CacheLookup
	WebElement btnMonth;

	public void clickbtnMonth()
	{
		btnMonth.click();
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')][normalize-space()='February'])[2]")
	@CacheLookup
	WebElement btnFebruary;

	public void clickbtnFebruary()
	{
		btnFebruary.click();
	}

    @FindBy(xpath = "(//input[@placeholder=' '])[1]")
    @CacheLookup
    WebElement txtReasonForFine;

    public void settxtReasonForFine(String reason)
    {
        txtReasonForFine.sendKeys(reason);
    }

    @FindBy(xpath = "(//input[@placeholder=' '])[2]")
    @CacheLookup
    WebElement txtNameOfThePersonPresent;

    public void settxtNameOfThePersonPresent(String person)
    {
        txtNameOfThePersonPresent.sendKeys(person);
    }

    @FindBy(xpath = "(//div[@class='ant-picker-input'])[1]")
    @CacheLookup
    WebElement btnDateOfOffence;

    public void clcikbtnDateOfOffence()
    {
        btnDateOfOffence.click();
    }

    @FindBy(xpath = "(//div[@class='ant-picker-cell-inner'][normalize-space()='3'])[1]")
    @CacheLookup
    WebElement btnDate3;

    public void clickbtnDate3()
    {
        btnDate3.click();
    }

    @FindBy(xpath = "(//input[@placeholder=' '])[3]")
    @CacheLookup
    WebElement txtWagesPeriod;

    public void settxtWagesPeriod(String wPeriod)
    {
        txtWagesPeriod.sendKeys(wPeriod);
    }

    @FindBy(xpath = "(//input[@placeholder=' '])[4]")
    @CacheLookup
    WebElement txtWagespayable;

    public void settxtWagespayable(String wPayable)
    {
        txtWagespayable.sendKeys(wPayable);
    }

    @FindBy(xpath = "(//div[@class='ant-picker-input'])[2]")
    @CacheLookup
    WebElement btnDateOfFine;

    public void clickbtnDateOfFine()
    {
        btnDateOfFine.click();
    }

    @FindBy(xpath = "(//div[normalize-space()='12'])[1]")
    @CacheLookup
    WebElement btnDate12;

    public void clickbtnDate12()
    {
        btnDate12.click();
    }

    @FindBy(xpath = "(//input[@placeholder=' '])[5]")
    @CacheLookup
    WebElement txtFineAmount;

    public void settxtFineAmount(String fAmount)
    {
        txtFineAmount.sendKeys(fAmount);
    }

    @FindBy(xpath = "(//button[contains(@class,'button-lib button-type-13')])[5]")
    @CacheLookup
    WebElement btnAddToTheMonthEndData;

    public void clickbtnAddToTheMonthEndData()
    {
        btnAddToTheMonthEndData.click();
    }

    @FindBy(xpath = "(//img[@alt='pri-icon'])[3]")
    @CacheLookup
    WebElement btnDeleteFine;

    public void clickbtnDeleteFine()
    {
        btnDeleteFine.click();
    }

    @FindBy(xpath = "(//span[normalize-space()='OK'])[1]")
    @CacheLookup
    WebElement btnConfirmDelete;

    public void clickbtnConfirmDelete()
    {
        btnConfirmDelete.click();
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







    
}
