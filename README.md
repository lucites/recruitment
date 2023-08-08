# 準備
## fork
本リポジトリをforkしてください。

## java
java11をインストールしてください。

## import project
IDEを使う場合は、gradle projectをインポートしてください。

## run
gradleでbootRunタスクを実行してください。http://localhost:8080 でアクセスできます。
IDEを使って実行しても構いません。

# question
Q1:このアプリで定義されているAPIのパス、パラメーター名と型を記載してください。

A1: パス: /skillCheck
パラメーター:
name: String
age: Integer

Q2:Q1のAPIを実行した場合のレスポンス(一例)を教えて下さい

A2:
```json
[
  {
    "name": "kazumasa yamada",
    "age": 44,
    "hasSkill": false
  }
]
```
Q3:このアプリで例外が発生するパターンのAPIのパス、パラメーター名と値を記載してください。

A3: パス: /skillCheck
パラメーター: age=91

Q4:Q1のAPIでhasSkill=trueを指定した際にどういうレスポンスになるか記載してください。

```json
[
  {
    "name": "taro yamada",
    "age": 28,
    "hasSkill": true
  },
  {
    "name": "shiori yamada",
    "age": 24,
    "hasSkill": true
  },
  {
    "name": "sho yamada",
    "age": 38,
    "hasSkill": false
  },
  {
    "name": "kazumasa yamada",
    "age": 44,
    "hasSkill": false
  }
]
```
hasSkillの値に関わらず結果に含まれる

Q5:Q1のAPIでhasSkill=trueをSkillCheckService.java内のコメントに記載された想定どおり動作させるために必要な修正を加え、forkしたリポジトリにpushして、リポジトリのURLを回答してください。
