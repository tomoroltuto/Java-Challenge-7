# 概要
Java-Challenge-7ではHTTPメソッドのGET/POST/PATCH/DELETEのリクエストを扱えるControllerを実装とオリジナルの仕様での実装を行いPostman使用して確認をしました。


* ①Spring Boot設定
* ②GET/POST/PATCH/DELETEのリクエストの実装
* ③オリジナルのリクエストの実装

## ①Spring Boot設定
Spring Bootの設定にはspring initializrを使用して以下の設定しました。


| Project| Gradle Project| 
| :---: | :---: | 
| Language | Java | 
| Spring Boot | 2.7.3 | 
| packing | War| 
| Java | 17 | 
| Dependencies | Spring Web <br> Validation  <br> |

## ②GET/POST/PATCH/DELETEのリクエストの実装

それぞれの実装結果を以下にまとめました。

* GETリクエスト
src/main/java/com/example/javachallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/IndexController.java#L28-L31

リクエストとレスポンスの結果

<img width="1440" alt="1 GETリクエスト" src="https://user-images.githubusercontent.com/90845405/187080707-d5ec8e3a-1d36-4125-8ce0-4fc8052ba767.png">

* POSTリクエスト
src/main/java/com/example/javachallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/IndexController.java#L33-L40
src/main/java/com/example/javachallenge7/Form/CreateForm.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/Form/CreateForm.java#L1-L14

リクエストとレスポンスの結果

<img width="1440" alt="2 POSTリクエスト" src="https://user-images.githubusercontent.com/90845405/187080710-a3fa923f-fad2-4eda-b41b-6e65e9c2cf7b.png">

* PATCHリクエスト
src/main/java/com/example/javachallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/IndexController.java#L42-L45

リクエストとレスポンスの結果

<img width="1440" alt="スクリーンショット 2022-08-30 21 51 02" src="https://user-images.githubusercontent.com/90845405/187684250-24c80249-6ea1-4aa7-a2ef-14d9cf7f4dbe.png">


* DELETEリクエスト
src/main/java/com/example/javachallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/IndexController.java#L47-L50
src/main/java/com/example/javachallenge7/Form/DeleteForm.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/Form/DeleteForm.java#L1-L16

リクエストとレスポンスの結果

<img width="1440" alt="スクリーンショット 2022-08-30 21 50 05" src="https://user-images.githubusercontent.com/90845405/187684566-941761d9-6237-476f-a233-de716a29535f.png">


## ③オリジナルのリクエストの実装

オリジナル(GET/POST)リクエスを実装結果を以下にまとめました。

* GETリクエスト

　　実装内容:クエリ文字列を受け取れるようにする

src/main/java/com/example/javachallenge7/IndexController.java内に以下のコードを作成https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/IndexController.java#L52-L58
src/main/java/com/example/javachallenge7/Form/ProfileForm.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/Form/ProfileForm.java#L1-L21

リクエストとレスポンスの結果 (クエリ文字列をなし)
http://localhost:8080/profile
<img width="1440" alt="5-1 GETリクエスト" src="https://user-images.githubusercontent.com/90845405/187081226-9fe7d606-9168-45a0-858e-91e297b0393f.png">

リクエストとレスポンスの結果 (クエリ文字列をあり)
http://localhost:8080/profile?=user
<img width="1440" alt="5-2 GETリクエスト" src="https://user-images.githubusercontent.com/90845405/187081281-4d733e58-8d3a-4b73-8925-c4f15c1ed364.png">


* POSTリクエスト

    実装内容:バリデーションを使用して以下のことをエラーでるようにしました。

　　　　①idが15以上の場合はエラーとする
　　　　②nameがnull、20文字以上の場合はエラーとする
　　　　③ageが0の場合はエラーとする

src/main/java/com/example/javachallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/IndexController.java#L60-L63

src/main/java/com/example/javachallenge7/Form/UserForm.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/5100b7cbf720b7f1d4b742830c64be343827cc8b/src/main/java/com/example/javachallenge7/Form/UserForm.java#L1-L52

リクエストとレスポンスの結果(正常時)
<img width="1440" alt="6-1 POSTリクエスト" src="https://user-images.githubusercontent.com/90845405/187081517-397417a0-4396-4598-a5e2-30b0a1f676a2.png">

リクエストとレスポンスの結果(異常時)
<img width="1440" alt="6-2 POSTリクエスト" src="https://user-images.githubusercontent.com/90845405/187081527-899b82d5-7dfe-4e15-8f82-b44fda1b8057.png">

<h2>リクエストとレスポンスの結果(異常時のログ)</h2>

```bash
2022-08-28 23:27:24.299  WARN 8713 --- [nio-8080-exec-5] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved 

...

[org.springframework.context.support.DefaultMessageSourceResolvable: codes [userForm.age,age]; arguments []; default 
message [age],1]; default message [1 以上の値にしてください]] 

[Field error in object 'userForm' on field 'id': rejected value [16]; codes [Max.userForm.id,Max.id,Max.int,Max]; arguments 
[org.springframework.context.support.DefaultMessageSourceResolvable: codes [userForm.id,id]; arguments []; default 
message [id],15]; default message [15 以下の値にしてください]]
 
[Field error in object 'userForm' on field 'name': rejected value [segawasegawasegawasegawa]; codes 
[Size.userForm.name,Size.name,Size.java.lang.String,Size]; arguments 
[org.springframework.context.support.DefaultMessageSourceResolvable: codes [userForm.name,name]; arguments []; 
default message [name],20,1]; default message [1 から 20 の間のサイズにしてください]] ]
``` 

# 開発環境
IntelliJ IDEA 2022.2.1 (Community Edition)
