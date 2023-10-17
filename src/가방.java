import java.util.ArrayList;

public class 가방 {
    ArrayList 빨간포션;
    ArrayList 파란포션;
    int 보유한_빨간포션_개수 = 5;
    int 보유한_파란포션_개수 = 5;

    public void 보유한_빨간포션() {
        ArrayList 빨간포션 = new ArrayList();
        빨간포션.add(보유한_빨간포션_개수);
    }
    public void 보유한_파란포션() {
        ArrayList 파란포션 = new ArrayList();
        파란포션.add(보유한_파란포션_개수);
    }
    public void 아이템_체크() {
        System.out.println("빨간포션 개수 -> " + 빨간포션.get(보유한_빨간포션_개수)+ "파란포션 개수 -> " + 파란포션.get(보유한_파란포션_개수));
    }

    public void 버릴_아이템_선택() {
        System.out.println("1.빨간포션 2.파란포션");
        System.out.println("어떤 것을 버릴려고요?");
    }
    public void 물약_버리기(int 버릴_물약_번호_선택) {
        if (버릴_물약_번호_선택 == 1) {
            빨간포션.remove(보유한_빨간포션_개수);
        } else if (버릴_물약_번호_선택 == 2) {
            파란포션.remove(보유한_파란포션_개수);
        } else {
            System.out.println("없는 번호인데요 저한테 왜 그러세요");
        }
    }
    public void 먹기선택() {
        System.out.println("1.빨간포션 2.파란포션");
        System.out.println("어떤 것을 먹으려고요?");
    }
    public void 먹기(int 먹을_물약_번호_선택) {
        if (먹을_물약_번호_선택 == 1) {
            System.out.println("보유한 빨간포션 => " + 빨간포션);
            System.out.println(빨간포션.size()-1);

        } else if (먹을_물약_번호_선택 == 2) {
            System.out.println("보유한 파란포션 => " + 빨간포션);
            System.out.println(파란포션.size()-1);
        } else {
            System.out.println("what");
        }


    }




}
