# redis-api

1. resources/redis-host.yml
```
  redis:
    host: "localhost"
    port: "6379"
```

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

4. api 작동
   ```
     GET /redis/hasKey?userId=  /  return Boolean
     GET /redis/hasKey?userId=      / return UserDTO
     POST /redis/setKey      / return Boolean
   ```
