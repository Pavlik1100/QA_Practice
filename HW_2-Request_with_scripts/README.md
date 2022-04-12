# Jmeter - HW_2-Request_with_scripts  
Сделать сценарий с перечисленными эндпоинтами   
#  
### [![Flutter](https://img.shields.io/badge/👉-HW_2_Jmeter_Test_Plan-00A98F)](https://github.com/Pavlik1100/QA_Practice/blob/Jmeter/HW_2-Request_with_scripts/HW_2_Jmeter_Test_Plan.jmx) Настройки тест-плана Jmeter [HW_2_Jmeter_Test_Plan.jmx](https://github.com/Pavlik1100/QA_Practice/blob/Jmeter/HW_2-Request_with_scripts/HW_2_Jmeter_Test_Plan.jmx)
### [![Flutter](https://img.shields.io/badge/👉-HW_2_Results_from_Results_Tree-00A98F)](https://github.com/Pavlik1100/Jmeter/blob/main/HW_2-Request_with_scripts/HW_2_Results_from_Results_Tree.csv) Logs from Results Tree with complated *** [HW_2_Results_from_Results_Tree.csv](https://github.com/Pavlik1100/Jmeter/blob/main/HW_2-Request_with_scripts/HW_2_Results_from_Results_Tree.csv)  
### [![Flutter](https://img.shields.io/badge/👉-HW_2_Results_from_Summary_Report-00A98F)](https://github.com/Pavlik1100/Jmeter/blob/main/HW_2-Request_with_scripts/HW_2_Results_from_Summary_Report.csv) Logs from Sumury Report with complated *** [HW_2_Results_from_Summary_Report.csv](https://github.com/Pavlik1100/Jmeter/blob/main/HW_2-Request_with_scripts/HW_2_Results_from_Summary_Report.csv)  
#

1) http://162.55.220.72:5005/user_info  
req. (RAW JSON)  
POST  
age: int  
salary: int  
name: str  
auth_token  
  
```js  
resp.
{'start_qa_salary':salary,
 'qa_salary_after_6_months': salary * 2,
 'qa_salary_after_12_months': salary * 2.9,
 'person': {'u_name':[user_name, salary, age],
                                'u_age':age,
                                'u_salary_1.5_year': salary * 4}
                                }
```
Действия:  
1) Достать из Respose значение из поля 'qa_salary_after_6_months' и передать в поле salary запроса http://162.55.220.72:5005/new_data  
===================  
  
2) http://162.55.220.72:5005/new_data  
req.  
POST  
age: int  
salary: int  
name: str  
auth_token  
```js  
Resp.
{'name':name,
  'age': int(age),
  'salary': [salary, str(salary*2), str(salary*3)]}
```
Действия:  
1) Достать из Respose значение из поля 'name' и передать в поле name запроса http://162.55.220.72:5005/new_data  
  
===================  
  
3) http://162.55.220.72:5005/test_pet_info  
req.  
POST  
age: int  
weight: int  
name: str  
auth_token  
  
```js
Resp.
{'name': name,
 'age': age,
 'daily_food':weight * 0.012,
 'daily_sleep': weight * 2.5}
```
  
Тесты:  
1) Достать из Respose значение из поля age и передать в поле age запроса http://162.55.220.72:5005/get_test_user  
  
  
Задание ***  
0) Изучать как работают Response Assertion.  
1) Сделать Assertion на провекрку статус код 200  
2) Сделать Assertion на провекрку 'daily_food':weight * 0.012  
  
===================  
  
4) http://162.55.220.72:5005/get_test_user  
req.  
POST  
age: int  
salary: int  
name: str  
auth_token  
```js  
Resp.
{'name': name,
 'age':age,
 'salary': salary,
 'family':{'children':[['Alex', 24],['Kate', 12]],
 'u_salary_1.5_year': salary * 4}
 }
```  
Тесты:  
Задание ***  
0) Изучать как работают Response Assertion.  
1) Сделать Assertion на провекрку статус код 200  
2) Сделать Assertion на провекрку 'salary': salary  
  
===================  
  
## 🚏 Navigate:
[![Flutter](https://img.shields.io/badge/🏠-Jmeter_REP-00A98F)](https://github.com/Pavlik1100/Jmeter)  [![Flutter](https://img.shields.io/badge/🏠-QA_PRACTICE_BANCH-orange)](https://github.com/Pavlik1100/QA_Practice/tree/main)
## 📫 How to reach me:  
[![Flutter](https://img.shields.io/badge/-Pavel_Simonov-000000?style=social&logo=LinkedIn)](https://www.linkedin.com/in/pavel-simonov-7a8b1119a/)  [![Flutter](https://img.shields.io/badge/-Pavel_Simonov-000000?style=social&logo=Telegram)](https://t.me/NuiSaiman)  [![Flutter](https://img.shields.io/badge/-simonovpavlik@gmail.com-000000?style=social&logo=Gmail)](mailto:simonovpavlik@gmail.com)
