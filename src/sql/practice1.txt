--show employees data sorted by email
select
*
from employees

order by email desc;

--show employees with salary between 3200 and 1200
select
*
from employees
where salary between 3200 and 12000;

--show employees with specific employee id
select
*
from employees
where employee_id in (103,115,196,187,102,100);

-- show employees with u as the second letter on their last name
select
*
from employees
where last_name like '_u%';

--show distinct department code
select
distinct department_id
from employees;

--show employees with manager code 100
select
first_name || ' ' || last_name as full_name,
job_id as position_code,
salary * 12 as annual_salary
from employees
where manager_id=100;

--show those poor guy without commission bonus
select
last_name as last_name,
salary as salary,
job_id as position_code
from employees
where commission_pct is null;

--showing all employees except IT_PROG and SH_CLERK
select
*
from employees
where job_id not in ('IT_PROG','SH_CLERK');
