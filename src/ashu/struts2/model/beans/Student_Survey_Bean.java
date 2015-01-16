package ashu.struts2.model.beans;

public class Student_Survey_Bean {

private String raffleBox, interest,recommend,plusPoint,streeAddress,cityName,stateName
,zipCode,telephoneNumber,description, date;

private String firstName;
private String lastName;
private double  meanValue;
private double  stdDeviation;
int [] data;

public int[] getData() {
	return data;
}

public void setData(int[] data) {
	this.data = data;
}

public Student_Survey_Bean() 
{

	this.firstName = firstName;
	this.lastName = lastName;
}

public String getFirstName() 
{
	return firstName;
}

public void setFirstName(String firstName) 
{
	this.firstName = firstName;
}

public String getLastName() 
{
	return lastName;
}

public void setLastName(String lastName) 
{
	this.lastName = lastName;
}



public double getMeanValue() {
	return meanValue;
}

public void setMeanValue(double meanValue) {
	this.meanValue = meanValue;
}

public double getStdDeviation() {
	return stdDeviation;
}

public void setStdDeviation(double stdDeviation) {
	this.stdDeviation = stdDeviation;
}

public String getRaffleBox() {
	return raffleBox;
}

public void setRaffleBox(String raffleBox) {
	this.raffleBox = raffleBox;
	String [] csv=raffleBox.split(",");
	int i=0;
	data=new int[10];
	for(String s:csv)
	{
		data[i] = Integer.parseInt(s);
		i++;
	}	
}

public String getInterest() {
	return interest;
}

public void setInterest(String interest) {
	this.interest = interest;
}

public String getPlusPoint() {
	return plusPoint;
}

public void setPlusPoint(String plusPoint) {
	this.plusPoint = plusPoint;
}

public String getStreeAddress() {
	return streeAddress;
}

public void setStreeAddress(String streeAddress) {
	this.streeAddress = streeAddress;
}

public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}

public String getStateName() {
	return stateName;
}

public void setStateName(String stateName) {
	this.stateName = stateName;
}

public String getZipCode() {
	return zipCode;
}

public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

public String getTelephoneNumber() {
	return telephoneNumber;
}

public void setTelephoneNumber(String telephoneNumber) {
	this.telephoneNumber = telephoneNumber;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

}