package com.example.form.enums;

/**
 * TODO
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 16:44
 */
public enum FormType {
    // 问卷
    QUESTIONNAIRE(0),
    // 投票
    VOTE(1),
    // 流程表单
    PROCESS(2),
    // 试卷
    PAPER(3);
    private final int type;


    FormType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
