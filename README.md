# Android-App

### 이 저장소는 제가 안드로이드 프로젝트를 진행하며 공부한 내용들입니다. 
### 유용한 부분들을 공유하고 싶어서 올립니다.

* #### 코드참조 : https://webnautes.tistory.com/category/Android/Google%20Map

* * *
>  ## 프로젝트 정리



* ### 앱 이름 : 상인역에서 깨워줘 !
* #### 앱의 목적 : 대중교통 이용시 잠드는 사람들을 깨워주는 알람어플

> 동작메커니즘
 
1.Google Maps Android API (Application Programming Interface) 사용
 --> API키를 받아서 사용하였습니다.
 
2.위치정보 시스템 GPS를 이용하여 현재위치를 계속해서 잡아줍니다.

3.마커(목적지)추가시 현재위치와 마커(목적지)사이의 거리를 ComputeDistanceBetween함수를 사용하여계산합니다.

4.내가 지정한 거리 (ex. 거리를 500m로 지정) 안으로 들어오면 휴대폰으로 경보음과 진동이 울리며 이용자에게 도착이 임박했음을 알려줍니다.

* * *

* ### 프로젝트에 사용한 주요함수
함수명 | 의미 |
---|:---:
`Handler` | Main Thread의 MessageQueue에 작업을 전달하는 객체
`Intent` | 다른 액티비티를 띄우거나 기능을 동작시키기 위한 수단
`setContentView` | xml 파일을 읽어 전체화면을 보여주는 메소드
`TextView` | 안드로이드 UI를 구성함에 있어 화면에 텍스트를 표시하는 기능.
`Toast.makeText` | 토스트 메세지라고 불리는 팝업을 띄움.
`MediaPlayer` | 오디오와 비디오를 가져오고 디코딩 및 재생하는 것을 최소한의 설정으로 가능하게 해주는 객체
`Marker` | 구글맵에서 마커를 생성할수 있게 해주는 객체
`LocationRequest` | 안드로이드 위치기반서비스를 사용하기 위해 필요한 class
`Vibrator` | 안드로이드의 진동기능을 사용하기 위해 필요한 객체
`setOnClickListener` | 안드로이드 위젯의 이벤트를 처리하는 방법 중 한가지


> #### 결과물
* ### 로딩화면
![default](https://user-images.githubusercontent.com/44973398/48718124-206e9880-ec5e-11e8-8d86-1fe15bd2934e.jpg)
* #### 구글맵을 이용하여 목적지와의 거리측정중
![default](https://user-images.githubusercontent.com/44973398/48718230-4a27bf80-ec5e-11e8-99df-a06a1a9d65ec.jpg)

* #### 거리측정하는 코드
![default](https://user-images.githubusercontent.com/44973398/48901299-4aab9a80-ee98-11e8-851d-b537de0fd912.PNG)

* #### 설정범위 안에 들어왔을때의 코드
![default](https://user-images.githubusercontent.com/44973398/48901319-66af3c00-ee98-11e8-89e8-484e12af3781.PNG)

* #### 목적지 도착시 알람과 진동이 울리는 모습
![default](https://user-images.githubusercontent.com/44973398/48718240-5449be00-ec5e-11e8-9d20-6b38e9e3760e.jpg)

* #### GPS활성화 여부 판단 코드
![gps](https://user-images.githubusercontent.com/44973398/48901335-7a5aa280-ee98-11e8-88f7-f2b1621b6f6f.PNG)
