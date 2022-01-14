#!/bin/bash
mkdir fold
cd "fold"
mkdir {00..02}
cd 00
touch 01.txt 02.txt 03.txt 04.json 05.json
mkdir fold1 fold2 fold3
ls -la
mv -v 04.json 05.json fold3
