package com.pig4cloud.pigx.codegen.common;


/**
 * 异常枚举值
 *
 */
public enum Exceptions {

    None(200, "无异常"),
    UnknownException(1, "未知异常"),
    APIError(-1,"API错误"),
    BusinessError(-10,"业务通用异常,不可直接使用");


    private int value;
    private String label;
    Exceptions(int value, String label){
        this.value = value;
        this.label = label;
    }
    /**
     * 获取枚举变量对应的数值
     * @return
     */
    public int getValue() {
        return value;
    }
    /**
     * 获取枚举变量对应的提示信息
     * @return
     */
    public String getLabel() {
        return label;
    }

    public Exceptions setLabel(String label) {
        this.label = label;
        return this;
    }

    public boolean isValid(){
        return this.value == Exceptions.None.getValue();
    }


    public int getCode() {
        return value;
    }

    /**
     * 通过数值获取枚举对象
     * @param value
     * @return
     */
    public static Exceptions parse(int value){
        Exceptions type = Exceptions.UnknownException;
        for(Exceptions t: Exceptions.values()){
            if(value == t.getValue()){
                type = t;
                break;
            }
        }
        return type;
    }


    @Override
    public String toString() {
        return this.getLabel();
    }
}