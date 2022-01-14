## Написать скрипт который выполнит автоматически пункты 3, 4, 5, 6, 7, 8, 13  
[основное задание](https://github.com/Pavlik1100/theory_and_practice_on_the_course)  
  
3) Зайти в папку `cd fold`
4) Создать 3 папки `mkdir folder_1 folder_2 folder_3` или `mkdir {0..2}`  
5) Зайти в любоую папку `cd folder_2`  
6) Создать 5 файлов (3 txt, 2 json) `touch 1.txt 2.txt 3.txt 4.json 5.json`  
7) Создать 3 папки `mkdir dir_1 dir_2 dir_3`  
8) Вывести список содержимого папки `la -la`  
13) Переместить любые 2 файла, которые вы создали, в любую другую папку `mv 4.json 5.json dir_1/`  
#
запуск файла "script.sc" с готовым скриптом командой `/.script.sc`
```sh
#!/bin/bash 
mkdir fold
cd "fold"   
mkdir {00..02}  
cd 00  
touch 01.txt 02.txt 03.txt 04.json 05.json  
mkdir fold1 fold2 fold3  
ls -la  
mv -v 04.json 05.json fold3  
```
