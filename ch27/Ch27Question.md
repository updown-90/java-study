# 직접해 봅시다


# 정리해 봅시다
1. java.io.Serializable을 import 하는 이유는 무엇인가요?

   > 생성한 객체를 파일로 저장할 일이 있을수도 있고, 저장한 객체를 읽을 일이 생길수도 있고 객체를 다른서버로 보낼 때도 있고, 다른서버로 보내 생성한 객체를 받을 일도 생길 수 있기 때문에 Serializable 인터페이스를 구현하기 하여 직렬화 역직렬화 하기위해

2. java.io.Serializable의 serialVersionUID 를 지정하는 이유는 무엇인가요?

   > 객체의 버전을 명시하여 객체가 같은지 다른지 확인할 수 있도록 하기 위해서

3. 자바에서 객체를 파일로 읽거나 쓸 때 사용하는 Stream 클래스 이름은 무엇인가요?

   > FileInputStream FileOutputStream

4. transient 예약어의 용도는 무엇인가요?

   > 직렬화 대상에서 제외

5. NIO가 생긴 이유는 무엇인가요?

   > 채널과 버퍼를 사용하여 스트림 기반 I/O의 속도를 개선하기 위해서

6. NIO에서 Channel의 용도는 무엇인가요?

   > 데이터를 중간에 처리

7. NIO에서 Buffer의 용도는 무엇인가요?

   > 데이터를 담는 역할

8. NIO에서 Buffer의 상태를 확인하기 위한 메소드들에는 어떤 것들이 있나요?

   > capacity() limit() position()

9. NIO에서 Buffer의 position을 변경하기 위한 메소드들에는 어떤 것들이 있나요?

   > flip() mark() reset() rewind() remaining() hasRemaining() clear()
