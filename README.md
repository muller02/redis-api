## Description
Bottletalk의 User id, gender, birthYear를 담아두는 캐시인 Redis를 사용할 수 있는 api입니다. <br/>
배포 시 같은 VPC 내의 AWS ElastiCache Redis OSS를 연결하지만, 로컬에서 테스트할 경우 Docker를 사용합니다.

1. 로컬 테스트용 redis-docker <br/>
https://github.com/Himedia-CLDS/ELK-stack/tree/redis

2. bootrun

```
    git clone
    cd redis-api/
    ./gradlew build
    ./gradlew bootrun
```
  
3. api method

   | 메서드 | URL                                                    | 설명             |
   |-----|--------------------------------------------------------|----------------|
   | GET | /redis/hasKey?userId=                     | 키값 존재유무 확인   |
   | GET | /redis/getKey?userId=               | 키값 꺼내기   |
   | POST |/redis/setKey                |키&밸류 세팅|
