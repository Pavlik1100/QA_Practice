# POSTMAN HW_1
### Completed requests collection [HW_1.postman_collection.json](https://github.com/Pavlik1100/QA_Practice/blob/Postman/HW_1/HW_1.postman_collection.json)
### Test run Completed requests collection [HW_1.postman_test_run.json](https://github.com/Pavlik1100/QA_Practice/blob/Postman/HW_1/HW_1.postman_test_run.json)
#
### Create requests collection in Postman
Protocol: `http`  
IP: `162.55.220.72`  
Port: `5005`  

***EP_1***
Method: `GET`
EndPoint: `/get_method`
request url params: 
 `name: str`
 `age: int`  
response:  
```sh 
[
    “Str”,
    “Str”
]
```

***EP_2***
Method: `POST`
EndPoint: `/user_info_3`
request form data: 
 `name: str`
 `age: int`
 `salary: int`  
response:  
```sh
{'name': name,
          'age': age,
          'salary': salary,
          'family': {'children': [['Alex', 24], ['Kate', 12]],
                     'u_salary_1_5_year': salary * 4}}
```

***EP_3***
Method: `GET`
EndPoint: `/object_info_1`
request url params: 
 `name: str`
 `age: int`
 `weight: int`  
response:  
```sh
{'name': name,
          'age': age,
          'daily_food': weight * 0.012,
          'daily_sleep': weight * 2.5}
```
***EP_4***
Method: `GET`
EndPoint: `/object_info_2`
request url params: 
 `name: str`
 `age: int`
 `salary: int`  
response:  
```sh
{'start_qa_salary': salary,
          'qa_salary_after_6_months': salary * 2,
          'qa_salary_after_12_months': salary * 2.7,
          'qa_salary_after_1.5_year': salary * 3.3,
          'qa_salary_after_3.5_years': salary * 3.8,
          'person': {'u_name': [user_name, salary, age],
                     'u_age': age,
                     'u_salary_5_years': salary * 4.2}
          }
```
***EP_5***
Method: `GET`
EndPoint: `/object_info_3`
request url params: 
 `name: str`
 `age: int`
 `salary: int`  
response:  
```sh
{'name': name,
          'age': age,
          'salary': salary,
          'family': {'children': [['Alex', 24], ['Kate', 12]],
                     'pets': {'cat':{'name':'Sunny',
                                     'age': 3},
                              'dog':{'name':'Luky',
                                     'age': 4}},
                     'u_salary_1_5_year': salary * 4}
          }
```
***EP_6***
Method: `GET`
EndPoint: `/object_info_4`
request url params: 
 `name: str`
 `age: int`
 `salary: int`      
response:  
```sh 
{'name': name,
          'age': int(age),
          'salary': [salary, str(salary * 2), str(salary * 3)]}
```

***EP_7***
Method: `POST`
EndPoint: `/user_info_2`
request form data: 
`name: str`
`age: int`
`salary: int  
response:
```sh 
{'start_qa_salary': salary,
          'qa_salary_after_6_months': salary * 2,
          'qa_salary_after_12_months': salary * 2.7,
          'qa_salary_after_1.5_year': salary * 3.3,
          'qa_salary_after_3.5_years': salary * 3.8,
          'person': {'u_name': [user_name, salary, age],
                     'u_age': age,
                     'u_salary_5_years': salary * 4.2}
          }
```          
## 🚏 Navigate:
[![Flutter](https://img.shields.io/badge/🏠-Postman_BRANCH-00A98F)](https://github.com/Pavlik1100/QA_Practice/tree/Postman)  [![Flutter](https://img.shields.io/badge/🏠-QA_PRACTICE_BANCH-orange)](https://github.com/Pavlik1100/QA_Practice/tree/main)
## 📫 How to reach me:  
[![Flutter](https://img.shields.io/badge/-Pavel_Simonov-000000?style=social&logo=LinkedIn)](https://www.linkedin.com/in/pavel-simonov-7a8b1119a/)  [![Flutter](https://img.shields.io/badge/-Pavel_Simonov-000000?style=social&logo=Telegram)](https://t.me/NuiSaiman)  [![Flutter](https://img.shields.io/badge/-simonovpavlik@gmail.com-000000?style=social&logo=Gmail)](mailto:simonovpavlik@gmail.com)
