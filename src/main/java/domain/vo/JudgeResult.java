package domain.vo;

import java.awt.*;

public class JudgeResult {
    Color[] result;

    public JudgeResult(int size) {
        this.result = new Color[size];
    }

    public void setColor(int idx, Color color) {
        this.result[idx] = color;
    }
}
