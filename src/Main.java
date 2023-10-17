import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        상점 상점 = new 상점();
        운영채널 게임운영 = new 운영채널();
        Scanner sc = new Scanner(System.in);
        캐릭터 내캐릭터 = new 캐릭터();
        가방 가방 = new 가방();

        while (!게임운영.게임종료) {
            게임운영.메뉴();
            int 메뉴선택 = 게임운영.메뉴_진행(sc.nextInt());
            if (메뉴선택 == 1) {
                상점.상점판매목록();
                int 구매할번호선택 = sc.nextInt();
                상점.구매개수체크();
                int 소모품구매개수 = sc.nextInt();
                상점.구매할_물약(구매할번호선택,소모품구매개수,내캐릭터);
            } else if (메뉴선택 == 2) {
                가방.아이템_체크();
            } else if (메뉴선택 == 3) {
                가방.버릴_아이템_선택();
                int 버릴_물약_번호_선택 = sc.nextInt();
                가방.물약_버리기(버릴_물약_번호_선택);
            } else if (메뉴선택 == 4) {
                가방.먹기선택();
                int 먹을_물약_번호선택 = sc.nextInt();
                가방.먹기(먹을_물약_번호선택);
            }
        }
    }
}