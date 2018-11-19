# Android-App

### 이 저장소는 제가 안드로이드 프로젝트를 진행하며 공부한 내용들입니다. 
### 유용한 부분들을 공유하고 싶어서 올립니다.

#### 코드참조 : https://webnautes.tistory.com/category/Android/Google%20Map

#### 프로젝트 정리 ↓↓↓↓

### -----------------------------------------------------------------------------------------

### 앱 이름 : 상인역에서 깨워줘 !
#### 앱의 목적 : 대중교통 이용시 잠드는 사람들을 깨워주는 알람어플

 동작메커니즘
 
1.Google Maps Android API (Application Programming Interface) 사용
 --> API키를 받아서 사용하였습니다.
 
2.위치정보 시스템 GPS를 이용하여 현재위치를 계속해서 잡아줍니다.

3.마커(목적지)추가시 현재위치와 마커(목적지)사이의 거리를 ComputeDistanceBetween함수를 사용하여계산합니다.

4.내가 지정한 거리 (ex. 거리를 500m로 지정) 안으로 들어오면 휴대폰으로 경보음과 진동이 울리며 이용자에게 도착이 임박했음을 알려줍니다.

#### 결과물  ↓↓↓↓
#### 1.로딩화면
![default](https://user-images.githubusercontent.com/44973398/48718124-206e9880-ec5e-11e8-8d86-1fe15bd2934e.jpg)
#### 2.구글맵을 이용하여 목적지와의 거리측정중
![default](https://user-images.githubusercontent.com/44973398/48718230-4a27bf80-ec5e-11e8-99df-a06a1a9d65ec.jpg)
#### 3.목적지 도착시 알람과 진동이 울리는 모습
![default](https://user-images.githubusercontent.com/44973398/48718240-5449be00-ec5e-11e8-9d20-6b38e9e3760e.jpg)
