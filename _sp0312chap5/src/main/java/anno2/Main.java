package anno2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import anno1.MyAnnotation;

public class Main {

	public static void main (String [] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
//		Target ta = new Target();
//		ta.sub(); // 아래쪽 바로 4줄과 같은 코드 이 두 코드는 같은 폴더내에 데이터가 있어야함
		
		String className = "anno2.Target"; // 이 4줄은 라이브러리등에 있으니 그걸 가져오는 코드임
		Class<?> cls = Class.forName(className);
		Target a = (Target) cls.getDeclaredConstructor().newInstance();
		a.sub();
		
		Method[] methods = cls.getDeclaredMethods()	;
		for (int i = 0; i<methods.length; i++) {
			if (methods[i].isAnnotationPresent(MyAnno.class)) {
				MyAnno myAnno = methods[i].getAnnotation(MyAnno.class);
				System.out.println(myAnno.value());
			}
		

        if(methods[i].isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation=
            		methods[i].getDeclaredAnnotation(MyAnnotation.class);
            String value=annotation.value();
            System.out.println(methods[i].getName() + ":" + value);
        }
    }
		//특정 메소드 어노테셔인 가져오기 가능
//		Method method = Target.class.getMethod("sub");
//		Annotation [] annotations = method.getDeclaredAnnotations()	;
//		
//		for(Annotation anno : annotations) {
//			MyAnno myAnno = (MyAnno) anno;
//			System.out.println(myAnno.value());
//		}
//		
	}
}
