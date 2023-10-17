public class 상점 {
    int 빨간포션 = 500;
    int 파란포션 = 500;

    public void 상점판매목록(){
        System.out.println("1.빨간 포션 2.파란 포션");
        System.out.println("머 사세유?");
    }
    public void 구매개수체크() {
        System.out.println("몇 개 필요함?");
    }
    public void 구매할_물약(int 구매할번호선택, int 구매개수,캐릭터 게임캐릭터) {
        if(구매할번호선택 == 1) {
            System.out.println("현재 보유한 골드 -> "+게임캐릭터.보유한_똔);
            int 총금액 = this.빨간포션 * 구매개수;
            if (게임캐릭터.보유한_똔 >= 총금액) {
                게임캐릭터.보유한_똔 = 게임캐릭터.보유한_똔  - this.빨간포션*구매개수;
            } else {
                System.out.println("돈 없네 못 사요");
            }
        } else if (구매할번호선택 == 2) {
            System.out.println("현재 보유한 골드 -> "+게임캐릭터.보유한_똔);
            int 총금액 = this.파란포션 * 구매개수;
            if (게임캐릭터.보유한_똔 >= 총금액) {
                게임캐릭터.보유한_똔 = 게임캐릭터.보유한_똔  - this.파란포션*구매개수;
            } else {
                System.out.println("돈 없네 못 사요");
            }
        }

    }

}
