# Linux Terminal/GitBash commands [Составные команды Git и запись логов](https://github.com/Pavlik1100/GitBash-Practice_Linux_Terminal_commands/tree/main/added_new_skill)

1) Посмотреть где я `pwd`
2) Создать папку `mkdir new_folder`
3) Зайти в папку `cd new_folder`
4) Создать 3 папки `mkdir folder_1 folder_2 folder_3` или `mkdir {0..2}`
5) Зайти в любоую папку `cd folder_2`
6) Создать 5 файлов (3 txt, 2 json) `touch 1.txt 2.txt 3.txt 4.json 5.json`
7) Создать 3 папки `mkdir dir_1 dir_2 dir_3`
8) Вывести список содержимого папки `la -la`
9) Открыть любой txt файл `vim 1.txt`
10) Написать туда что-нибудь, любой текст `в открытом редакторе vim нажимаю клавишу "i" чтобы начать набирать текст`
11) Сохранить и выйти `нажмаю клавишу "esc", ввожу ":wq"`
12) Выйти из папки на уровень выше `cd ..`  
13) переместить любые 2 файла, которые вы создали, в любую другую папку `mv 4.json 5.json dir_1/`
14) скопировать любые 2 файла, которые вы создали, в любую другую папку `cp 1.txt 2.txt dir_2/`
15) Найти файл по имени `find . -name '1.txt'`
16) просмотреть содержимое в реальном времени (команда grep) изучите как она работает  `tail -fn1 1.txt` `grep 2 1.txt` grep ищет строки в файлах, фильтрует вывод коман и др.
17) вывести несколько первых строк из текстового файла `head -n2 1.txt`
18) вывести несколько последних строк из текстового файла `tail -n3 1.txt`
19) просмотреть содержимое длинного файла (команда less) изучите как она работает `less -s 1.txt` 
20) вывести дату и время `date` 
# 
21) Сохранить поток логов за указанную минуту в отдельный файл
```sh
tail -f anything_1.txt | grep --line-buffered 16.08 >> test_log1.txt
```
#
22) Сохранить поток логов за указанную минуту в отдельный файл транслируя ход логов в gitbash
```sh
tail -f anything_1.txt | grep --line-buffered 16.13 >> test_log2.txt | tail -f test_log2.txt
```
[Директория с логами](https://github.com/Pavlik1100/GitBash-Practice_Linux_Terminal_commands/tree/main/added_new_skill)

## Задание *
*1) Отправить http запрос на сервер http://162.55.220.72:5005/object_info_3?name=Vadim&age=32&salary=1000  
```sh
curl "http://162.55.220.72:5005/object_info_3?name=Vadim&age=32&salary=1000"
```
#
*2) Написать скрипт который выполнит автоматически пункты 3, 4, 5, 6, 7, 8, 13 
  
3) Зайти в папку `cd fold`
4) Создать 3 папки `mkdir folder_1 folder_2 folder_3` или `mkdir {0..2}`  
5) Зайти в любоую папку `cd folder_2`  
6) Создать 5 файлов (3 txt, 2 json) `touch 1.txt 2.txt 3.txt 4.json 5.json`  
7) Создать 3 папки `mkdir dir_1 dir_2 dir_3`  
8) Вывести список содержимого папки `la -la`  
13) Переместить любые 2 файла, которые вы создали, в любую другую папку `mv 4.json 5.json dir_1/` 
   
запуск файла "script" с готовым скриптом командой `/.script`
```sh
#!/bin/bash  
mkdir fold
cd fold   
mkdir {00..02}  
cd 00  
touch 01.txt 02.txt 03.txt 04.json 05.json  
mkdir fold1 fold2 fold3  
ls -la  
mv -v 04.json 05.json fold3  
```
[Директория со скриптом](https://github.com/Pavlik1100/theory_and_practice_on_the_course/tree/main/script)

## 🚏 Navigate:
[![Flutter](https://img.shields.io/badge/🏠-GITBASH_BRANCH-00A98F)](https://github.com/Pavlik1100/QA_Practice/tree/GitBash)  [![Flutter](https://img.shields.io/badge/🏠-QA_PRACTICE_BANCH-orange)](https://github.com/Pavlik1100/QA_Practice/tree/main)
## 📫 How to reach me:  
[![Flutter](https://img.shields.io/badge/-Pavel_Simonov-000000?style=social&logo=LinkedIn)](https://www.linkedin.com/in/pavel-simonov-7a8b1119a/)  [![Flutter](https://img.shields.io/badge/-Pavel_Simonov-000000?style=social&logo=Telegram)](https://t.me/NuiSaiman)  [![Flutter](https://img.shields.io/badge/-simonovpavlik@gmail.com-000000?style=social&logo=Gmail)](mailto:simonovpavlik@gmail.com)
