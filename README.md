# notice
공지사항 관리 REST API 구현
# DB정보 수정
application.properties
# 테이블 create
init.sql
# 목록조회
GET http://localhost:8080/notice/list
![image](https://user-images.githubusercontent.com/18359068/150550237-93c403c5-5def-4596-9e6f-7d77aa2eccd7.png)
# 등록
POST http://localhost:8080/notice/mani?title=타이틀&cntnt=내용내용&author=작성자는 누구인가?&st_dt=20220122000000&ed_dt=20220122235959
![image](https://user-images.githubusercontent.com/18359068/150551028-939831e4-2830-4b86-a384-e9b24e5f9929.png)
# 수정
POST http://localhost:8080/notice/mani?title=타이틀 수정&cntnt=내용내용 수정수정&author=작성자를 수정하였는가?&st_dt=20220122000000&ed_dt=20220122235959&id=11
![image](https://user-images.githubusercontent.com/18359068/150551641-a857a428-b393-497e-ad9c-25fec6579042.png)
# 삭제
POST http://localhost:8080/notice/mani?id=11&dbsts=D
![image](https://user-images.githubusercontent.com/18359068/150551886-53df92c1-e5a5-4a5e-a948-bf3ed541a5f1.png)
# 여러개 파일 포함 등록
POST http://localhost:8080/notice/mani?title=파일있는 타이틀 제목&cntnt=파일있는 컨텐츠 내용내용 냉무아님&author=파일을 등록하는 작성자는 누구인가!&st_dt=20220122000000&ed_dt=20220122235959
![image](https://user-images.githubusercontent.com/18359068/150554277-ad25d1ed-b7b7-4e6c-a59b-699d4324efd5.png)
![image](https://user-images.githubusercontent.com/18359068/150552467-1ab73588-6016-4e52-9c11-58abd2a085f3.png)

위 테스트는 chrome-extension인 Talend API Tester로 진행했습니다.

과제진행의 기회를 주셔서 감사합니다
 - 이재민 드림
