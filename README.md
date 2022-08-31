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
src/main/java/com/example/JavaChallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/IndexController.java#L19-L22

リクエストとレスポンスの結果

<img width="1440" alt="1 GETリクエスト" src="https://user-images.githubusercontent.com/90845405/187080707-d5ec8e3a-1d36-4125-8ce0-4fc8052ba767.png">

* POSTリクエスト
src/main/java/com/example/JavaChallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/IndexController.java#L24-L31
src/main/java/com/example/JavaChallenge7/From/CreateForm.javaに以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/From/CreateForm.java#L1-L15

リクエストとレスポンスの結果

<img width="1440" alt="2 POSTリクエスト" src="https://user-images.githubusercontent.com/90845405/187080710-a3fa923f-fad2-4eda-b41b-6e65e9c2cf7b.png">

* PATCHリクエスト
src/main/java/com/example/JavaChallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/IndexController.java#L32-L35
src/main/java/com/example/JavaChallenge7/From/UpdateForm.java内に以下のコードを作成https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/From/UpdateForm.java#L1-L15

リクエストとレスポンスの結果

<img width="1440" alt="3 PATCHリクエスト" src="https://user-images.githubusercontent.com/90845405/187080720-8629c1ab-909a-4242-9ab0-a0b8376d3238.png">

* DELETEリクエスト
src/main/java/com/example/JavaChallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/IndexController.java#L37-L40
src/main/java/com/example/JavaChallenge7/From/DeleteFrom.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/From/DeleteFrom.java#L1-L13

リクエストとレスポンスの結果

<img width="1440" alt="4 DELETEリクエスト" src="https://user-images.githubusercontent.com/90845405/187080726-4edf3fa9-f708-4615-ad6f-59afae33b7a4.png">

## ③オリジナルのリクエストの実装

オリジナル(GET/POST)リクエスを実装結果を以下にまとめました。

* GETリクエスト

　　実装内容:クエリ文字列を受け取れるようにする

src/main/java/com/example/JavaChallenge7/IndexController.java内に以下のコードを作成https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/IndexController.java#L42-L48
src/main/java/com/example/JavaChallenge7/From/ProfileForm.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/From/ProfileForm.java#L1-L21

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

src/main/java/com/example/JavaChallenge7/IndexController.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/IndexController.java#L50-L53

src/main/java/com/example/JavaChallenge7/From/UserForm.java内に以下のコードを作成
https://github.com/tomoroltuto/Java-Challenge-7/blob/22a6cdf40adfa18ecf5bda0c37145a841d693c13/src/main/java/com/example/JavaChallenge7/From/UserForm.java#L1-L52

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
