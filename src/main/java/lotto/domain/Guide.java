package lotto.domain;

import java.util.List;


public class Guide {
    public static void printGetMoney() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public static void printGetLottoCount(int LottoCount) {
        System.out.println("\n" + Integer.toString(LottoCount) + "개를 구매했습니다.");
    }

    public static void printGetWinningNumber() {
        System.out.println("\n당첨 번호를 입력해 주세요.");
    }

    public static void printGetBonusNumber() {
        System.out.println("\n보너스 번호를 입력해 주세요.");
    }

    public static void printBoughtLottoList(List<Lotto> boughtLotto) {
        for (Lotto lotto : boughtLotto) {
            System.out.println(lotto.getLotto());
        }
    }


}
