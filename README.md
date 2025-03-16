## Getting Started

알고리즘 풀이
----
mac 파일이름 일괄 변경
#!/bin/bash

# 사용자로부터 기본 파일 이름 입력 받기
read -p "파일 이름을 입력하세요: " baseName

# 현재 폴더에서 파일 이름 변경
count=0
for f in *; do
    if [[ -f "$f" && "$f" != *.bat ]]; then
        # 3자리 숫자로 포맷팅
        newName=$(printf "%s_%03d" "$baseName" "$count")
        mv "$f" "$newName${f##*.}"
        ((count++))
    fi
done

-+

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

 <img src="https://img.shields.io/badge/Algo-3178C6?style=flat&logo=Microsoft Azure&logoColor=white"/>
 
The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
