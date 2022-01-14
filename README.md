# HW_2-Practice_GitHub
GitHub. HW_2
1. На локальном репозитории сделать ветки для:
- Postman
- Jmeter
- CheckLists
- Bag Reports
- SQL
- Charles
- Mobile testing
```sh
git branch Postman
git branch Jmeter
git branch CheckList
git branch Bag_Reports
git branch SQL
git branch Charles
git branch Mobile_Testing
```

2. Запушить все ветки на внешний репозиторий
```sh
git push origin -all
```
3. В ветке Bag Reports сделать текстовый документ со структурой баг репорта
```sh
git checkout Bag_Reports
touch bag_1.txt
vim bag_1.txt
```
`press "i" for iinsert`  
```sh
id:             {       }

title:          {       }

steps:          {       }

AR:             {       }

ER:             {       }

severity:       {       }
```  
`press "esc", pres after ":wq", press "enter"`  
  
4. Запушить структуру багрепорта на внешний репозиторий
```sh
git add .
git commit -m "create bag_1.txt"
git push origin Bag_Reports
```
5. Вмержить ветку Bag Reports в Main
```sh
git checkout main
git merge Bag_Reports
```
6. Запушить main на внешний репозиторий.
```sh
git push
```
8. В ветке CheckLists набросать структуру чек листа.
```sh
git checkout CheckLists
touch checklist.txt
vim checklist.txt
```
`press "i" for iinsert`  
```sh
1. Open web-page
2. Enter user information
3. Click button "loggin"
4. Open setting profile
5. Change surname
6. Save chages
```  
`press "esc", pres after ":wq", press "enter"`  

9. Запушить структуру на внешний репозиторий
```sh
git add .
git commit -m "checklist.txt"
git push origin CheckList
```
10. На внешнем репозитории сделать Pull Request ветки CheckLists в main  `в вебе  выбрать "Pull requests"` -> `нажат  кнопку "New pull request"` -> `выбрать правильную комбинцию веток "main <- Checklists"` -> `нажать кнрпку "Create pullrequest"` -> `оставить коммит и нажать на кнопку "Create pullrequest"` -> `нажать кнопку "merge pull request" убедившись в отсутствии конфликтов` -> `подтвердить merge`
11. Синхронизировать Внешнюю и Локальную ветки Main
```sh
git remote add  origin https://github.com/Pavlik1100/HW_2-Practice_GitHub.git
git pull
git pull origin main
```
## 🚏 Navigate:
[![Flutter](https://img.shields.io/badge/🏠-GITHUB_BRANCH-00A98F)](https://github.com/Pavlik1100/QA_Practice/tree/GitHub)  [![Flutter](https://img.shields.io/badge/🏠-QA_PRACTICE_BANCH-orange)](https://github.com/Pavlik1100/QA_Practice/tree/main)
## 📫 How to reach me:  
[![Flutter](https://img.shields.io/badge/-Pavel_Simonov-000000?style=social&logo=LinkedIn)](https://www.linkedin.com/in/pavel-simonov-7a8b1119a/)  [![Flutter](https://img.shields.io/badge/-Pavel_Simonov-000000?style=social&logo=Telegram)](https://t.me/NuiSaiman)  [![Flutter](https://img.shields.io/badge/-simonovpavlik@gmail.com-000000?style=social&logo=Gmail)](mailto:simonovpavlik@gmail.com)
