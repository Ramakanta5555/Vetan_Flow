package com.vetan.mool.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoansandAdvanceSalaryPage {
    
    WebDriver ldriver;
    public LoansandAdvanceSalaryPage(WebDriver rdriver)
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
    
    @FindBy(xpath = "(//span[normalize-space()='Loans & Advance Salaries'])[1]")
    @CacheLookup
    WebElement btnLoansandAvdanceSalary;

    public void clickbtnLoansandAvdanceSalary()
    {
        btnLoansandAvdanceSalary.click();
    }

    @FindBy(xpath = "(//img[contains(@alt,'pri-icon')])[2]")
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

    @FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	@CacheLookup
	WebElement btnRamakantaSamal;

	public void clickbtnRamakantaSamal()
	{
		btnRamakantaSamal.click();
	}

    @FindBy(xpath = "(//input[@value='0'])[1]")
    @CacheLookup
    WebElement btnLoan;

    public void clickbtnLoan()
    {
        btnLoan.click();
    }

    @FindBy(xpath = "(//input[@value='1'])[1]")
    @CacheLookup
    WebElement btnAdvanceSalary;

    public void clickbtnAdvanceSalary()
    {
        btnAdvanceSalary.click();
    }

    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
    @CacheLookup
    WebElement btnStartMonth;

    public void clickbtnStartMonth()
    {
        btnStartMonth.click();
    }

    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[3]")
    @CacheLookup
    WebElement btnAllowancesStartMonth;

    public void clickbtnAllowancesStartMonth()
    {
        btnAllowancesStartMonth.click();
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

    public void goDown()
    {
        btnStartYear.sendKeys(Keys.ARROW_DOWN);
    }

    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[4]")
    @CacheLookup
    WebElement btnAllowancesStartYear;

    public void clickbtnAllowancesStartYear()
    {
        btnAllowancesStartYear.click();
    }

    @FindBy(xpath = "")
    @CacheLookup
    WebElement txtStartYear;

    public void settxtStartYear()
    {
        txtStartYear.sendKeys(Keys.ARROW_DOWN);
    }

    @FindBy(xpath = "(//input[@id='rc_select_13'])[1]")
    @CacheLookup
    WebElement txtAllowancesStartYear;

    public void settxtAllowancesStartYear(String syear)
    {
        txtAllowancesStartYear.sendKeys(syear);
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

    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[5]")
    @CacheLookup
    WebElement btnAllowancesEndMonth;

    public void clickbtnAllowancesEndMonth()
    {
        btnAllowancesEndMonth.click();
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

    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[6]")
    @CacheLookup
    WebElement btnAllowancesEndYear;

    public void clickbtnAllowancesEndYear()
    {
        btnAllowancesEndYear.click();
    }

    @FindBy(xpath = "(//input[@id='rc_select_5'])[1]")
    @CacheLookup
    WebElement txtEndYear;

    public void settxtEndYear(String eyear)
    {
        txtEndYear.sendKeys(eyear);
    }

    @FindBy(xpath = "(//input[@id='rc_select_15'])[1]")
    @CacheLookup
    WebElement txtAllowancesEndYear;

    public void settxtAllowancesEndYear(String eyear)
    {
        txtAllowancesEndYear.sendKeys(eyear);
    }

    @FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='2023'])[2]")
    @CacheLookup
    WebElement btnE2023;

    public void clickbtnE2023()
    {
        btnE2023.click();
    }

    @FindBy(xpath = "(//input[contains(@placeholder,'')])[8]")
    @CacheLookup
    WebElement txttenure;

    public void settxtTenure(String tenure)
    {
        txttenure.sendKeys(tenure);
    }

    @FindBy(xpath = "(//input[contains(@placeholder,'')])[9]")
    @CacheLookup
    WebElement txtInterentAmount;

    public void settxtInterentAmount(String InterentAmount)
    {
        txtInterentAmount.sendKeys(InterentAmount);
    }

    @FindBy(xpath = "(//input[contains(@placeholder,'')])[10]")
    @CacheLookup
    WebElement txtTotalAmountInclInterestAmount;

    public void settxtTotalAmountInclInterestAmount(String TotalAmountInclInterestAmount)
    {
        txtTotalAmountInclInterestAmount.sendKeys(TotalAmountInclInterestAmount);
    }

    @FindBy(xpath = "(//div[contains(text(),'Add to the month end data')])[1]")
    @CacheLookup
    WebElement btnAddToMonthEndData;

    public void clickbtnAddToMonthEndData()
    {
        btnAddToMonthEndData.click();
    }




}
