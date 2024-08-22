## Description
Bottletalk의 User id, gender, birthYear를 담아두는 캐시인 Redis를 사용할 수 있는 api입니다. <br/>
배포 시 같은 VPC 내의 AWS ElastiCache Redis OSS를 연결하지만, 로컬에서 테스트할 경우 Docker를 사용합니다.

## Run
1. 로컬 테스트용 docker-redis <br/>
https://github.com/Himedia-CLDS/docker-redis

2. test & bootrun

```
    git clone
    cd redis-api/
    ./gradlew build
    ./gradlew bootrun
```
  

<br/>
Swagger API Yaml :  https://github.com/Himedia-CLDS/redis-api/blob/main/openapi.yaml <br/><br/>

![asdasd](https://github.com/user-attachments/assets/3895c5e9-a4ba-4768-9b01-114fbec638f3)
