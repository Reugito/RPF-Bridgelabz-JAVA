window.addEventListener('DOMContentLoaded', (event) => {
    const name = document.querySelector('#name');
    const text = document.querySelector('#name')
	const textError = document.querySelector('.text-error')
	text.addEventListener('input',function ()
	{   
		if(text.value.length == 0)
		{
			textError.textContent = "";
			return;
		}
		try
		{
			(new EmployeePayrollData()).name = text.value;
			textError.textContent = "";
		}
		catch (e)
		{
			textError.textContent = e;
		}
	});
    const salary = document.querySelector('#salary');
	const output = document.querySelector('.salary-output');
	output.textContent = salary.value;
	salary.addEventListener('input', function ()
	{
	   output.textContent = salary.value;
	});
    

});

const save = () => {
    try {
        let employeepayrollData = createEmployeepayroll();
        createAndUpdateStorage(employeepayrollData);
    } catch (e) {
        return;
    }
}

function createAndUpdateStorage(employeepayrollData) {
    let employeePayrollList = JSON.parse(localStorage.getItem("Employeepayroll"));
    if(employeePayrollList != undefined) {
        employeePayrollList.push(employeepayrollData);
    } else {
        employeePayrollList = [employeepayrollData]
    }
    alert(employeePayrollList.toString());
    localStorage.setItem("EmployeePayrollList",JSON.stringify(employeePayrollList))
}

const createEmployeepayroll = () => {
    let employeepayrollData = new EmployeePayrollData();
    try{
        employeepayrollData.name = getInputValueById('#name');
    } catch (e) {
        setTextValue('.text-error',e);
        throw e;
    }
    alert("hello");
    employeePayrollData.profilePic = getSelectedValues('[name = profile]').pop();
	employeePayrollData.gender = getSelectedValues('[name = gender]').pop();
	employeePayrollData.department = getSelectedValues('[name = department]');
	employeePayrollData.salary = getInputValueById('#salary');
	employeePayrollData.note = getInputValueById('#notes');
	let date = getInputValueById('#day')+" "+getInputValueById('#month')+" "+getInputValueById('#year');
	employeePayrollData.startDate = Date.parse(date);
	alert(employeePayrollData.toString());
	return employeePayrollData;
}

const getSelectedValues = (propertyValue) => {
    let allItems = document.querySelectorAll(propertyValue);
    alert(allItems);
    let setItems = [];
    allItems.forEach(item => {
        if(item.checked) selItems.push(item.value);
        alert(item);

    });
    return setItems;
}

const getInputValueById = (id) => {
    let value = document.querySelector(id).value;
    return value;
}

const getInputElementValue = (id) => {
    let value = document.getElementById(id).value;
}

const resetForm = () => {
    setvalue('#name','');
    unsetSelectedValues('[name=profile]');
    unsetSelectedValues('[name=gender]');
    unsetSelectedValues('[name=department]');
    setvalue('#salary','');
    setvalue('#notes','');
    setvalue('#day','1');
    setvalue('#month','January');
    setvalue('#year','2020');
}

const unsetSelectedValues = (propertyValue) => {
    let allItems = document.querySelectorAll(propertyValue);
    allItems.forEach(item => {
        item.checked = false;
    } );
}

const setTextValue = (id,value) => {
    const element = document.querySelector(id);
    element.textContent = value;
}

const setValue = (id,value) => {
    const element = document.querySelector(id);
    element.value = value;
}