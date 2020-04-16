import com.rk.sk.*;

public class Programs {
    public static void main(String[] args) {
        CetakJudul('-', "CONTOH 1: IF", 40);
        If.mainIf(null);
        CetakJudul('-', "CONTOH 2: SWITCH", 40);
        Switch.mainSwitch(null);
        CetakJudul('-', "CONTOH 3: BREAK", 40);
        Break.mainBreak(null);
        CetakJudul('-', "CONTOH 4: CONTINUE", 40);
        Continue.mainContinue(null);
        CetakJudul('-', "CONTOH 5: LABELED BREAK", 40);
        LabeledBreak.mainLbreak(null);
        CetakJudul('-', "CONTOH 6: LABELED CONTINUE", 40);
        LabeledContinue.mainLcontinue(null);
    }

    public static void CetakJudul(char A, String B, int C) {
        for (int i = 0; i <= C; i++) {
            System.out.print(A);
        }
        System.out.println("\n" + B);
        for (int i = 0; i <= C; i++) {
            System.out.print(A);
        }
        System.out.println();
    }
}

