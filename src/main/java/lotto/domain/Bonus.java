package lotto.domain;

import java.util.List;
import java.util.regex.Pattern;

public class Bonus {
    private final int bonusNumber;

    public Bonus(int bonusNumber, Lotto winningLotto) {
        validateBonusDuplication(winningLotto, bonusNumber);
        this.bonusNumber = bonusNumber;
    }
    private void validateBonusDuplication(Lotto winningLotto, int bonusNumber) {
        List<Integer> lottoNumbers =  winningLotto.getLotto();
        if (lottoNumbers.contains(bonusNumber)) {
            System.out.println("[ERROR} 보너스 번호는 담첨 번호에 포함될 수 없습니다.");
            throw new IllegalArgumentException("[ERROR] 잘못된 보너스 번호");
        }
    }

    public static void bonusIsNumeric(String bonusNumber) {
        String pattern = "^[0-9]*$";
        if (!Pattern.matches(pattern, bonusNumber)) {
            System.out.println("[ERROR} 보너스 번호는 양의 정수 형태이어야 합니다.");
            throw new IllegalArgumentException("[ERROR] 잘못된 형식의 보너스 번호");
        }
    }
}
