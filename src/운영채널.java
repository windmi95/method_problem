public class 운영채널 {
    boolean 게임종료 = false;
    public void 메뉴() {
        System.out.println("==================================메뉴==================================");
        System.out.println("1.상점 가기. 2. 가방 아이템 개수 확인하기. 3. 아이템 버리기. 4. 아이템 먹기");
    }
    public int 메뉴_진행(int 메뉴선택) {
        switch (메뉴선택) {
            case 1:
                System.out.println("상점 이동");
                break;
            case 2:
                System.out.println("가방 아이템 개수 확인");
                break;
            case 3:
                System.out.println("아이템 버리기");
                break;
            case 4:
                System.out.println("아이템 먹기");
                break;
        }
        return 메뉴선택;
    }

}
