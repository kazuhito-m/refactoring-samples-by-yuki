# カンペ

## はじめてのGit

    https://speakerdeck.com/tanakahisateru/hazimetefalsegit-number-gitkyoto#stargazers

## 開発例

### コマンド

+ コミット履歴をワンライナーで見る : git log --oneline
+ 最新のコミットまで戻す： git reset --hard HEAD
+ マージ :  git merge "branchmei"
+ マージツール : git mergetool
+ 歴史改変: git rebase -i HEAD~3
+ 歴史末梢: git reset --hard HEAD~2

### シナリオ

0. コンパイルエラー直す
0. リファクタリング用ブランチ切る
0. リファクタリングする(リズムと単位を見せる)
0. コミットをまとめる。
0. masterに戻ってファイルを足す。(別の章のソース(コンパイルエラーあり)とか)
0. mergeする(ここでは問題ない)
0. ブランチを削除する
0. ブランチを追加する。(memo.txt改変用のなんかわかりやすい名前)
0. 別ディレクトリに置いたmasterを変更(memo.txtとかを)
0. ブランチ側からマージをしようとしたときにコンフリクトする
0. git mergetoolで競合を整える。
0. 何個かのcommitを取り消す
0. プッシュする

### git-svnでチェックアウト＆コミット＆svnプッシュデモ

#### コマンド

    git svn clone -s "URL"
    git svn dcommit
    git svn rebase


※今後どうする？

いろいろ考えた結果…「お金勿体無い！」ってことで、サイト見たらいんじゃね？

    http://d.hatena.ne.jp/toromoti/20. 40. 20. 1392889776

の二つ程度。
プラス

    https://github.com/Shinpeim/introduction-to-git
    http://www.slideshare.net/matsukaz/git-2830. 397
    http://git-scm.com/book/ja

とかかなぁ？ (さるでもわかる…がプロキシに封じられているのが痛い)

要は"怖くない"が分ってくれたら、それで満たしている気がしている。

### 目的

+ 「雰囲気」と「できること」の把握
    
    + 「コマンドを記憶」とかする必要なし

### 今後どうする？

0. 続ける

  0. Webサイトを使って持ち回り
  0. 本を使って持ち回り
  0. その他・別解

0. やめる

  0. 他の本を持ち回りで
   
   ->検討要

### 何やる？

  ☆5人- 1.Wicketの勉強

  4人- 4.テスト

  3人- 2.モデリングの勉強(クラス設計)

  0. - 3.ドメイン駆動設計

### 宿題
  ・材料集め(20. 4/0. /18(木))
