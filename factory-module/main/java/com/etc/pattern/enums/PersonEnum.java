package com.etc.pattern.enums;

/**
 * 人员类别
 */
public enum PersonEnum {
    MAN("男"),
    WOMAN("女");
    /**
     * 性别
     */
    private String sex;

    PersonEnum(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
