package sec04.exam01;

import java.util.Scanner;

public class Member {
    Scanner scan = new Scanner(System.in);

    boolean login(String[] ids, String[] passwords) {
        System.out.print("아이디: ");
        String inputId = scan.nextLine();

        for (int i = 0; i < ids.length; i++) {
            if (inputId.equals(ids[i])) {
                System.out.print("비밀번호: ");
                String inputPassword = scan.nextLine();

                if (inputPassword.equals(passwords[i])) {
                    System.out.println("로그인 성공");
                    return true;
                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                    return false;
                }
            }
        }

        System.out.println("존재하지 않는 아이디입니다.");
        return false;
    }

    
}

