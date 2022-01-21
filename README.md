# notice
공지사항 관리 REST API 구현

0-1. application.properties
DB정보 수정
0-2. init.sql
테이블 create

1. GET http://localhost:8080/notice/list
목록조회
![image](https://user-images.githubusercontent.com/18359068/150550237-93c403c5-5def-4596-9e6f-7d77aa2eccd7.png)

2. POST http://localhost:8080/notice/mani?title=타이틀&cntnt=내용내용&author=작성자는 누구인가?&st_dt=20220122000000&ed_dt=20220122235959
공지사항 등록
![image](https://user-images.githubusercontent.com/18359068/150551028-939831e4-2830-4b86-a384-e9b24e5f9929.png)

3. POST http://localhost:8080/notice/mani?title=타이틀 수정&cntnt=내용내용 수정수정&author=작성자를 수정하였는가?&st_dt=20220122000000&ed_dt=20220122235959&id=11
공지사항 수정
![image](https://user-images.githubusercontent.com/18359068/150551641-a857a428-b393-497e-ad9c-25fec6579042.png)

4. POST http://localhost:8080/notice/mani?id=11&dbsts=D
공지사항 삭제
![image](https://user-images.githubusercontent.com/18359068/150551886-53df92c1-e5a5-4a5e-a948-bf3ed541a5f1.png)

5. POST http://localhost:8080/notice/mani?title=파일있는 타이틀 제목&cntnt=파일있는 컨텐츠 내용내용 냉무아님&author=파일을 등록하는 작성자는 누구인가!&st_dt=20220122000000&ed_dt=20220122235959
여러개 파일 포함 등록
![image](https://user-images.githubusercontent.com/18359068/150552467-1ab73588-6016-4e52-9c11-58abd2a085f3.png)

위 테스트틑 chrome-extension인 Talend API Tester로 진행했습니다.
