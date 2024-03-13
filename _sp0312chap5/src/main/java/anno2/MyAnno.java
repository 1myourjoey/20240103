package anno2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
// 적용 대상은 method
@Retention(RetentionPolicy.RUNTIME)
// 유지정책은 runtime. 컴파일 이후에도 JVM이 참조
public @interface MyAnno {
	//String 타입으로 사용 가능
	public String value();
	
}
